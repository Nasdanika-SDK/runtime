/**
 */
package org.nasdanika.sdk.runtime.models.typescript.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.typescript.Accessor;
import org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Callable;
import org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Constructor;
import org.nasdanika.sdk.runtime.models.typescript.Declaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumMember;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Member;
import org.nasdanika.sdk.runtime.models.typescript.Method;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueMember;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;
import org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;

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
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage
 * @generated
 */
public class TypescriptSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypescriptPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypescriptSwitch() {
		if (modelPackage == null) {
			modelPackage = TypescriptPackage.eINSTANCE;
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
			case TypescriptPackage.TYPE_SCRIPT_ELEMENT: {
				TypeScriptElement typeScriptElement = (TypeScriptElement)theEObject;
				T result = caseTypeScriptElement(typeScriptElement);
				if (result == null) result = caseNamedElement(typeScriptElement);
				if (result == null) result = caseModelElement(typeScriptElement);
				if (result == null) result = caseStringIdentity(typeScriptElement);
				if (result == null) result = caseDocumented(typeScriptElement);
				if (result == null) result = caseMarked(typeScriptElement);
				if (result == null) result = caseReferrable(typeScriptElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.PACKAGE: {
				org.nasdanika.sdk.runtime.models.typescript.Package package_ = (org.nasdanika.sdk.runtime.models.typescript.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseTypeScriptElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseStringIdentity(package_);
				if (result == null) result = caseDocumented(package_);
				if (result == null) result = caseMarked(package_);
				if (result == null) result = caseReferrable(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.MODULE: {
				org.nasdanika.sdk.runtime.models.typescript.Module module = (org.nasdanika.sdk.runtime.models.typescript.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseTypeScriptElement(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseStringIdentity(module);
				if (result == null) result = caseDocumented(module);
				if (result == null) result = caseMarked(module);
				if (result == null) result = caseReferrable(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseTypeScriptElement(import_);
				if (result == null) result = caseNamedElement(import_);
				if (result == null) result = caseModelElement(import_);
				if (result == null) result = caseStringIdentity(import_);
				if (result == null) result = caseDocumented(import_);
				if (result == null) result = caseMarked(import_);
				if (result == null) result = caseReferrable(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.IMPORT_BINDING: {
				ImportBinding importBinding = (ImportBinding)theEObject;
				T result = caseImportBinding(importBinding);
				if (result == null) result = caseTypeScriptElement(importBinding);
				if (result == null) result = caseNamedElement(importBinding);
				if (result == null) result = caseModelElement(importBinding);
				if (result == null) result = caseStringIdentity(importBinding);
				if (result == null) result = caseDocumented(importBinding);
				if (result == null) result = caseMarked(importBinding);
				if (result == null) result = caseReferrable(importBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseTypeScriptElement(typeReference);
				if (result == null) result = caseNamedElement(typeReference);
				if (result == null) result = caseModelElement(typeReference);
				if (result == null) result = caseStringIdentity(typeReference);
				if (result == null) result = caseDocumented(typeReference);
				if (result == null) result = caseMarked(typeReference);
				if (result == null) result = caseReferrable(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.PRIMITIVE_TYPE_REFERENCE: {
				PrimitiveTypeReference primitiveTypeReference = (PrimitiveTypeReference)theEObject;
				T result = casePrimitiveTypeReference(primitiveTypeReference);
				if (result == null) result = caseTypeReference(primitiveTypeReference);
				if (result == null) result = caseTypeScriptElement(primitiveTypeReference);
				if (result == null) result = caseNamedElement(primitiveTypeReference);
				if (result == null) result = caseModelElement(primitiveTypeReference);
				if (result == null) result = caseStringIdentity(primitiveTypeReference);
				if (result == null) result = caseDocumented(primitiveTypeReference);
				if (result == null) result = caseMarked(primitiveTypeReference);
				if (result == null) result = caseReferrable(primitiveTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.NAMED_TYPE_REFERENCE: {
				NamedTypeReference namedTypeReference = (NamedTypeReference)theEObject;
				T result = caseNamedTypeReference(namedTypeReference);
				if (result == null) result = caseTypeReference(namedTypeReference);
				if (result == null) result = caseTypeScriptElement(namedTypeReference);
				if (result == null) result = caseNamedElement(namedTypeReference);
				if (result == null) result = caseModelElement(namedTypeReference);
				if (result == null) result = caseStringIdentity(namedTypeReference);
				if (result == null) result = caseDocumented(namedTypeReference);
				if (result == null) result = caseMarked(namedTypeReference);
				if (result == null) result = caseReferrable(namedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.ARRAY_TYPE_REFERENCE: {
				ArrayTypeReference arrayTypeReference = (ArrayTypeReference)theEObject;
				T result = caseArrayTypeReference(arrayTypeReference);
				if (result == null) result = caseTypeReference(arrayTypeReference);
				if (result == null) result = caseTypeScriptElement(arrayTypeReference);
				if (result == null) result = caseNamedElement(arrayTypeReference);
				if (result == null) result = caseModelElement(arrayTypeReference);
				if (result == null) result = caseStringIdentity(arrayTypeReference);
				if (result == null) result = caseDocumented(arrayTypeReference);
				if (result == null) result = caseMarked(arrayTypeReference);
				if (result == null) result = caseReferrable(arrayTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.UNION_TYPE_REFERENCE: {
				UnionTypeReference unionTypeReference = (UnionTypeReference)theEObject;
				T result = caseUnionTypeReference(unionTypeReference);
				if (result == null) result = caseTypeReference(unionTypeReference);
				if (result == null) result = caseTypeScriptElement(unionTypeReference);
				if (result == null) result = caseNamedElement(unionTypeReference);
				if (result == null) result = caseModelElement(unionTypeReference);
				if (result == null) result = caseStringIdentity(unionTypeReference);
				if (result == null) result = caseDocumented(unionTypeReference);
				if (result == null) result = caseMarked(unionTypeReference);
				if (result == null) result = caseReferrable(unionTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.INTERSECTION_TYPE_REFERENCE: {
				IntersectionTypeReference intersectionTypeReference = (IntersectionTypeReference)theEObject;
				T result = caseIntersectionTypeReference(intersectionTypeReference);
				if (result == null) result = caseTypeReference(intersectionTypeReference);
				if (result == null) result = caseTypeScriptElement(intersectionTypeReference);
				if (result == null) result = caseNamedElement(intersectionTypeReference);
				if (result == null) result = caseModelElement(intersectionTypeReference);
				if (result == null) result = caseStringIdentity(intersectionTypeReference);
				if (result == null) result = caseDocumented(intersectionTypeReference);
				if (result == null) result = caseMarked(intersectionTypeReference);
				if (result == null) result = caseReferrable(intersectionTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.LITERAL_TYPE_REFERENCE: {
				LiteralTypeReference literalTypeReference = (LiteralTypeReference)theEObject;
				T result = caseLiteralTypeReference(literalTypeReference);
				if (result == null) result = caseTypeReference(literalTypeReference);
				if (result == null) result = caseTypeScriptElement(literalTypeReference);
				if (result == null) result = caseNamedElement(literalTypeReference);
				if (result == null) result = caseModelElement(literalTypeReference);
				if (result == null) result = caseStringIdentity(literalTypeReference);
				if (result == null) result = caseDocumented(literalTypeReference);
				if (result == null) result = caseMarked(literalTypeReference);
				if (result == null) result = caseReferrable(literalTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.TYPE_LITERAL_REFERENCE: {
				TypeLiteralReference typeLiteralReference = (TypeLiteralReference)theEObject;
				T result = caseTypeLiteralReference(typeLiteralReference);
				if (result == null) result = caseTypeReference(typeLiteralReference);
				if (result == null) result = caseTypeScriptElement(typeLiteralReference);
				if (result == null) result = caseNamedElement(typeLiteralReference);
				if (result == null) result = caseModelElement(typeLiteralReference);
				if (result == null) result = caseStringIdentity(typeLiteralReference);
				if (result == null) result = caseDocumented(typeLiteralReference);
				if (result == null) result = caseMarked(typeLiteralReference);
				if (result == null) result = caseReferrable(typeLiteralReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.FUNCTION_TYPE_REFERENCE: {
				FunctionTypeReference functionTypeReference = (FunctionTypeReference)theEObject;
				T result = caseFunctionTypeReference(functionTypeReference);
				if (result == null) result = caseTypeReference(functionTypeReference);
				if (result == null) result = caseTypeScriptElement(functionTypeReference);
				if (result == null) result = caseNamedElement(functionTypeReference);
				if (result == null) result = caseModelElement(functionTypeReference);
				if (result == null) result = caseStringIdentity(functionTypeReference);
				if (result == null) result = caseDocumented(functionTypeReference);
				if (result == null) result = caseMarked(functionTypeReference);
				if (result == null) result = caseReferrable(functionTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.OPAQUE_TYPE_REFERENCE: {
				OpaqueTypeReference opaqueTypeReference = (OpaqueTypeReference)theEObject;
				T result = caseOpaqueTypeReference(opaqueTypeReference);
				if (result == null) result = caseTypeReference(opaqueTypeReference);
				if (result == null) result = caseTypeScriptElement(opaqueTypeReference);
				if (result == null) result = caseNamedElement(opaqueTypeReference);
				if (result == null) result = caseModelElement(opaqueTypeReference);
				if (result == null) result = caseStringIdentity(opaqueTypeReference);
				if (result == null) result = caseDocumented(opaqueTypeReference);
				if (result == null) result = caseMarked(opaqueTypeReference);
				if (result == null) result = caseReferrable(opaqueTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseTypeScriptElement(declaration);
				if (result == null) result = caseNamedElement(declaration);
				if (result == null) result = caseModelElement(declaration);
				if (result == null) result = caseStringIdentity(declaration);
				if (result == null) result = caseDocumented(declaration);
				if (result == null) result = caseMarked(declaration);
				if (result == null) result = caseReferrable(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T result = caseTypeParameter(typeParameter);
				if (result == null) result = caseTypeScriptElement(typeParameter);
				if (result == null) result = caseNamedElement(typeParameter);
				if (result == null) result = caseModelElement(typeParameter);
				if (result == null) result = caseStringIdentity(typeParameter);
				if (result == null) result = caseDocumented(typeParameter);
				if (result == null) result = caseMarked(typeParameter);
				if (result == null) result = caseReferrable(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.CALLABLE: {
				Callable callable = (Callable)theEObject;
				T result = caseCallable(callable);
				if (result == null) result = caseTypeScriptElement(callable);
				if (result == null) result = caseNamedElement(callable);
				if (result == null) result = caseModelElement(callable);
				if (result == null) result = caseStringIdentity(callable);
				if (result == null) result = caseDocumented(callable);
				if (result == null) result = caseMarked(callable);
				if (result == null) result = caseReferrable(callable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypeScriptElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = caseStringIdentity(parameter);
				if (result == null) result = caseDocumented(parameter);
				if (result == null) result = caseMarked(parameter);
				if (result == null) result = caseReferrable(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.CODE_BLOCK: {
				CodeBlock codeBlock = (CodeBlock)theEObject;
				T result = caseCodeBlock(codeBlock);
				if (result == null) result = caseTypeScriptElement(codeBlock);
				if (result == null) result = caseNamedElement(codeBlock);
				if (result == null) result = caseModelElement(codeBlock);
				if (result == null) result = caseStringIdentity(codeBlock);
				if (result == null) result = caseDocumented(codeBlock);
				if (result == null) result = caseMarked(codeBlock);
				if (result == null) result = caseReferrable(codeBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.INTERFACE_DECLARATION: {
				InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
				T result = caseInterfaceDeclaration(interfaceDeclaration);
				if (result == null) result = caseDeclaration(interfaceDeclaration);
				if (result == null) result = caseTypeScriptElement(interfaceDeclaration);
				if (result == null) result = caseNamedElement(interfaceDeclaration);
				if (result == null) result = caseModelElement(interfaceDeclaration);
				if (result == null) result = caseStringIdentity(interfaceDeclaration);
				if (result == null) result = caseDocumented(interfaceDeclaration);
				if (result == null) result = caseMarked(interfaceDeclaration);
				if (result == null) result = caseReferrable(interfaceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.CLASS_DECLARATION: {
				ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
				T result = caseClassDeclaration(classDeclaration);
				if (result == null) result = caseDeclaration(classDeclaration);
				if (result == null) result = caseTypeScriptElement(classDeclaration);
				if (result == null) result = caseNamedElement(classDeclaration);
				if (result == null) result = caseModelElement(classDeclaration);
				if (result == null) result = caseStringIdentity(classDeclaration);
				if (result == null) result = caseDocumented(classDeclaration);
				if (result == null) result = caseMarked(classDeclaration);
				if (result == null) result = caseReferrable(classDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.TYPE_ALIAS_DECLARATION: {
				TypeAliasDeclaration typeAliasDeclaration = (TypeAliasDeclaration)theEObject;
				T result = caseTypeAliasDeclaration(typeAliasDeclaration);
				if (result == null) result = caseDeclaration(typeAliasDeclaration);
				if (result == null) result = caseTypeScriptElement(typeAliasDeclaration);
				if (result == null) result = caseNamedElement(typeAliasDeclaration);
				if (result == null) result = caseModelElement(typeAliasDeclaration);
				if (result == null) result = caseStringIdentity(typeAliasDeclaration);
				if (result == null) result = caseDocumented(typeAliasDeclaration);
				if (result == null) result = caseMarked(typeAliasDeclaration);
				if (result == null) result = caseReferrable(typeAliasDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.ENUM_DECLARATION: {
				EnumDeclaration enumDeclaration = (EnumDeclaration)theEObject;
				T result = caseEnumDeclaration(enumDeclaration);
				if (result == null) result = caseDeclaration(enumDeclaration);
				if (result == null) result = caseTypeScriptElement(enumDeclaration);
				if (result == null) result = caseNamedElement(enumDeclaration);
				if (result == null) result = caseModelElement(enumDeclaration);
				if (result == null) result = caseStringIdentity(enumDeclaration);
				if (result == null) result = caseDocumented(enumDeclaration);
				if (result == null) result = caseMarked(enumDeclaration);
				if (result == null) result = caseReferrable(enumDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.ENUM_MEMBER: {
				EnumMember enumMember = (EnumMember)theEObject;
				T result = caseEnumMember(enumMember);
				if (result == null) result = caseTypeScriptElement(enumMember);
				if (result == null) result = caseNamedElement(enumMember);
				if (result == null) result = caseModelElement(enumMember);
				if (result == null) result = caseStringIdentity(enumMember);
				if (result == null) result = caseDocumented(enumMember);
				if (result == null) result = caseMarked(enumMember);
				if (result == null) result = caseReferrable(enumMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseDeclaration(functionDeclaration);
				if (result == null) result = caseCallable(functionDeclaration);
				if (result == null) result = caseTypeScriptElement(functionDeclaration);
				if (result == null) result = caseNamedElement(functionDeclaration);
				if (result == null) result = caseModelElement(functionDeclaration);
				if (result == null) result = caseStringIdentity(functionDeclaration);
				if (result == null) result = caseDocumented(functionDeclaration);
				if (result == null) result = caseMarked(functionDeclaration);
				if (result == null) result = caseReferrable(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseDeclaration(variableDeclaration);
				if (result == null) result = caseCallable(variableDeclaration);
				if (result == null) result = caseTypeScriptElement(variableDeclaration);
				if (result == null) result = caseNamedElement(variableDeclaration);
				if (result == null) result = caseModelElement(variableDeclaration);
				if (result == null) result = caseStringIdentity(variableDeclaration);
				if (result == null) result = caseDocumented(variableDeclaration);
				if (result == null) result = caseMarked(variableDeclaration);
				if (result == null) result = caseReferrable(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = caseTypeScriptElement(member);
				if (result == null) result = caseNamedElement(member);
				if (result == null) result = caseModelElement(member);
				if (result == null) result = caseStringIdentity(member);
				if (result == null) result = caseDocumented(member);
				if (result == null) result = caseMarked(member);
				if (result == null) result = caseReferrable(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseMember(property);
				if (result == null) result = caseTypeScriptElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseModelElement(property);
				if (result == null) result = caseStringIdentity(property);
				if (result == null) result = caseDocumented(property);
				if (result == null) result = caseMarked(property);
				if (result == null) result = caseReferrable(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseMember(method);
				if (result == null) result = caseCallable(method);
				if (result == null) result = caseTypeScriptElement(method);
				if (result == null) result = caseNamedElement(method);
				if (result == null) result = caseModelElement(method);
				if (result == null) result = caseStringIdentity(method);
				if (result == null) result = caseDocumented(method);
				if (result == null) result = caseMarked(method);
				if (result == null) result = caseReferrable(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseMember(constructor);
				if (result == null) result = caseTypeScriptElement(constructor);
				if (result == null) result = caseNamedElement(constructor);
				if (result == null) result = caseModelElement(constructor);
				if (result == null) result = caseStringIdentity(constructor);
				if (result == null) result = caseDocumented(constructor);
				if (result == null) result = caseMarked(constructor);
				if (result == null) result = caseReferrable(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.ACCESSOR: {
				Accessor accessor = (Accessor)theEObject;
				T result = caseAccessor(accessor);
				if (result == null) result = caseMember(accessor);
				if (result == null) result = caseCallable(accessor);
				if (result == null) result = caseTypeScriptElement(accessor);
				if (result == null) result = caseNamedElement(accessor);
				if (result == null) result = caseModelElement(accessor);
				if (result == null) result = caseStringIdentity(accessor);
				if (result == null) result = caseDocumented(accessor);
				if (result == null) result = caseMarked(accessor);
				if (result == null) result = caseReferrable(accessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypescriptPackage.OPAQUE_MEMBER: {
				OpaqueMember opaqueMember = (OpaqueMember)theEObject;
				T result = caseOpaqueMember(opaqueMember);
				if (result == null) result = caseMember(opaqueMember);
				if (result == null) result = caseTypeScriptElement(opaqueMember);
				if (result == null) result = caseNamedElement(opaqueMember);
				if (result == null) result = caseModelElement(opaqueMember);
				if (result == null) result = caseStringIdentity(opaqueMember);
				if (result == null) result = caseDocumented(opaqueMember);
				if (result == null) result = caseMarked(opaqueMember);
				if (result == null) result = caseReferrable(opaqueMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.nasdanika.sdk.runtime.models.typescript.Package object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportBinding(ImportBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeReference(PrimitiveTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTypeReference(NamedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeReference(ArrayTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionTypeReference(UnionTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersectionTypeReference(IntersectionTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralTypeReference(LiteralTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Literal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Literal Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiteralReference(TypeLiteralReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionTypeReference(FunctionTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueTypeReference(OpaqueTypeReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDeclaration(InterfaceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration(ClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Alias Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Alias Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAliasDeclaration(TypeAliasDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDeclaration(EnumDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumMember(EnumMember object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessor(Accessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueMember(OpaqueMember object) {
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

} //TypescriptSwitch
