/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.meta.Annotation;
import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.DataType;
import org.nasdanika.sdk.runtime.models.meta.EnumLiteral;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.IncomingReference;
import org.nasdanika.sdk.runtime.models.meta.MetaFactory;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.ModelElement;
import org.nasdanika.sdk.runtime.models.meta.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Operation;
import org.nasdanika.sdk.runtime.models.meta.Parameter;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.TypeParameter;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;
import org.nasdanika.sdk.runtime.models.meta.TypedElement;
import org.nasdanika.sdk.runtime.models.meta.UnionTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaPackageImpl extends EPackageImpl implements MetaPackage {
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
	private EClass annotationEClass = null;

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
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

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
	private EClass typeParameterEClass = null;

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
	private EClass classifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterReferenceEClass = null;

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
	private EClass unionTypeReferenceEClass = null;

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
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveKindEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaPackageImpl() {
		super(eNS_URI, MetaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaPackage init() {
		if (isInited) return (MetaPackage)EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetaPackageImpl theMetaPackage = registeredMetaPackage instanceof MetaPackageImpl ? (MetaPackageImpl)registeredMetaPackage : new MetaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetaPackage.createPackageContents();

		// Initialize created meta-data
		theMetaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaPackage.eNS_URI, theMetaPackage);
		return theMetaPackage;
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
	public EReference getModelElement_Annotations() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Source() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Details() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPackage_Namespace() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Prefix() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Classifiers() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_TypeParameters() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Abstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperTypes() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Features() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Operations() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Representation() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_SourceType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnum_Literals() {
		return (EReference)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Value() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Ordinal() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_LowerBound() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_UpperBound() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_Ordered() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_Unique() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Derived() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Readonly() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_DefaultValue() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Identifying() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Containment() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Opposite() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Keys() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_TypeParameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Exceptions() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getParameter_Variadic() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
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
	public EReference getTypeParameter_Bound() {
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
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierReference() {
		return classifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierReference_Target() {
		return (EReference)classifierReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierReference_Namespace() {
		return (EAttribute)classifierReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierReference_ClassifierName() {
		return (EAttribute)classifierReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierReference_TypeArguments() {
		return (EReference)classifierReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameterReference() {
		return typeParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameterReference_Target() {
		return (EReference)typeParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeParameterReference_ParameterName() {
		return (EAttribute)typeParameterReferenceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPrimitiveTypeReference_Kind() {
		return (EAttribute)primitiveTypeReferenceEClass.getEStructuralFeatures().get(0);
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
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Type() {
		return (EReference)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Annotations() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__GetIdentities() {
		return objectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__GetContainer() {
		return objectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__GetContainmentFeature() {
		return objectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Get__Feature() {
		return objectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Get__Feature_int_int() {
		return objectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Set__Feature_Object() {
		return objectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Set__Feature_Object_int() {
		return objectEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Add__Feature_Object_int() {
		return objectEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Remove__Feature_Object() {
		return objectEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Remove__Feature_Object_int() {
		return objectEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Unset__Feature() {
		return objectEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Size__Feature() {
		return objectEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__Invoke__Operation_EList() {
		return objectEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__GetIncomingReferences__EList() {
		return objectEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__GetIncomingReferences__EList_int_int() {
		return objectEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__GetIncomingReferenceCount__EList() {
		return objectEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__IsResolved() {
		return objectEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingReference() {
		return incomingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingReference_Source() {
		return (EReference)incomingReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingReference_Reference() {
		return (EReference)incomingReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncomingReference_Index() {
		return (EAttribute)incomingReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveKind() {
		return primitiveKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactory getMetaFactory() {
		return (MetaFactory)getEFactoryInstance();
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
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__ANNOTATIONS);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__SOURCE);
		createEReference(annotationEClass, ANNOTATION__DETAILS);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAMESPACE);
		createEAttribute(packageEClass, PACKAGE__PREFIX);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEReference(packageEClass, PACKAGE__CLASSIFIERS);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__TYPE_PARAMETERS);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__ABSTRACT);
		createEReference(classEClass, CLASS__SUPER_TYPES);
		createEReference(classEClass, CLASS__FEATURES);
		createEReference(classEClass, CLASS__OPERATIONS);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__REPRESENTATION);
		createEAttribute(dataTypeEClass, DATA_TYPE__SOURCE_TYPE);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__LITERALS);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__VALUE);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__ORDINAL);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__LOWER_BOUND);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__UPPER_BOUND);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__ORDERED);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__UNIQUE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__DERIVED);
		createEAttribute(featureEClass, FEATURE__READONLY);
		createEAttribute(featureEClass, FEATURE__DEFAULT_VALUE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IDENTIFYING);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__CONTAINMENT);
		createEReference(referenceEClass, REFERENCE__OPPOSITE);
		createEReference(referenceEClass, REFERENCE__KEYS);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__TYPE_PARAMETERS);
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEReference(operationEClass, OPERATION__EXCEPTIONS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VARIADIC);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);

		typeParameterEClass = createEClass(TYPE_PARAMETER);
		createEReference(typeParameterEClass, TYPE_PARAMETER__BOUND);
		createEReference(typeParameterEClass, TYPE_PARAMETER__DEFAULT);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);

		classifierReferenceEClass = createEClass(CLASSIFIER_REFERENCE);
		createEReference(classifierReferenceEClass, CLASSIFIER_REFERENCE__TARGET);
		createEAttribute(classifierReferenceEClass, CLASSIFIER_REFERENCE__NAMESPACE);
		createEAttribute(classifierReferenceEClass, CLASSIFIER_REFERENCE__CLASSIFIER_NAME);
		createEReference(classifierReferenceEClass, CLASSIFIER_REFERENCE__TYPE_ARGUMENTS);

		typeParameterReferenceEClass = createEClass(TYPE_PARAMETER_REFERENCE);
		createEReference(typeParameterReferenceEClass, TYPE_PARAMETER_REFERENCE__TARGET);
		createEAttribute(typeParameterReferenceEClass, TYPE_PARAMETER_REFERENCE__PARAMETER_NAME);

		primitiveTypeReferenceEClass = createEClass(PRIMITIVE_TYPE_REFERENCE);
		createEAttribute(primitiveTypeReferenceEClass, PRIMITIVE_TYPE_REFERENCE__KIND);

		unionTypeReferenceEClass = createEClass(UNION_TYPE_REFERENCE);
		createEReference(unionTypeReferenceEClass, UNION_TYPE_REFERENCE__TYPES);

		opaqueTypeReferenceEClass = createEClass(OPAQUE_TYPE_REFERENCE);
		createEAttribute(opaqueTypeReferenceEClass, OPAQUE_TYPE_REFERENCE__TEXT);
		createEReference(opaqueTypeReferenceEClass, OPAQUE_TYPE_REFERENCE__REFERENCES);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__TYPE);
		createEReference(objectEClass, OBJECT__ANNOTATIONS);
		createEOperation(objectEClass, OBJECT___GET_IDENTITIES);
		createEOperation(objectEClass, OBJECT___GET_CONTAINER);
		createEOperation(objectEClass, OBJECT___GET_CONTAINMENT_FEATURE);
		createEOperation(objectEClass, OBJECT___GET__FEATURE);
		createEOperation(objectEClass, OBJECT___GET__FEATURE_INT_INT);
		createEOperation(objectEClass, OBJECT___SET__FEATURE_OBJECT);
		createEOperation(objectEClass, OBJECT___SET__FEATURE_OBJECT_INT);
		createEOperation(objectEClass, OBJECT___ADD__FEATURE_OBJECT_INT);
		createEOperation(objectEClass, OBJECT___REMOVE__FEATURE_OBJECT);
		createEOperation(objectEClass, OBJECT___REMOVE__FEATURE_OBJECT_INT);
		createEOperation(objectEClass, OBJECT___UNSET__FEATURE);
		createEOperation(objectEClass, OBJECT___SIZE__FEATURE);
		createEOperation(objectEClass, OBJECT___INVOKE__OPERATION_ELIST);
		createEOperation(objectEClass, OBJECT___GET_INCOMING_REFERENCES__ELIST);
		createEOperation(objectEClass, OBJECT___GET_INCOMING_REFERENCES__ELIST_INT_INT);
		createEOperation(objectEClass, OBJECT___GET_INCOMING_REFERENCE_COUNT__ELIST);
		createEOperation(objectEClass, OBJECT___IS_RESOLVED);

		incomingReferenceEClass = createEClass(INCOMING_REFERENCE);
		createEReference(incomingReferenceEClass, INCOMING_REFERENCE__SOURCE);
		createEReference(incomingReferenceEClass, INCOMING_REFERENCE__REFERENCE);
		createEAttribute(incomingReferenceEClass, INCOMING_REFERENCE__INDEX);

		// Create enums
		primitiveKindEEnum = createEEnum(PRIMITIVE_KIND);
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
		modelElementEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		annotationEClass.getESuperTypes().add(this.getModelElement());
		packageEClass.getESuperTypes().add(this.getModelElement());
		classifierEClass.getESuperTypes().add(this.getModelElement());
		classEClass.getESuperTypes().add(this.getClassifier());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		enumEClass.getESuperTypes().add(this.getClassifier());
		enumLiteralEClass.getESuperTypes().add(this.getModelElement());
		typedElementEClass.getESuperTypes().add(this.getModelElement());
		featureEClass.getESuperTypes().add(this.getTypedElement());
		attributeEClass.getESuperTypes().add(this.getFeature());
		referenceEClass.getESuperTypes().add(this.getFeature());
		operationEClass.getESuperTypes().add(this.getTypedElement());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		typeParameterEClass.getESuperTypes().add(this.getModelElement());
		typeReferenceEClass.getESuperTypes().add(this.getModelElement());
		classifierReferenceEClass.getESuperTypes().add(this.getTypeReference());
		typeParameterReferenceEClass.getESuperTypes().add(this.getTypeReference());
		primitiveTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		unionTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());
		opaqueTypeReferenceEClass.getESuperTypes().add(this.getTypeReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Source(), theEcorePackage.getEString(), "source", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Details(), theCorePackage.getStringToStringMapEntry(), null, "details", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.sdk.runtime.models.meta.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Namespace(), theEcorePackage.getEString(), "namespace", null, 0, 1, org.nasdanika.sdk.runtime.models.meta.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Prefix(), theEcorePackage.getEString(), "prefix", null, 0, 1, org.nasdanika.sdk.runtime.models.meta.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), theEcorePackage.getEString(), "version", null, 0, 1, org.nasdanika.sdk.runtime.models.meta.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Classifiers(), this.getClassifier(), null, "classifiers", null, 0, -1, org.nasdanika.sdk.runtime.models.meta.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.nasdanika.sdk.runtime.models.meta.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, org.nasdanika.sdk.runtime.models.meta.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperTypes(), this.getTypeReference(), null, "superTypes", null, 0, -1, org.nasdanika.sdk.runtime.models.meta.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Features(), this.getFeature(), null, "features", null, 0, -1, org.nasdanika.sdk.runtime.models.meta.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Operations(), this.getOperation(), null, "operations", null, 0, -1, org.nasdanika.sdk.runtime.models.meta.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Representation(), this.getPrimitiveKind(), "representation", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_SourceType(), theEcorePackage.getEString(), "sourceType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, org.nasdanika.sdk.runtime.models.meta.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Literals(), this.getEnumLiteral(), null, "literals", null, 0, -1, org.nasdanika.sdk.runtime.models.meta.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumLiteral_Ordinal(), theEcorePackage.getEInt(), "ordinal", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getTypeReference(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedElement_LowerBound(), theEcorePackage.getEInt(), "lowerBound", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedElement_UpperBound(), theEcorePackage.getEInt(), "upperBound", "1", 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedElement_Ordered(), theEcorePackage.getEBoolean(), "ordered", "true", 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedElement_Unique(), theEcorePackage.getEBoolean(), "unique", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Derived(), theEcorePackage.getEBoolean(), "derived", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_DefaultValue(), theEcorePackage.getEString(), "defaultValue", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Identifying(), theEcorePackage.getEBoolean(), "identifying", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Containment(), theEcorePackage.getEBoolean(), "containment", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Opposite(), this.getReference(), null, "opposite", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Keys(), this.getAttribute(), null, "keys", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Exceptions(), this.getTypeReference(), null, "exceptions", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Variadic(), theEcorePackage.getEBoolean(), "variadic", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DefaultValue(), theEcorePackage.getEString(), "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameter_Bound(), this.getTypeReference(), null, "bound", null, 0, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeParameter_Default(), this.getTypeReference(), null, "default", null, 0, 1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierReferenceEClass, ClassifierReference.class, "ClassifierReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierReference_Target(), this.getClassifier(), null, "target", null, 0, 1, ClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierReference_Namespace(), theEcorePackage.getEString(), "namespace", null, 0, 1, ClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierReference_ClassifierName(), theEcorePackage.getEString(), "classifierName", null, 0, 1, ClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifierReference_TypeArguments(), this.getTypeReference(), null, "typeArguments", null, 0, -1, ClassifierReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParameterReferenceEClass, TypeParameterReference.class, "TypeParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameterReference_Target(), this.getTypeParameter(), null, "target", null, 0, 1, TypeParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeParameterReference_ParameterName(), theEcorePackage.getEString(), "parameterName", null, 0, 1, TypeParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeReferenceEClass, PrimitiveTypeReference.class, "PrimitiveTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveTypeReference_Kind(), this.getPrimitiveKind(), "kind", null, 0, 1, PrimitiveTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionTypeReferenceEClass, UnionTypeReference.class, "UnionTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionTypeReference_Types(), this.getTypeReference(), null, "types", null, 0, -1, UnionTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueTypeReferenceEClass, OpaqueTypeReference.class, "OpaqueTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueTypeReference_Text(), theEcorePackage.getEString(), "text", null, 0, 1, OpaqueTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueTypeReference_References(), this.getTypeReference(), null, "references", null, 0, -1, OpaqueTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, org.nasdanika.sdk.runtime.models.meta.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Type(), this.getClass_(), null, "type", null, 0, 1, org.nasdanika.sdk.runtime.models.meta.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, org.nasdanika.sdk.runtime.models.meta.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObject__GetIdentities(), theEcorePackage.getEJavaObject(), "getIdentities", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getObject__GetContainer(), this.getObject(), "getContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getObject__GetContainmentFeature(), this.getFeature(), "getContainmentFeature", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getObject__Get__Feature(), theEcorePackage.getEJavaObject(), "get", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Get__Feature_int_int(), theEcorePackage.getEJavaObject(), "get", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "from", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "count", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Set__Feature_Object(), null, "set", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Set__Feature_Object_int(), null, "set", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "index", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Add__Feature_Object_int(), null, "add", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "index", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Remove__Feature_Object(), null, "remove", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Remove__Feature_Object_int(), null, "remove", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "index", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Unset__Feature(), null, "unset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Size__Feature(), theEcorePackage.getEInt(), "size", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__Invoke__Operation_EList(), this.getObject(), "invoke", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperation(), "operation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "arguments", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__GetIncomingReferences__EList(), this.getIncomingReference(), "getIncomingReferences", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReference(), "references", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__GetIncomingReferences__EList_int_int(), this.getIncomingReference(), "getIncomingReferences", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReference(), "references", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "from", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "count", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObject__GetIncomingReferenceCount__EList(), theEcorePackage.getEInt(), "getIncomingReferenceCount", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getReference(), "references", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getObject__IsResolved(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(incomingReferenceEClass, IncomingReference.class, "IncomingReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingReference_Source(), this.getObject(), null, "source", null, 0, 1, IncomingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomingReference_Reference(), this.getReference(), null, "reference", null, 0, 1, IncomingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncomingReference_Index(), theEcorePackage.getEInt(), "index", "-1", 0, 1, IncomingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveKindEEnum, PrimitiveKind.class, "PrimitiveKind");
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.STRING);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.NUMBER);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.BOOLEAN);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.BIGINT);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.DATE);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.TIME);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.DATE_TIME);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.DURATION);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.BINARY);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.ANY);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.NULL);
		addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.VOID);

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
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base of everything. Inherits name, documentation-as-structure and nested\nmarkers from nxcore - markers are what let a Class say which XSD element or\nwhich JDBC table it was loaded from, which is the whole provenance story."
		   });
		addAnnotation
		  (getModelElement_Annotations(),
		   source,
		   new String[] {
			   "documentation", "Everything a source language expressed that this model does not. Loaders\nput what they cannot map here rather than dropping it silently, so a\nround trip back to the source stays possible even though this model is a\nprojection."
		   });
		addAnnotation
		  (annotationEClass,
		   source,
		   new String[] {
			   "documentation", "Source-keyed extra data, the same bargain Ecore\'s EAnnotation makes. The\nsource is a URI naming whoever owns the details, so two loaders never collide."
		   });
		addAnnotation
		  (getAnnotation_Source(),
		   source,
		   new String[] {
			   "documentation", " URI identifying the owner, e.g. urn:org.nasdanika or the source schema."
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nStructure\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getPackage_Namespace(),
		   source,
		   new String[] {
			   "documentation", " Namespace URI - the identity of this package, and what a reference resolves against."
		   });
		addAnnotation
		  (getPackage_Prefix(),
		   source,
		   new String[] {
			   "documentation", " Short prefix, for qualified names and generated identifiers."
		   });
		addAnnotation
		  (getPackage_Version(),
		   source,
		   new String[] {
			   "documentation", " Version of the package this model describes, e.g. 2026.9.0."
		   });
		addAnnotation
		  (getClassifier_TypeParameters(),
		   source,
		   new String[] {
			   "documentation", "Generics. Declared here rather than on Class alone so that a DataType may\nbe parameterized too - which is what a loader needs for List<T> style\nsource types."
		   });
		addAnnotation
		  (classEClass,
		   source,
		   new String[] {
			   "documentation", "A type with features. Covers what Ecore calls EClass, what Java calls a class\nor interface, and what JSON Schema calls an object schema.\n\nThere is no separate `interface` flag. Whether a Class is realized as a\nTypeScript interface, a type alias or a class is a decision for the\nprojection, not a property of the model.\n\nFLATTENING is a transformation over this model rather than a feature of it:\nit produces a Package whose Classes declare their inherited features and\noperations directly, each copied Feature carrying a nested marker back to\nthe class that declared it. Consumers that want a flat class - JSON Schema\ntool schemas, agent-facing summaries - take the flattened model; consumers\nthat want inheritance take the original.\n\nFlattening is what makes CUTTING the supertype chain lossless: once a Class\ndeclares what it inherited, a projection may stop naming the ancestors it\ncame from without the consumer losing anything but the attribution, which\nthe markers still carry. Subclasses are never collapsed into a supertype -\nremoving an ancestor\'s name is recoverable by widening the cut, removing a\ndistinction is not.\n\nFlattening is where member clashes have to be resolved: two supertypes\ncontributing the same feature name with different types. Most same-name\nencounters are not clashes - a feature reached twice through a diamond is\none feature, so dedupe by identity rather than by name - and for what is\nleft, the most derived\ndeclaration keeps the name, the other is renamed deterministically, and the\nrename is recorded on the feature as an Annotation, since it is a fact about\na transformation rather than about the domain. Resolving it here rather than in each\nemitter is not a preference: TypeScript will not compile an interface\nextending two interfaces that declare a member incompatibly, so the\nalternative is every target inventing its own spelling of the same fix."
		   });
		addAnnotation
		  (getClass_SuperTypes(),
		   source,
		   new String[] {
			   "documentation", "Supertypes as TypeReferences rather than plain references, because a\nsupertype may be parameterized: Repository<Account, string>."
		   });
		addAnnotation
		  (dataTypeEClass,
		   source,
		   new String[] {
			   "documentation", "A scalar type with a name of its own: Instant, Duration, EmailAddress.\n\n`representation` is how it crosses the wire and is what a projection emits -\nan Instant is a string. `sourceType` records where it came from and is\nprovenance only."
		   });
		addAnnotation
		  (getDataType_SourceType(),
		   source,
		   new String[] {
			   "documentation", " Fully qualified type in the source language, e.g. java.time.Instant."
		   });
		addAnnotation
		  (getEnumLiteral_Value(),
		   source,
		   new String[] {
			   "documentation", "The serialized form. Unset means the name is used, which is what EMF JSON\nand most schema languages do."
		   });
		addAnnotation
		  (getEnumLiteral_Ordinal(),
		   source,
		   new String[] {
			   "documentation", " Position, for sources whose enums are ordinal-valued."
		   });
		addAnnotation
		  (typedElementEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nTyped elements\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getTypedElement_LowerBound(),
		   source,
		   new String[] {
			   "documentation", " 0 means optional."
		   });
		addAnnotation
		  (getTypedElement_UpperBound(),
		   source,
		   new String[] {
			   "documentation", " 1 is single valued, -1 is unbounded."
		   });
		addAnnotation
		  (featureEClass,
		   source,
		   new String[] {
			   "documentation", "State. Named Feature rather than StructuralFeature because there is no other\nkind here - the \"structural\" qualifier only earns its keep in Ecore, where it\ndistinguishes features from operations on a common supertype."
		   });
		addAnnotation
		  (getFeature_Derived(),
		   source,
		   new String[] {
			   "documentation", "Computed rather than stored. Not serialized, and a projection emits it\nread only or omits it - a reflective loader cannot supply a value for it."
		   });
		addAnnotation
		  (getFeature_Readonly(),
		   source,
		   new String[] {
			   "documentation", " Emitted as readonly. Positive form of Ecore\'s `changeable`."
		   });
		addAnnotation
		  (getFeature_DefaultValue(),
		   source,
		   new String[] {
			   "documentation", " Verbatim default, in the serialized form of the type."
		   });
		addAnnotation
		  (getAttribute_Identifying(),
		   source,
		   new String[] {
			   "documentation", "This attribute identifies its instance, and a reference may cite it.\nNot named `id`: nxcore\'s StringIdentity already contributes one."
		   });
		addAnnotation
		  (getReference_Containment(),
		   source,
		   new String[] {
			   "documentation", " The target is owned by this object: a tree edge rather than a graph edge."
		   });
		addAnnotation
		  (getReference_Opposite(),
		   source,
		   new String[] {
			   "documentation", " The other end of a bidirectional reference."
		   });
		addAnnotation
		  (getReference_Keys(),
		   source,
		   new String[] {
			   "documentation", "Attributes that identify a target within the containing list, which is\nwhat turns a positional path into //@members[id=\'lea\']."
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "documentation", "Behaviour signature. Carried for fidelity when loading from Java or Ecore and\nrendered as documentation; a reflective runtime cannot implement it, so a\nprojection emits it only when something else supplies the body."
		   });
		addAnnotation
		  (getOperation_Exceptions(),
		   source,
		   new String[] {
			   "documentation", "Declared exceptions. TypeScript has no equivalent, so this does not\nproject - it survives as a JSDoc @throws and as provenance for languages\nthat do have checked exceptions."
		   });
		addAnnotation
		  (getParameter_Variadic(),
		   source,
		   new String[] {
			   "documentation", " Collects the remaining arguments: ...args. Must be last."
		   });
		addAnnotation
		  (typeParameterEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nTypes\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getTypeParameter_Bound(),
		   source,
		   new String[] {
			   "documentation", " The `extends` constraint."
		   });
		addAnnotation
		  (typeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "A type in a type position. Small on purpose: enough to write a declaration,\nwith OpaqueTypeReference as the release valve."
		   });
		addAnnotation
		  (classifierReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Reference to a Classifier. `target` is set within a model; `namespace` plus\n`classifierName` name one in a package this model does not contain, which is\nwhat lets a package be loaded and projected on its own."
		   });
		addAnnotation
		  (getTypeParameterReference_ParameterName(),
		   source,
		   new String[] {
			   "documentation", " Name, for when the parameter is declared outside the loaded fragment."
		   });
		addAnnotation
		  (unionTypeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "One of several. Present because JSON Schema oneOf, XSD choice and TypeScript\nunions are all the same shape, and because optionality alone cannot express\nthem."
		   });
		addAnnotation
		  (opaqueTypeReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Verbatim type text for what no class here covers - conditional and mapped\ntypes, tuples, intersections. `references` keeps the named types visible to a\nprojection\'s import resolver, so opaque text does not silently break import\nmanagement."
		   });
		addAnnotation
		  (primitiveKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How a value crosses the wire. Deliberately a serialization vocabulary rather\nthan a language one: NUMBER covers every numeric width, because JSON has one\nnumber and TypeScript has one number."
		   });
		addAnnotation
		  (objectEClass,
		   source,
		   new String[] {
			   "documentation", " ---------------------------------------------------------------------------\nInstances\n\nThe M1 layer. Until now this model described types and had no way to express\nan instance of one, which made \"metacircular by construction\" true at M2 and\nuseless at M1: a vocabulary could say that Measure is a Class and had nowhere\nto put the measures.\n\nPURELY REFLECTIVE, which is the whole difference from EObject. There is no\ngenerated interface per Class, no implementation class, no factory. An Object\nknows its type by reference and answers about itself through six operations.\nThat is what makes it portable: a browser gets instances without a code\ngenerator, and an agent gets an interaction surface it can be taught in a\nparagraph.\n\nIMPLEMENTED BY PROJECTING TO ECORE. This model already generates a dynamic\nEPackage, so the obvious runtime is dynamic EMF instances behind this\ninterface: EMF does resources, serialization, change recording and proxy\nresolution, and callers see six operations instead of thirty. The cost to\nwatch is a wrapper per object on a large model, so the Ecore-backed\nimplementation should be an adapter cached per instance, or dynamic EMF should\nimplement this interface directly.\n\nWHAT IS DELIBERATELY ABSENT, and the rule that keeps it absent: an operation\nbelongs here only if a consumer cannot compute it from the others plus the\ntype WITHOUT LOADING DATA IT DID NOT ASK FOR. Contents are derivable from the\ntype\'s containment references plus get, so there is no contents operation, and\na caller wanting contents wants the data anyway. Adapters, notification and\nchange recording belong to an implementation, not to this surface. Proxy\nresolution is discussed on the resolved operation below and is the one place\nthis surface deliberately hides something real.\n\nThe second clause of that rule is load bearing and was added late. It is what\nadmits size and indexed get, and it is narrow on purpose: \"this would be\nfaster as a primitive\" is not a reason, \"this cannot be answered without\nfetching a thousand objects to count them\" is.\n---------------------------------------------------------------------------"
		   });
		addAnnotation
		  (getObject__GetIdentities(),
		   source,
		   new String[] {
			   "documentation", "*\nObject identities - zero or more.\nA value object has no identity, an entity has one or more"
		   });
		addAnnotation
		  (getObject__Get__Feature(),
		   source,
		   new String[] {
			   "documentation", "For a many-valued feature the result is a list. Whether that list is live\nis an implementation decision, and this surface says it is not: mutation\ngoes through set, add, remove and unset, because a live list leaking out\nof a getter is awkward in Java and worse in TypeScript."
		   });
		addAnnotation
		  (getObject__Get__Feature_int_int(),
		   source,
		   new String[] {
			   "documentation", "A range of a many-valued feature, without materializing the rest.\n\nThe completion of size, on the same grounds and satisfying them better\nthan the indexed get an earlier draft had: size alone tells a caller a\nfeature holds a thousand values and leaves fetching them costing all\nthousand, and a one-at-a-time get fixes the data volume and not the round\ntrips. This REPLACES indexed get rather than joining it, because\nget(f, i, 1) is the indexed case and a convenience wrapper belongs in a\nutility rather than on a surface meant to be taught in a paragraph.\n\n`count` is a maximum. Fewer values are returned near the end rather than\nan error, because every paging API that throws on an overlong final page\nis a paging API whose callers write the same clamping loop.\n\nOFFSET PAGING ASSUMES A STABLE ORDER, which is worth saying because this\nmodel makes order optional: TypedElement carries `ordered`, and over a\nfeature that is not ordered, or over data changing underneath the caller,\npage two may repeat or skip what page one returned. That is the ordinary\noffset-versus-cursor problem and it is not solved here. It is solved where\nit belongs, by paging against a snapshot with a freshness policy rather\nthan against a live source."
		   });
		addAnnotation
		  (getObject__Unset__Feature(),
		   source,
		   new String[] {
			   "documentation", "Restores the unset state, which is not the same as setting a default.\n\nKept as its own operation rather than folded into set, because set with a\nnull value says nothing coherent about a many-valued feature, and unset is\nthe one spelling that works for both cardinalities."
		   });
		addAnnotation
		  (getObject__Size__Feature(),
		   source,
		   new String[] {
			   "documentation", "How many values a feature holds. Zero for unset, and for a single-valued\nfeature the answer is only ever zero or one.\n\nTHIS REPLACES A SEPARATE isSet, which an earlier draft had. Under\nmultiplicity semantics `size == 0` and \"not set\" are the same statement,\nfor both cardinalities, so carrying both operations would mean carrying\ntwo vocabularies for one fact. EMF reaches the same place from the other\ndirection: eIsSet on a many-valued feature is already defined as \"the list\nis not empty\". Nothing is lost here because this model has no unsettable\nflag, so there is no third state to distinguish.\n\nIt is also the first operation admitted on COST rather than on\nexpressiveness, and the grounds are narrow: size is computable from get,\nbut only by materializing a list the caller did not ask for, which for a\nlazily loaded containment or a remote surface is the whole expense. The\nrule the surface is held to therefore reads: an operation belongs here\nonly if a consumer cannot compute it from the others without loading data\nit did not ask for.\n\nAnd it is the runtime counterpart to lowerBound and upperBound on\nTypedElement, which is what makes multiplicity validation reflective:\nchecking a feature is size between its bounds, rather than fetching\neverything to count it."
		   });
		addAnnotation
		  (getObject__Invoke__Operation_EList(),
		   source,
		   new String[] {
			   "documentation", "Where the implementation comes from is not this model\'s business. In this\necosystem it resolves through the capability framework, which is the same\nmechanism a tool catalog uses to bind an operation."
		   });
		addAnnotation
		  (getObject__GetIncomingReferences__EList(),
		   source,
		   new String[] {
			   "documentation", "Objects referencing this one, the reference they do it through, and the\nposition within it.\n\nNot derivable from anything else, which is why it is here rather than in a\nutility: an object cannot see its own referrers without something\nmaintaining a reverse index.\n\nFILTERED BY REFERENCE, because the alternative is fetching every referrer\nand discarding most of them, which is the pushdown problem from the graph\nprovider contract arriving one layer down. Filtering by reference is the\nminimal predicate every implementation can honour, and it is exactly what\na Cypher pattern like <-[:owns]- needs.\n\nAn empty or null array means all references. The single-reference and\nno-argument flavours are conveniences and belong in a utility, for the\nsame reason a one-element range get does: the array form subsumes them.\n\nREAD ONLY, and deliberately. Incoming references are DERIVED. They change\nwhen the referring object\'s feature changes, and offering a mutator here\nwould be a second way to perform the same edit with different provenance,\nwhich is how two views of one fact stop agreeing.\n\nNot on an agent\'s surface, though the capability is. An agent reaches this\nthrough <-[...]- in a query, which is the same thing with better\nergonomics. This is the substrate; a query language is the presentation,\nthe same split a tool definition makes between what can be called and how\nit is offered."
		   });
		addAnnotation
		  (getObject__GetIncomingReferences__EList_int_int(),
		   source,
		   new String[] {
			   "documentation", " A page of them. Same contract as the range get above: count is a maximum."
		   });
		addAnnotation
		  (getObject__GetIncomingReferenceCount__EList(),
		   source,
		   new String[] {
			   "documentation", "How many, or -1 when the question cannot be answered here.\n\nThe -1 is the load bearing part. A reverse index is not always available:\na lazily loaded or remote model may have no way to know who points at an\nobject without loading everything. Returning zero in that case would be\nindistinguishable from \"nobody references this\", which is the failure the\nloaders already have a rule against, and -1 for \"no idea\" is the\nconvention the graph provider\'s cardinality estimate already uses.\n\nIt therefore does double duty as the capability check, and costs no extra\noperation to do it."
		   });
		addAnnotation
		  (getObject__IsResolved(),
		   source,
		   new String[] {
			   "documentation", "False when this object stands for one that has not been loaded.\n\nThe one concession to proxies. An earlier draft left them out as an EMF\nconcern, and that does not survive the federation claim: references cross\nresources by URI, so something has to represent \"not here yet\". Resolution\nitself stays an implementation concern; what this surface owes a caller is\nthe ability to tell the difference before it reads a feature and gets a\nsurprise."
		   });
		addAnnotation
		  (getObject_Type(),
		   source,
		   new String[] {
			   "documentation", "The type. A REFERENCE rather than a fixed property of the instance, which\nis the single most consequential difference from EObject and from every\nclass-based language.\n\nUnset means untyped, which is a legitimate state rather than an error. See\nthe retyping note below."
		   });
		addAnnotation
		  (getObject_Annotations(),
		   source,
		   new String[] {
			   "documentation", "Values that have no typed home yet, or no typed home at all.\n\nThe same Annotation a loader uses to record what it could not map, used in\nthe other direction. Before an object is classified there is nowhere typed\nto put anything, so elicited data lands here; classification then promotes\nwhat fits into features and leaves the rest where it was. Promotion in one\ndirection, residue in the other, one mechanism."
		   });
		addAnnotation
		  (incomingReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Who points at an object, through what, and where.\n\nA value rather than a ModelElement: it has no identity of its own, it is not\ndocumented, and it exists only as an answer. Making it an element would\nsuggest it can be stored, and it cannot be: it is derived from the referring\nobject\'s feature and changes when that does."
		   });
		addAnnotation
		  (getIncomingReference_Index(),
		   source,
		   new String[] {
			   "documentation", " Position in a many-valued reference, or -1 when single-valued."
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

} //MetaPackageImpl
