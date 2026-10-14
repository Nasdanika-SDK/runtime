/**
 */
package org.nasdanika.sdk.runtime.models.typescript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage
 * @generated
 */
public interface TypescriptFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypescriptFactory eINSTANCE = org.nasdanika.sdk.runtime.models.typescript.impl.TypescriptFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Import Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Binding</em>'.
	 * @generated
	 */
	ImportBinding createImportBinding();

	/**
	 * Returns a new object of class '<em>Primitive Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Reference</em>'.
	 * @generated
	 */
	PrimitiveTypeReference createPrimitiveTypeReference();

	/**
	 * Returns a new object of class '<em>Named Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Type Reference</em>'.
	 * @generated
	 */
	NamedTypeReference createNamedTypeReference();

	/**
	 * Returns a new object of class '<em>Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Reference</em>'.
	 * @generated
	 */
	ArrayTypeReference createArrayTypeReference();

	/**
	 * Returns a new object of class '<em>Union Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type Reference</em>'.
	 * @generated
	 */
	UnionTypeReference createUnionTypeReference();

	/**
	 * Returns a new object of class '<em>Intersection Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection Type Reference</em>'.
	 * @generated
	 */
	IntersectionTypeReference createIntersectionTypeReference();

	/**
	 * Returns a new object of class '<em>Literal Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Type Reference</em>'.
	 * @generated
	 */
	LiteralTypeReference createLiteralTypeReference();

	/**
	 * Returns a new object of class '<em>Type Literal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Literal Reference</em>'.
	 * @generated
	 */
	TypeLiteralReference createTypeLiteralReference();

	/**
	 * Returns a new object of class '<em>Function Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Type Reference</em>'.
	 * @generated
	 */
	FunctionTypeReference createFunctionTypeReference();

	/**
	 * Returns a new object of class '<em>Opaque Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Type Reference</em>'.
	 * @generated
	 */
	OpaqueTypeReference createOpaqueTypeReference();

	/**
	 * Returns a new object of class '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter</em>'.
	 * @generated
	 */
	TypeParameter createTypeParameter();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block</em>'.
	 * @generated
	 */
	CodeBlock createCodeBlock();

	/**
	 * Returns a new object of class '<em>Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Declaration</em>'.
	 * @generated
	 */
	InterfaceDeclaration createInterfaceDeclaration();

	/**
	 * Returns a new object of class '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Declaration</em>'.
	 * @generated
	 */
	ClassDeclaration createClassDeclaration();

	/**
	 * Returns a new object of class '<em>Type Alias Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Alias Declaration</em>'.
	 * @generated
	 */
	TypeAliasDeclaration createTypeAliasDeclaration();

	/**
	 * Returns a new object of class '<em>Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Declaration</em>'.
	 * @generated
	 */
	EnumDeclaration createEnumDeclaration();

	/**
	 * Returns a new object of class '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Member</em>'.
	 * @generated
	 */
	EnumMember createEnumMember();

	/**
	 * Returns a new object of class '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Declaration</em>'.
	 * @generated
	 */
	FunctionDeclaration createFunctionDeclaration();

	/**
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor</em>'.
	 * @generated
	 */
	Constructor createConstructor();

	/**
	 * Returns a new object of class '<em>Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accessor</em>'.
	 * @generated
	 */
	Accessor createAccessor();

	/**
	 * Returns a new object of class '<em>Opaque Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Member</em>'.
	 * @generated
	 */
	OpaqueMember createOpaqueMember();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypescriptPackage getTypescriptPackage();

} //TypescriptFactory
