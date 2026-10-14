/**
 */
package org.nasdanika.sdk.runtime.models.meta.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.meta.Annotation;
import org.nasdanika.sdk.runtime.models.meta.Attribute;
import org.nasdanika.sdk.runtime.models.meta.Classifier;
import org.nasdanika.sdk.runtime.models.meta.ClassifierReference;
import org.nasdanika.sdk.runtime.models.meta.DataType;
import org.nasdanika.sdk.runtime.models.meta.EnumLiteral;
import org.nasdanika.sdk.runtime.models.meta.Feature;
import org.nasdanika.sdk.runtime.models.meta.IncomingReference;
import org.nasdanika.sdk.runtime.models.meta.MetaPackage;
import org.nasdanika.sdk.runtime.models.meta.ModelElement;
import org.nasdanika.sdk.runtime.models.meta.OpaqueTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Operation;
import org.nasdanika.sdk.runtime.models.meta.Parameter;
import org.nasdanika.sdk.runtime.models.meta.PrimitiveTypeReference;
import org.nasdanika.sdk.runtime.models.meta.Reference;
import org.nasdanika.sdk.runtime.models.meta.TypeParameter;
import org.nasdanika.sdk.runtime.models.meta.TypeParameterReference;
import org.nasdanika.sdk.runtime.models.meta.TypeReference;
import org.nasdanika.sdk.runtime.models.meta.TypedElement;
import org.nasdanika.sdk.runtime.models.meta.UnionTypeReference;

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
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage
 * @generated
 */
