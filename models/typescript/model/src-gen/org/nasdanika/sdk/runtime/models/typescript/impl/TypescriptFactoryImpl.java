/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.typescript.Accessor;
import org.nasdanika.sdk.runtime.models.typescript.AccessorKind;
import org.nasdanika.sdk.runtime.models.typescript.ArrayTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.ClassDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.CodeBlock;
import org.nasdanika.sdk.runtime.models.typescript.Constructor;
import org.nasdanika.sdk.runtime.models.typescript.EnumDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.EnumMember;
import org.nasdanika.sdk.runtime.models.typescript.FunctionDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.FunctionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Import;
import org.nasdanika.sdk.runtime.models.typescript.ImportBinding;
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.LiteralKind;
import org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Method;
import org.nasdanika.sdk.runtime.models.typescript.NamedTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueMember;
import org.nasdanika.sdk.runtime.models.typescript.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Parameter;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveType;
import org.nasdanika.sdk.runtime.models.typescript.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Property;
import org.nasdanika.sdk.runtime.models.typescript.TypeAliasDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.TypeLiteralReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeParameter;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;
import org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;
import org.nasdanika.sdk.runtime.models.typescript.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypescriptFactoryImpl extends EFactoryImpl implements TypescriptFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypescriptFactory init() {
		try {
			TypescriptFactory theTypescriptFactory = (TypescriptFactory)EPackage.Registry.INSTANCE.getEFactory(TypescriptPackage.eNS_URI);
			if (theTypescriptFactory != null) {
				return theTypescriptFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypescriptFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypescriptFactoryImpl() {
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
			case TypescriptPackage.PACKAGE: return createPackage();
			case TypescriptPackage.MODULE: return createModule();
			case TypescriptPackage.IMPORT: return createImport();
			case TypescriptPackage.IMPORT_BINDING: return createImportBinding();
			case TypescriptPackage.PRIMITIVE_TYPE_REFERENCE: return createPrimitiveTypeReference();
			case TypescriptPackage.NAMED_TYPE_REFERENCE: return createNamedTypeReference();
			case TypescriptPackage.ARRAY_TYPE_REFERENCE: return createArrayTypeReference();
			case TypescriptPackage.UNION_TYPE_REFERENCE: return createUnionTypeReference();
			case TypescriptPackage.INTERSECTION_TYPE_REFERENCE: return createIntersectionTypeReference();
			case TypescriptPackage.LITERAL_TYPE_REFERENCE: return createLiteralTypeReference();
			case TypescriptPackage.TYPE_LITERAL_REFERENCE: return createTypeLiteralReference();
			case TypescriptPackage.FUNCTION_TYPE_REFERENCE: return createFunctionTypeReference();
			case TypescriptPackage.OPAQUE_TYPE_REFERENCE: return createOpaqueTypeReference();
			case TypescriptPackage.TYPE_PARAMETER: return createTypeParameter();
			case TypescriptPackage.PARAMETER: return createParameter();
			case TypescriptPackage.CODE_BLOCK: return createCodeBlock();
			case TypescriptPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
			case TypescriptPackage.CLASS_DECLARATION: return createClassDeclaration();
			case TypescriptPackage.TYPE_ALIAS_DECLARATION: return createTypeAliasDeclaration();
			case TypescriptPackage.ENUM_DECLARATION: return createEnumDeclaration();
			case TypescriptPackage.ENUM_MEMBER: return createEnumMember();
			case TypescriptPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
			case TypescriptPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case TypescriptPackage.PROPERTY: return createProperty();
			case TypescriptPackage.METHOD: return createMethod();
			case TypescriptPackage.CONSTRUCTOR: return createConstructor();
			case TypescriptPackage.ACCESSOR: return createAccessor();
			case TypescriptPackage.OPAQUE_MEMBER: return createOpaqueMember();
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
			case TypescriptPackage.IMPORT_KIND:
				return createImportKindFromString(eDataType, initialValue);
			case TypescriptPackage.PRIMITIVE_TYPE:
				return createPrimitiveTypeFromString(eDataType, initialValue);
			case TypescriptPackage.LITERAL_KIND:
				return createLiteralKindFromString(eDataType, initialValue);
			case TypescriptPackage.VARIABLE_KIND:
				return createVariableKindFromString(eDataType, initialValue);
			case TypescriptPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case TypescriptPackage.ACCESSOR_KIND:
				return createAccessorKindFromString(eDataType, initialValue);
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
			case TypescriptPackage.IMPORT_KIND:
				return convertImportKindToString(eDataType, instanceValue);
			case TypescriptPackage.PRIMITIVE_TYPE:
				return convertPrimitiveTypeToString(eDataType, instanceValue);
			case TypescriptPackage.LITERAL_KIND:
				return convertLiteralKindToString(eDataType, instanceValue);
			case TypescriptPackage.VARIABLE_KIND:
				return convertVariableKindToString(eDataType, instanceValue);
			case TypescriptPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case TypescriptPackage.ACCESSOR_KIND:
				return convertAccessorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.typescript.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.typescript.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportBinding createImportBinding() {
		ImportBindingImpl importBinding = new ImportBindingImpl();
		return importBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeReference createPrimitiveTypeReference() {
		PrimitiveTypeReferenceImpl primitiveTypeReference = new PrimitiveTypeReferenceImpl();
		return primitiveTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeReference createNamedTypeReference() {
		NamedTypeReferenceImpl namedTypeReference = new NamedTypeReferenceImpl();
		return namedTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeReference createArrayTypeReference() {
		ArrayTypeReferenceImpl arrayTypeReference = new ArrayTypeReferenceImpl();
		return arrayTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionTypeReference createUnionTypeReference() {
		UnionTypeReferenceImpl unionTypeReference = new UnionTypeReferenceImpl();
		return unionTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectionTypeReference createIntersectionTypeReference() {
		IntersectionTypeReferenceImpl intersectionTypeReference = new IntersectionTypeReferenceImpl();
		return intersectionTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralTypeReference createLiteralTypeReference() {
		LiteralTypeReferenceImpl literalTypeReference = new LiteralTypeReferenceImpl();
		return literalTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLiteralReference createTypeLiteralReference() {
		TypeLiteralReferenceImpl typeLiteralReference = new TypeLiteralReferenceImpl();
		return typeLiteralReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeReference createFunctionTypeReference() {
		FunctionTypeReferenceImpl functionTypeReference = new FunctionTypeReferenceImpl();
		return functionTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueTypeReference createOpaqueTypeReference() {
		OpaqueTypeReferenceImpl opaqueTypeReference = new OpaqueTypeReferenceImpl();
		return opaqueTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration createInterfaceDeclaration() {
		InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAliasDeclaration createTypeAliasDeclaration() {
		TypeAliasDeclarationImpl typeAliasDeclaration = new TypeAliasDeclarationImpl();
		return typeAliasDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumMember createEnumMember() {
		EnumMemberImpl enumMember = new EnumMemberImpl();
		return enumMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accessor createAccessor() {
		AccessorImpl accessor = new AccessorImpl();
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueMember createOpaqueMember() {
		OpaqueMemberImpl opaqueMember = new OpaqueMemberImpl();
		return opaqueMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportKind createImportKindFromString(EDataType eDataType, String initialValue) {
		ImportKind result = ImportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralKind createLiteralKindFromString(EDataType eDataType, String initialValue) {
		LiteralKind result = LiteralKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiteralKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableKind createVariableKindFromString(EDataType eDataType, String initialValue) {
		VariableKind result = VariableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessorKind createAccessorKindFromString(EDataType eDataType, String initialValue) {
		AccessorKind result = AccessorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypescriptPackage getTypescriptPackage() {
		return (TypescriptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypescriptPackage getPackage() {
		return TypescriptPackage.eINSTANCE;
	}

} //TypescriptFactoryImpl
