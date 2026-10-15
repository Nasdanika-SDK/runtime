/**
 */
package org.nasdanika.sdk.runtime.models.meta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.meta.Annotation;
import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.DataType;
import org.nasdanika.sdk.runtime.models.meta.EnumLiteral;
import org.nasdanika.sdk.runtime.models.meta.IncomingReference;
import org.nasdanika.sdk.runtime.models.meta.IntersectionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.MetaFactory;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Operation;
import org.nasdanika.sdk.runtime.models.meta.Parameter;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveKind;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.TypeParameter;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;
import org.nasdanika.sdk.runtime.models.meta.UnionTypeReference;
import org.nasdanika.sdk.runtime.models.meta.WildcardTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaFactoryImpl extends EFactoryImpl implements MetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaFactory init() {
		try {
			MetaFactory theMetaFactory = (MetaFactory)EPackage.Registry.INSTANCE.getEFactory(MetaPackage.eNS_URI);
			if (theMetaFactory != null) {
				return theMetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactoryImpl() {
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
			case MetaPackage.ANNOTATION: return createAnnotation();
			case MetaPackage.PACKAGE: return createPackage();
			case MetaPackage.CLASS: return createClass();
			case MetaPackage.DATA_TYPE: return createDataType();
			case MetaPackage.ENUM: return createEnum();
			case MetaPackage.ENUM_LITERAL: return createEnumLiteral();
			case MetaPackage.ATTRIBUTE: return createAttribute();
			case MetaPackage.REFERENCE: return createReference();
			case MetaPackage.OPERATION: return createOperation();
			case MetaPackage.PARAMETER: return createParameter();
			case MetaPackage.TYPE_PARAMETER: return createTypeParameter();
			case MetaPackage.CLASSIFIER_REFERENCE: return createClassifierReference();
			case MetaPackage.TYPE_PARAMETER_REFERENCE: return createTypeParameterReference();
			case MetaPackage.PRIMITIVE_TYPE_REFERENCE: return createPrimitiveTypeReference();
			case MetaPackage.UNION_TYPE_REFERENCE: return createUnionTypeReference();
			case MetaPackage.INTERSECTION_TYPE_REFERENCE: return createIntersectionTypeReference();
			case MetaPackage.WILDCARD_TYPE_REFERENCE: return createWildcardTypeReference();
			case MetaPackage.OPAQUE_TYPE_REFERENCE: return createOpaqueTypeReference();
			case MetaPackage.OBJECT: return createObject();
			case MetaPackage.INCOMING_REFERENCE: return createIncomingReference();
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
			case MetaPackage.PRIMITIVE_KIND:
				return createPrimitiveKindFromString(eDataType, initialValue);
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
			case MetaPackage.PRIMITIVE_KIND:
				return convertPrimitiveKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.meta.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
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
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierReference createClassifierReference() {
		ClassifierReferenceImpl classifierReference = new ClassifierReferenceImpl();
		return classifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameterReference createTypeParameterReference() {
		TypeParameterReferenceImpl typeParameterReference = new TypeParameterReferenceImpl();
		return typeParameterReference;
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
	public WildcardTypeReference createWildcardTypeReference() {
		WildcardTypeReferenceImpl wildcardTypeReference = new WildcardTypeReferenceImpl();
		return wildcardTypeReference;
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
	public org.nasdanika.sdk.runtime.models.meta.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingReference createIncomingReference() {
		IncomingReferenceImpl incomingReference = new IncomingReferenceImpl();
		return incomingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveKind createPrimitiveKindFromString(EDataType eDataType, String initialValue) {
		PrimitiveKind result = PrimitiveKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaPackage getMetaPackage() {
		return (MetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaPackage getPackage() {
		return MetaPackage.eINSTANCE;
	}

} //MetaFactoryImpl