public class MetaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaPackage.eINSTANCE;
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
			case MetaPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseNamedElement(modelElement);
				if (result == null) result = caseCore_ModelElement(modelElement);
				if (result == null) result = caseStringIdentity(modelElement);
				if (result == null) result = caseDocumented(modelElement);
				if (result == null) result = caseMarked(modelElement);
				if (result == null) result = caseReferrable(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseModelElement(annotation);
				if (result == null) result = caseNamedElement(annotation);
				if (result == null) result = caseCore_ModelElement(annotation);
				if (result == null) result = caseStringIdentity(annotation);
				if (result == null) result = caseDocumented(annotation);
				if (result == null) result = caseMarked(annotation);
				if (result == null) result = caseReferrable(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.PACKAGE: {
				org.nasdanika.sdk.runtime.models.meta.Package package_ = (org.nasdanika.sdk.runtime.models.meta.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseCore_ModelElement(package_);
				if (result == null) result = caseStringIdentity(package_);
				if (result == null) result = caseDocumented(package_);
				if (result == null) result = caseMarked(package_);
				if (result == null) result = caseReferrable(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseModelElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseCore_ModelElement(classifier);
				if (result == null) result = caseStringIdentity(classifier);
				if (result == null) result = caseDocumented(classifier);
				if (result == null) result = caseMarked(classifier);
				if (result == null) result = caseReferrable(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.CLASS: {
				org.nasdanika.sdk.runtime.models.meta.Class class_ = (org.nasdanika.sdk.runtime.models.meta.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseModelElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseCore_ModelElement(class_);
				if (result == null) result = caseStringIdentity(class_);
				if (result == null) result = caseDocumented(class_);
				if (result == null) result = caseMarked(class_);
				if (result == null) result = caseReferrable(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseCore_ModelElement(dataType);
				if (result == null) result = caseStringIdentity(dataType);
				if (result == null) result = caseDocumented(dataType);
				if (result == null) result = caseMarked(dataType);
				if (result == null) result = caseReferrable(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.ENUM: {
				org.nasdanika.sdk.runtime.models.meta.Enum enum_ = (org.nasdanika.sdk.runtime.models.meta.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseClassifier(enum_);
				if (result == null) result = caseModelElement(enum_);
				if (result == null) result = caseNamedElement(enum_);
				if (result == null) result = caseCore_ModelElement(enum_);
				if (result == null) result = caseStringIdentity(enum_);
				if (result == null) result = caseDocumented(enum_);
				if (result == null) result = caseMarked(enum_);
				if (result == null) result = caseReferrable(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = caseModelElement(enumLiteral);
				if (result == null) result = caseNamedElement(enumLiteral);
				if (result == null) result = caseCore_ModelElement(enumLiteral);
				if (result == null) result = caseStringIdentity(enumLiteral);
				if (result == null) result = caseDocumented(enumLiteral);
				if (result == null) result = caseMarked(enumLiteral);
				if (result == null) result = caseReferrable(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseModelElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseCore_ModelElement(typedElement);
				if (result == null) result = caseStringIdentity(typedElement);
				if (result == null) result = caseDocumented(typedElement);
				if (result == null) result = caseMarked(typedElement);
				if (result == null) result = caseReferrable(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseTypedElement(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseCore_ModelElement(feature);
				if (result == null) result = caseStringIdentity(feature);
				if (result == null) result = caseDocumented(feature);
				if (result == null) result = caseMarked(feature);
				if (result == null) result = caseReferrable(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseTypedElement(attribute);
				if (result == null) result = caseModelElement(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseCore_ModelElement(attribute);
				if (result == null) result = caseStringIdentity(attribute);
				if (result == null) result = caseDocumented(attribute);
				if (result == null) result = caseMarked(attribute);
				if (result == null) result = caseReferrable(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseFeature(reference);
				if (result == null) result = caseTypedElement(reference);
				if (result == null) result = caseModelElement(reference);
				if (result == null) result = caseNamedElement(reference);
				if (result == null) result = caseCore_ModelElement(reference);
				if (result == null) result = caseStringIdentity(reference);
				if (result == null) result = caseDocumented(reference);
				if (result == null) result = caseMarked(reference);
				if (result == null) result = caseReferrable(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseTypedElement(operation);
				if (result == null) result = caseModelElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseCore_ModelElement(operation);
				if (result == null) result = caseStringIdentity(operation);
				if (result == null) result = caseDocumented(operation);
				if (result == null) result = caseMarked(operation);
				if (result == null) result = caseReferrable(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseCore_ModelElement(parameter);
				if (result == null) result = caseStringIdentity(parameter);
				if (result == null) result = caseDocumented(parameter);
				if (result == null) result = caseMarked(parameter);
				if (result == null) result = caseReferrable(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T result = caseTypeParameter(typeParameter);
				if (result == null) result = caseModelElement(typeParameter);
				if (result == null) result = caseNamedElement(typeParameter);
				if (result == null) result = caseCore_ModelElement(typeParameter);
				if (result == null) result = caseStringIdentity(typeParameter);
				if (result == null) result = caseDocumented(typeParameter);
				if (result == null) result = caseMarked(typeParameter);
				if (result == null) result = caseReferrable(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseModelElement(typeReference);
				if (result == null) result = caseNamedElement(typeReference);
				if (result == null) result = caseCore_ModelElement(typeReference);
				if (result == null) result = caseStringIdentity(typeReference);
				if (result == null) result = caseDocumented(typeReference);
				if (result == null) result = caseMarked(typeReference);
				if (result == null) result = caseReferrable(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.CLASSIFIER_REFERENCE: {
				ClassifierReference classifierReference = (ClassifierReference)theEObject;
				T result = caseClassifierReference(classifierReference);
				if (result == null) result = caseTypeReference(classifierReference);
				if (result == null) result = caseModelElement(classifierReference);
				if (result == null) result = caseNamedElement(classifierReference);
				if (result == null) result = caseCore_ModelElement(classifierReference);
				if (result == null) result = caseStringIdentity(classifierReference);
				if (result == null) result = caseDocumented(classifierReference);
				if (result == null) result = caseMarked(classifierReference);
				if (result == null) result = caseReferrable(classifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.TYPE_PARAMETER_REFERENCE: {
				TypeParameterReference typeParameterReference = (TypeParameterReference)theEObject;
				T result = caseTypeParameterReference(typeParameterReference);
				if (result == null) result = caseTypeReference(typeParameterReference);
				if (result == null) result = caseModelElement(typeParameterReference);
				if (result == null) result = caseNamedElement(typeParameterReference);
				if (result == null) result = caseCore_ModelElement(typeParameterReference);
				if (result == null) result = caseStringIdentity(typeParameterReference);
				if (result == null) result = caseDocumented(typeParameterReference);
				if (result == null) result = caseMarked(typeParameterReference);
				if (result == null) result = caseReferrable(typeParameterReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.PRIMITIVE_TYPE_REFERENCE: {
				PrimitiveTypeReference primitiveTypeReference = (PrimitiveTypeReference)theEObject;
				T result = casePrimitiveTypeReference(primitiveTypeReference);
				if (result == null) result = caseTypeReference(primitiveTypeReference);
				if (result == null) result = caseModelElement(primitiveTypeReference);
				if (result == null) result = caseNamedElement(primitiveTypeReference);
				if (result == null) result = caseCore_ModelElement(primitiveTypeReference);
				if (result == null) result = caseStringIdentity(primitiveTypeReference);
				if (result == null) result = caseDocumented(primitiveTypeReference);
				if (result == null) result = caseMarked(primitiveTypeReference);
				if (result == null) result = caseReferrable(primitiveTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.UNION_TYPE_REFERENCE: {
				UnionTypeReference unionTypeReference = (UnionTypeReference)theEObject;
				T result = caseUnionTypeReference(unionTypeReference);
				if (result == null) result = caseTypeReference(unionTypeReference);
				if (result == null) result = caseModelElement(unionTypeReference);
				if (result == null) result = caseNamedElement(unionTypeReference);
				if (result == null) result = caseCore_ModelElement(unionTypeReference);
				if (result == null) result = caseStringIdentity(unionTypeReference);
				if (result == null) result = caseDocumented(unionTypeReference);
				if (result == null) result = caseMarked(unionTypeReference);
				if (result == null) result = caseReferrable(unionTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.OPAQUE_TYPE_REFERENCE: {
				OpaqueTypeReference opaqueTypeReference = (OpaqueTypeReference)theEObject;
				T result = caseOpaqueTypeReference(opaqueTypeReference);
				if (result == null) result = caseTypeReference(opaqueTypeReference);
				if (result == null) result = caseModelElement(opaqueTypeReference);
				if (result == null) result = caseNamedElement(opaqueTypeReference);
				if (result == null) result = caseCore_ModelElement(opaqueTypeReference);
				if (result == null) result = caseStringIdentity(opaqueTypeReference);
				if (result == null) result = caseDocumented(opaqueTypeReference);
				if (result == null) result = caseMarked(opaqueTypeReference);
				if (result == null) result = caseReferrable(opaqueTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.OBJECT: {
				org.nasdanika.sdk.runtime.models.meta.Object object = (org.nasdanika.sdk.runtime.models.meta.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetaPackage.INCOMING_REFERENCE: {
				IncomingReference incomingReference = (IncomingReference)theEObject;
				T result = caseIncomingReference(incomingReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
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
	public T casePackage(org.nasdanika.sdk.runtime.models.meta.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.nasdanika.sdk.runtime.models.meta.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(org.nasdanika.sdk.runtime.models.meta.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierReference(ClassifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameterReference(TypeParameterReference object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(org.nasdanika.sdk.runtime.models.meta.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incoming Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incoming Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncomingReference(IncomingReference object) {
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
	public T caseCore_ModelElement(org.nasdanika.sdk.runtime.models.core.ModelElement object) {
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

} //MetaSwitch
