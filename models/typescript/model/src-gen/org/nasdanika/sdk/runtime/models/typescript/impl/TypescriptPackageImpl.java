/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.typescript.Accessor;
import org.nasdanika.sdk.runtime.models.typescript.AccessorKind;
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
import org.nasdanika.sdk.runtime.models.typescript.ImportKind;
import org.nasdanika.sdk.runtime.models.typescript.InterfaceDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.LiteralKind;
import org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.Member;
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
import org.nasdanika.sdk.runtime.models.typescript.TypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypeScriptElement;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptFactory;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;
import org.nasdanika.sdk.runtime.models.typescript.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.VariableDeclaration;
import org.nasdanika.sdk.runtime.models.typescript.VariableKind;
import org.nasdanika.sdk.runtime.models.typescript.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypescriptPackageImpl extends EPackageImpl implements TypescriptPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeScriptElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLiteralReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAliasDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum literalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessorKindEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypescriptPackageImpl() {
		super(eNS_URI, TypescriptFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypescriptPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypescriptPackage init() {
		if (isInited) return (TypescriptPackage)EPackage.Registry.INSTANCE.getEPackage(TypescriptPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypescriptPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypescriptPackageImpl theTypescriptPackage = registeredTypescriptPackage instanceof TypescriptPackageImpl ? (TypescriptPackageImpl)registeredTypescriptPackage : new TypescriptPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTypescriptPackage.createPackageContents();

		// Initialize created meta-data
		theTypescriptPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypescriptPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypescriptPackage.eNS_URI, theTypescriptPackage);
		return theTypescriptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeScriptElement() {
		return typeScriptElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_PackageName() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Description() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_License() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_ModuleType() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Dependencies() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_PeerDependencies() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Modules() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Path() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_DeclarationOnly() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Header() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Imports() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Declarations() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Footer() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ModuleSpecifier() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_TypeOnly() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Bindings() {
		return (EReference)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportBinding() {
		return importBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportBinding_Kind() {
		return (EAttribute)importBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportBinding_ImportedName() {
		return (EAttribute)importBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportBinding_Alias() {
		return (EAttribute)importBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeReference() {
		return primitiveTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveTypeReference_PrimitiveType() {
		return (EAttribute)primitiveTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTypeReference() {
		return namedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeReference_Target() {
		return (EReference)namedTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedTypeReference_QualifiedName() {
		return (EAttribute)namedTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedTypeReference_ModuleSpecifier() {
		return (EAttribute)namedTypeReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeReference_TypeArguments() {
		return (EReference)namedTypeReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeReference() {
		return arrayTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayTypeReference_ElementType() {
		return (EReference)arrayTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionTypeReference() {
		return unionTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionTypeReference_Types() {
		return (EReference)unionTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntersectionTypeReference() {
		return intersectionTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntersectionTypeReference_Types() {
		return (EReference)intersectionTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralTypeReference() {
		return literalTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralTypeReference_LiteralKind() {
		return (EAttribute)literalTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralTypeReference_Value() {
		return (EAttribute)literalTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLiteralReference() {
		return typeLiteralReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLiteralReference_Members() {
		return (EReference)typeLiteralReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionTypeReference() {
		return functionTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionTypeReference_Parameters() {
		return (EReference)functionTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionTypeReference_ReturnType() {
		return (EReference)functionTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueTypeReference() {
		return opaqueTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueTypeReference_Text() {
		return (EAttribute)opaqueTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueTypeReference_References() {
		return (EReference)opaqueTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaration_Exported() {
		return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaration_Ambient() {
		return (EAttribute)declarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameter_Constraint() {
		return (EReference)typeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameter_Default() {
		return (EReference)typeParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallable() {
		return callableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_TypeParameters() {
		return (EReference)callableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_Parameters() {
		return (EReference)callableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_ReturnType() {
		return (EReference)callableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallable_Body() {
		return (EReference)callableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallable_Async() {
		return (EAttribute)callableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallable_Generator() {
		return (EAttribute)callableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Optional() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Rest() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DefaultValue() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeBlock() {
		return codeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeBlock_Text() {
		return (EAttribute)codeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeBlock_References() {
		return (EReference)codeBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDeclaration() {
		return interfaceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDeclaration_TypeParameters() {
		return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDeclaration_SuperTypes() {
		return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDeclaration_Members() {
		return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDeclaration() {
		return classDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_TypeParameters() {
		return (EReference)classDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_SuperClass() {
		return (EReference)classDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_Interfaces() {
		return (EReference)classDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDeclaration_Abstract() {
		return (EAttribute)classDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_Members() {
		return (EReference)classDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAliasDeclaration() {
		return typeAliasDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAliasDeclaration_TypeParameters() {
		return (EReference)typeAliasDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAliasDeclaration_Type() {
		return (EReference)typeAliasDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDeclaration() {
		return enumDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumDeclaration_Constant() {
		return (EAttribute)enumDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDeclaration_Members() {
		return (EReference)enumDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumMember() {
		return enumMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumMember_Value() {
		return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_VariableKind() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Type() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Initializer() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Visibility() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Static() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Optional() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Readonly() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Initializer() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Abstract() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructor_Parameters() {
		return (EReference)constructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructor_Body() {
		return (EReference)constructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessor() {
		return accessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessor_AccessorKind() {
		return (EAttribute)accessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueMember() {
		return opaqueMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueMember_Text() {
		return (EAttribute)opaqueMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueMember_References() {
		return (EReference)opaqueMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportKind() {
		return importKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiteralKind() {
		return literalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableKind() {
		return variableKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessorKind() {
		return accessorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypescriptFactory getTypescriptFactory() {
		return (TypescriptFactory)getEFactoryInstance();
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
		typeScriptElementEClass = createEClass(TYPE_SCRIPT_ELEMENT);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__PACKAGE_NAME);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEAttribute(packageEClass, PACKAGE__DESCRIPTION);
		createEAttribute(packageEClass, PACKAGE__LICENSE);
		createEAttribute(packageEClass, PACKAGE__MODULE_TYPE);
		createEAttribute(packageEClass, PACKAGE__DEPENDENCIES);
		createEAttribute(packageEClass, PACKAGE__PEER_DEPENDENCIES);
		createEReference(packageEClass, PACKAGE__MODULES);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__PATH);
		createEAttribute(moduleEClass, MODULE__DECLARATION_ONLY);
		createEAttribute(moduleEClass, MODULE__HEADER);
		createEReference(moduleEClass, MODULE__IMPORTS);
		createEReference(moduleEClass, MODULE__DECLARATIONS);
		createEAttribute(moduleEClass, MODULE__FOOTER);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__MODULE_SPECIFIER);
		createEAttribute(importEClass, IMPORT__TYPE_ONLY);
		createEReference(importEClass, IMPORT__BINDINGS);

		importBindingEClass = createEClass(IMPORT_BINDING);
		createEAttribute(importBindingEClass, IMPORT_BINDING__KIND);
		createEAttribute(importBindingEClass, IMPORT_BINDING__IMPORTED_NAME);
		createEAttribute(importBindingEClass, IMPORT_BINDING__ALIAS);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		primitiveTypeReferenceEClass = createEClass(PRIMITIVE_TYPE_REFERENCE);
		createEAttribute(primitiveTypeReferenceEClass, PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE);

		namedTypeReferenceEClass = createEClass(NAMED_TYPE_REFERENCE);
		createEReference(namedTypeReferenceEClass, NAMED_TYPE_REFERENCE__TARGET);
		createEAttribute(namedTypeReferenceEClass, NAMED_TYPE_REFERENCE__QUALIFIED_NAME);
		createEAttribute(namedTypeReferenceEClass, NAMED_TYPE_REFERENCE__MODULE_SPECIFIER);
		createEReference(namedTypeReferenceEClass, NAMED_TYPE_REFERENCE__TYPE_ARGUMENTS);

		arrayTypeReferenceEClass = createEClass(ARRAY_TYPE_REFERENCE);
		createEReference(arrayTypeReferenceEClass, ARRAY_TYPE_REFERENCE__ELEMENT_TYPE);

		unionTypeReferenceEClass = createEClass(UNION_TYPE_REFERENCE);
		createEReference(unionTypeReferenceEClass, UNION_TYPE_REFERENCE__TYPES);

		intersectionTypeReferenceEClass = createEClass(INTERSECTION_TYPE_REFERENCE);
		createEReference(intersectionTypeReferenceEClass, INTERSECTION_TYPE_REFERENCE__TYPES);

		literalTypeReferenceEClass = createEClass(LITERAL_TYPE_REFERENCE);
		createEAttribute(literalTypeReferenceEClass, LITERAL_TYPE_REFERENCE__LITERAL_KIND);
		createEAttribute(literalTypeReferenceEClass, LITERAL_TYPE_REFERENCE__VALUE);

		typeLiteralReferenceEClass = createEClass(TYPE_LITERAL_REFERENCE);
		createEReference(typeLiteralReferenceEClass, TYPE_LITERAL_REFERENCE__MEMBERS);

		functionTypeReferenceEClass = createEClass(FUNCTION_TYPE_REFERENCE);
		createEReference(functionTypeReferenceEClass, FUNCTION_TYPE_REFERENCE__PARAMETERS);
		createEReference(functionTypeReferenceEClass, FUNCTION_TYPE_REFERENCE__RETURN_TYPE);

		opaqueTypeReferenceEClass = createEClass(OPAQUE_TYPE_REFERENCE);
		createEAttribute(opaqueTypeReferenceEClass, OPAQUE_TYPE_REFERENCE__TEXT);
		createEReference(opaqueTypeReferenceEClass, OPAQUE_TYPE_REFERENCE__REFERENCES);

		declarationEClass = createEClass(DECLARATION);
		createEAttribute(declarationEClass, DECLARATION__EXPORTED);
		createEAttribute(declarationEClass, DECLARATION__AMBIENT);

		typeParameterEClass = createEClass(TYPE_PARAMETER);
		createEReference(typeParameterEClass, TYPE_PARAMETER__CONSTRAINT);
		createEReference(typeParameterEClass, TYPE_PARAMETER__DEFAULT);

		callableEClass = createEClass(CALLABLE);
		createEReference(callableEClass, CALLABLE__TYPE_PARAMETERS);
		createEReference(callableEClass, CALLABLE__PARAMETERS);
		createEReference(callableEClass, CALLABLE__RETURN_TYPE);
		createEReference(callableEClass, CALLABLE__BODY);
		createEAttribute(callableEClass, CALLABLE__ASYNC);
		createEAttribute(callableEClass, CALLABLE__GENERATOR);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__OPTIONAL);
		createEAttribute(parameterEClass, PARAMETER__REST);
		createEReference(parameterEClass, PARAMETER__DEFAULT_VALUE);

		codeBlockEClass = createEClass(CODE_BLOCK);
		createEAttribute(codeBlockEClass, CODE_BLOCK__TEXT);
		createEReference(codeBlockEClass, CODE_BLOCK__REFERENCES);

		interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);
		createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__TYPE_PARAMETERS);
		createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__SUPER_TYPES);
		createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__MEMBERS);

		classDeclarationEClass = createEClass(CLASS_DECLARATION);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__TYPE_PARAMETERS);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPER_CLASS);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__INTERFACES);
		createEAttribute(classDeclarationEClass, CLASS_DECLARATION__ABSTRACT);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__MEMBERS);

		typeAliasDeclarationEClass = createEClass(TYPE_ALIAS_DECLARATION);
		createEReference(typeAliasDeclarationEClass, TYPE_ALIAS_DECLARATION__TYPE_PARAMETERS);
		createEReference(typeAliasDeclarationEClass, TYPE_ALIAS_DECLARATION__TYPE);

		enumDeclarationEClass = createEClass(ENUM_DECLARATION);
		createEAttribute(enumDeclarationEClass, ENUM_DECLARATION__CONSTANT);
		createEReference(enumDeclarationEClass, ENUM_DECLARATION__MEMBERS);

		enumMemberEClass = createEClass(ENUM_MEMBER);
		createEAttribute(enumMemberEClass, ENUM_MEMBER__VALUE);

		functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE_KIND);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__INITIALIZER);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__VISIBILITY);
		createEAttribute(memberEClass, MEMBER__STATIC);
		createEAttribute(memberEClass, MEMBER__OPTIONAL);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__READONLY);
		createEReference(propertyEClass, PROPERTY__INITIALIZER);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__ABSTRACT);

		constructorEClass = createEClass(CONSTRUCTOR);
		createEReference(constructorEClass, CONSTRUCTOR__PARAMETERS);
		createEReference(constructorEClass, CONSTRUCTOR__BODY);

		accessorEClass = createEClass(ACCESSOR);
		createEAttribute(accessorEClass, ACCESSOR__ACCESSOR_KIND);

		opaqueMemberEClass = createEClass(OPAQUE_MEMBER);
		createEAttribute(opaqueMemberEClass, OPAQUE_MEMBER__TEXT);
		createEReference(opaqueMemberEClass, OPAQUE_MEMBER__REFERENCES);

		// Create enums
		importKindEEnum = createEEnum(IMPORT_KIND);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		literalKindEEnum = createEEnum(LITERAL_KIND);
		variableKindEEnum = createEEnum(VARIABLE_KIND);
		visibilityEEnum = createEEnum(VISIBILITY);
		accessorKindEEnum = createEEnum(ACCESSOR_KIND);
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
		typeScriptElementEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		packageEClass.getESuperTypes().add(this.getTypeScriptElement());
		moduleEClass.getESuperTypes().add(this.getTypeScriptElement());
		importEClass.getESuperTypes().add(this.getTypeScriptElement());
		importBindingEClass.getESuperTypes().add(this.getTypeScriptElement());
		typeReferenceEClass.getESuperTypes().add(this.getTypeScriptElement());
		primitiveTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		namedTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		arrayTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		unionTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		intersectionTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		literalTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		typeLiteralReferenceEClass.getESuperTypes().add(this.getTypeReference());
		functionTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		opaqueTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		declarationEClass.getESuperTypes().add(this.getTypeScriptElement());
		typeParameterEClass.getESuperTypes().add(this.getTypeScriptElement());
		callableEClass.getESuperTypes().add(this.getTypeScriptElement());
		parameterEClass.getESuperTypes().add(this.getTypeScriptElement());
		codeBlockEClass.getESuperTypes().add(this.getTypeScriptElement());
		interfaceDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		classDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		typeAliasDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		enumDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		enumMemberEClass.getESuperTypes().add(this.getTypeScriptElement());
		functionDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		functionDeclarationEClass.getESuperTypes().add(this.getCallable());
		variableDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		variableDeclarationEClass.getESuperTypes().add(this.getCallable());
		memberEClass.getESuperTypes().add(this.getTypeScriptElement());
		propertyEClass.getESuperTypes().add(this.getMember());
		methodEClass.getESuperTypes().add(this.getMember());
		methodEClass.getESuperTypes().add(this.getCallable());
		constructorEClass.getESuperTypes().add(this.getMember());
		accessorEClass.getESuperTypes().add(this.getMember());
		accessorEClass.getESuperTypes().add(this.getCallable());
		opaqueMemberEClass.getESuperTypes().add(this.getMember());

		// Initialize classes, features, and operations; add parameters
		initEClass(typeScriptElementEClass, TypeScriptElement.class, "TypeScriptElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, org.nasdanika.sdk.runtime.models.typescript.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_PackageName(), theEcorePackage.getEString(), "packageName", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), theEcorePackage.getEString(), "version", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Description(), theEcorePackage.getEString(), "description", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_License(), theEcorePackage.getEString(), "license", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_ModuleType(), theEcorePackage.getEString(), "moduleType", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Dependencies(), theEcorePackage.getEString(), "dependencies", null, 0, -1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_PeerDependencies(), theEcorePackage.getEString(), "peerDependencies", null, 0, -1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Modules(), this.getModule(), null, "modules", null, 0, -1, org.nasdanika.sdk.runtime.models.typescript.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, org.nasdanika.sdk.runtime.models.typescript.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Path(), theEcorePackage.getEString(), "path", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_DeclarationOnly(), theEcorePackage.getEBoolean(), "declarationOnly", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Header(), theEcorePackage.getEString(), "header", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Imports(), this.getImport(), null, "imports", null, 0, -1, org.nasdanika.sdk.runtime.models.typescript.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, org.nasdanika.sdk.runtime.models.typescript.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Footer(), theEcorePackage.getEString(), "footer", null, 0, 1, org.nasdanika.sdk.runtime.models.typescript.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ModuleSpecifier(), theEcorePackage.getEString(), "moduleSpecifier", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_TypeOnly(), theEcorePackage.getEBoolean(), "typeOnly", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImport_Bindings(), this.getImportBinding(), null, "bindings", null, 0, -1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importBindingEClass, ImportBinding.class, "ImportBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportBinding_Kind(), this.getImportKind(), "kind", null, 0, 1, ImportBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportBinding_ImportedName(), theEcorePackage.getEString(), "importedName", null, 0, 1, ImportBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportBinding_Alias(), theEcorePackage.getEString(), "alias", null, 0, 1, ImportBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeReferenceEClass, PrimitiveTypeReference.class, "PrimitiveTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveTypeReference_PrimitiveType(), this.getPrimitiveType(), "primitiveType", null, 0, 1, PrimitiveTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedTypeReferenceEClass, NamedTypeReference.class, "NamedTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedTypeReference_Target(), this.getDeclaration(), null, "target", null, 0, 1, NamedTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedTypeReference_QualifiedName(), theEcorePackage.getEString(), "qualifiedName", null, 0, 1, NamedTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedTypeReference_ModuleSpecifier(), theEcorePackage.getEString(), "moduleSpecifier", null, 0, 1, NamedTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedTypeReference_TypeArguments(), this.getTypeReference(), null, "typeArguments", null, 0, -1, NamedTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeReferenceEClass, ArrayTypeReference.class, "ArrayTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayTypeReference_ElementType(), this.getTypeReference(), null, "elementType", null, 0, 1, ArrayTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionTypeReferenceEClass, UnionTypeReference.class, "UnionTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionTypeReference_Types(), this.getTypeReference(), null, "types", null, 0, -1, UnionTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intersectionTypeReferenceEClass, IntersectionTypeReference.class, "IntersectionTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntersectionTypeReference_Types(), this.getTypeReference(), null, "types", null, 0, -1, IntersectionTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalTypeReferenceEClass, LiteralTypeReference.class, "LiteralTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralTypeReference_LiteralKind(), this.getLiteralKind(), "literalKind", null, 0, 1, LiteralTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralTypeReference_Value(), theEcorePackage.getEString(), "value", null, 0, 1, LiteralTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLiteralReferenceEClass, TypeLiteralReference.class, "TypeLiteralReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLiteralReference_Members(), this.getMember(), null, "members", null, 0, -1, TypeLiteralReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeReferenceEClass, FunctionTypeReference.class, "FunctionTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionTypeReference_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, FunctionTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionTypeReference_ReturnType(), this.getTypeReference(), null, "returnType", null, 0, 1, FunctionTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueTypeReferenceEClass, OpaqueTypeReference.class, "OpaqueTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueTypeReference_Text(), theEcorePackage.getEString(), "text", null, 0, 1, OpaqueTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueTypeReference_References(), this.getTypeReference(), null, "references", null, 0, -1, OpaqueTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaration_Exported(), theEcorePackage.getEBoolean(), "exported", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeclaration_Ambient(), theEcorePackage.getEBoolean(), "ambient", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameter_Constraint(), this.getTypeReference(), null, "constraint", null, 0, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeParameter_Default(), this.getTypeReference(), null, "default", null, 0, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callableEClass, Callable.class, "Callable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallable_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallable_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallable_ReturnType(), this.getTypeReference(), null, "returnType", null, 0, 1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallable_Body(), this.getCodeBlock(), null, "body", null, 0, 1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallable_Async(), theEcorePackage.getEBoolean(), "async", null, 0, 1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallable_Generator(), theEcorePackage.getEBoolean(), "generator", null, 0, 1, Callable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Type(), this.getTypeReference(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Optional(), theEcorePackage.getEBoolean(), "optional", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Rest(), theEcorePackage.getEBoolean(), "rest", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_DefaultValue(), this.getCodeBlock(), null, "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeBlockEClass, CodeBlock.class, "CodeBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeBlock_Text(), theEcorePackage.getEString(), "text", null, 0, 1, CodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeBlock_References(), this.getTypeReference(), null, "references", null, 0, -1, CodeBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDeclaration_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDeclaration_SuperTypes(), this.getTypeReference(), null, "superTypes", null, 0, -1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceDeclaration_Members(), this.getMember(), null, "members", null, 0, -1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDeclaration_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_SuperClass(), this.getTypeReference(), null, "superClass", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_Interfaces(), this.getTypeReference(), null, "interfaces", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDeclaration_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_Members(), this.getMember(), null, "members", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeAliasDeclarationEClass, TypeAliasDeclaration.class, "TypeAliasDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeAliasDeclaration_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, TypeAliasDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeAliasDeclaration_Type(), this.getTypeReference(), null, "type", null, 0, 1, TypeAliasDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumDeclarationEClass, EnumDeclaration.class, "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumDeclaration_Constant(), theEcorePackage.getEBoolean(), "constant", null, 0, 1, EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumDeclaration_Members(), this.getEnumMember(), null, "members", null, 0, -1, EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumMember_Value(), theEcorePackage.getEString(), "value", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclaration_VariableKind(), this.getVariableKind(), "variableKind", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclaration_Type(), this.getTypeReference(), null, "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclaration_Initializer(), this.getCodeBlock(), null, "initializer", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Optional(), theEcorePackage.getEBoolean(), "optional", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Type(), this.getTypeReference(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Initializer(), this.getCodeBlock(), null, "initializer", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructor_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructor_Body(), this.getCodeBlock(), null, "body", null, 0, 1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessorEClass, Accessor.class, "Accessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessor_AccessorKind(), this.getAccessorKind(), "accessorKind", null, 0, 1, Accessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueMemberEClass, OpaqueMember.class, "OpaqueMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueMember_Text(), theEcorePackage.getEString(), "text", null, 0, 1, OpaqueMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueMember_References(), this.getTypeReference(), null, "references", null, 0, -1, OpaqueMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(importKindEEnum, ImportKind.class, "ImportKind");
		addEEnumLiteral(importKindEEnum, ImportKind.NAMED);
		addEEnumLiteral(importKindEEnum, ImportKind.DEFAULT);
		addEEnumLiteral(importKindEEnum, ImportKind.NAMESPACE);
		addEEnumLiteral(importKindEEnum, ImportKind.SIDE_EFFECT);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NUMBER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BIGINT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.SYMBOL);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NULL);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.UNDEFINED);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.VOID);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.NEVER);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.UNKNOWN);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.ANY);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.OBJECT);

		initEEnum(literalKindEEnum, LiteralKind.class, "LiteralKind");
		addEEnumLiteral(literalKindEEnum, LiteralKind.STRING);
		addEEnumLiteral(literalKindEEnum, LiteralKind.NUMBER);
		addEEnumLiteral(literalKindEEnum, LiteralKind.BOOLEAN);

		initEEnum(variableKindEEnum, VariableKind.class, "VariableKind");
		addEEnumLiteral(variableKindEEnum, VariableKind.CONST);
		addEEnumLiteral(variableKindEEnum, VariableKind.LET);
		addEEnumLiteral(variableKindEEnum, VariableKind.VAR);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);

		initEEnum(accessorKindEEnum, AccessorKind.class, "AccessorKind");
		addEEnumLiteral(accessorKindEEnum, AccessorKind.GET);
		addEEnumLiteral(accessorKindEEnum, AccessorKind.SET);

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
		  (typeScriptElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base of everything in the model. Inherits name from nxcore NamedElement, plus\ndocumentation-as-structure and nested markers: documentation is emitted as JSDoc,\nand markers are the provenance join back to the source model element, which is\nwhere owners, work and governance actually live."
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "documentation", "An npm package to emit: enough to write package.json and lay out files, not an\nestate model. Version, dependency versions and provenance belong to the packaging\nestate model, which references packages by URI rather than containing them. Kept\nhere only because a generator that emits modules but not the package around them\nleaves the last mile to a script, and that script is where drift starts."
		   });
		addAnnotation
		  (getPackage_PackageName(),
		   source,
		   new String[] {
			   "documentation", " Scoped npm name, e.g. @nasdanika/nxcore."
		   });
		addAnnotation
		  (getPackage_ModuleType(),
		   source,
		   new String[] {
			   "documentation", " package.json \"type\"; \"module\" for the ESM packages the tower publishes."
		   });
		addAnnotation
		  (getPackage_Dependencies(),
		   source,
		   new String[] {
			   "documentation", " Bare specifiers of runtime dependencies, mapped to versions by the emitter."
		   });
		addAnnotation
		  (getPackage_PeerDependencies(),
		   source,
		   new String[] {
			   "documentation", " Bare specifiers of peer dependencies."
		   });
		addAnnotation
		  (moduleEClass,
		   source,
		   new String[] {
			   "documentation", "One emitted file. Situated because a generation run happens at a POINT in a\ncoordinate space (jurisdiction, language, tier, audience) and the module is the\nartifact that records which point produced it. Individual declarations are not\nSituated: the coordinate is a property of the generation run, and runs produce\nmodules. Note that the coordinate is a RECEIPT here, never a filter - what varies\nby coordinate is decided on the source model and in the transformation, and a\nTypeScript model that knew about Ontario would be a TypeScript model that is wrong."
		   });
		addAnnotation
		  (getModule_Path(),
		   source,
		   new String[] {
			   "documentation", " Path relative to the package root, without extension, e.g. \"model/element\"."
		   });
		addAnnotation
		  (getModule_DeclarationOnly(),
		   source,
		   new String[] {
			   "documentation", " Emit as .d.ts rather than .ts: declarations only, no bodies."
		   });
		addAnnotation
		  (getModule_Header(),
		   source,
		   new String[] {
			   "documentation", " Verbatim banner emitted first: license header, do-not-edit notice, provenance."
		   });
		addAnnotation
		  (getModule_Imports(),
		   source,
		   new String[] {
			   "documentation", "Normally COMPUTED at save time from the TypeReferences reachable in this\nmodule. Authored imports are for the cases the resolver cannot see, such as\nside-effect imports and types referenced only inside opaque code."
		   });
		addAnnotation
		  (getModule_Footer(),
		   source,
		   new String[] {
			   "documentation", " Opaque trailing source appended verbatim: re-exports, module augmentation."
		   });
		addAnnotation
		  (importKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " import { X } from \"...\""
		   });
		addAnnotation
		  (importKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " import X from \"...\""
		   });
		addAnnotation
		  (importKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " import * as X from \"...\""
		   });
		addAnnotation
		  (importKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", " import \"...\" - side effect only, no bindings"
		   });
		addAnnotation
		  (importEClass,
		   source,
		   new String[] {
			   "documentation", "One import statement. typeOnly emits `import type`, which is what keeps\ncross-floor references from creating runtime cycles between generated packages:\na package that only needs its parent floor\'s TYPES must not pull in its runtime.\nGetting this wrong is the single most likely defect in a hand-written emitter,\nwhich is the argument for owning it here."
		   });
		addAnnotation
		  (getImport_ModuleSpecifier(),
		   source,
		   new String[] {
			   "documentation", " Bare specifier (@nasdanika/nxcore) or relative path (./element.js)."
		   });
		addAnnotation
		  (getImportBinding_ImportedName(),
		   source,
		   new String[] {
			   "documentation", " Name as exported by the target module; unset for DEFAULT and NAMESPACE."
		   });
		addAnnotation
		  (getImportBinding_Alias(),
		   source,
		   new String[] {
			   "documentation", " Local alias; unset means the imported name is used as is."
		   });
		addAnnotation
		  (typeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nType references. This is a reference language, not the TypeScript type system:\nenough to write the type position of a declaration, with OpaqueTypeReference as\nthe release valve for everything else.\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (namedTypeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Reference to a declared type. `target` is set for types declared inside this\nmodel, and is what the import resolver follows to work out the specifier and\nwhether the import can be type-only. `qualifiedName` plus `moduleSpecifier` cover\ntypes from packages the generator does not own."
		   });
		addAnnotation
		  (typeLiteralReferenceEClass,
		   source,
		   new String[] {
			   "documentation", " Inline object type: { a: string; b?: number }. Members reuse Property."
		   });
		addAnnotation
		  (opaqueTypeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Verbatim type text. Deliberate escape hatch for conditional types, mapped types,\ntemplate literal types, `keyof`/`typeof` gymnastics and anything else not worth a\nclass. `references` lets the import resolver still see the named types used inside\nthe text, so an opaque type does not silently break import management."
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nDeclarations\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getDeclaration_Ambient(),
		   source,
		   new String[] {
			   "documentation", " Emit `declare`: ambient declaration, no implementation."
		   });
		addAnnotation
		  (callableEClass,
		   source,
		   new String[] {
			   "documentation", "Shared signature shape for functions, methods, constructors and accessors.\nMultiple supertypes are used rather than duplicating the four features, so an\nemitter can write one signature routine."
		   });
		addAnnotation
		  (getParameter_Rest(),
		   source,
		   new String[] {
			   "documentation", " Rest parameter: ...args"
		   });
		addAnnotation
		  (codeBlockEClass,
		   source,
		   new String[] {
			   "documentation", "Opaque source text with managed indentation, the same bargain the Python model\nmakes for bodies. `references` keeps the import resolver honest about types used\nonly inside the text."
		   });
		addAnnotation
		  (getInterfaceDeclaration_SuperTypes(),
		   source,
		   new String[] {
			   "documentation", " `extends` clause; a TypeScript interface may extend several."
		   });
		addAnnotation
		  (getClassDeclaration_Interfaces(),
		   source,
		   new String[] {
			   "documentation", " `implements` clause."
		   });
		addAnnotation
		  (getEnumDeclaration_Constant(),
		   source,
		   new String[] {
			   "documentation", " Emit `const enum`. Rarely wanted in published packages: it does not survive\nisolatedModules and breaks consumers that compile files independently."
		   });
		addAnnotation
		  (getEnumMember_Value(),
		   source,
		   new String[] {
			   "documentation", " Verbatim initializer including quotes for string enums; unset means implicit."
		   });
		addAnnotation
		  (visibilityEEnum,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nMembers\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (opaqueMemberEClass,
		   source,
		   new String[] {
			   "documentation", "Verbatim member text: index signatures, call signatures, decorators with awkward\narguments, overload sets. Same bargain as OpaqueTypeReference."
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

} //TypescriptPackageImpl
