/**
 */
package org.nasdanika.sdk.runtime.models.jvm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.jvm.Exports;
import org.nasdanika.sdk.runtime.models.jvm.Field;
import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;
import org.nasdanika.sdk.runtime.models.jvm.JvmElement;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Layer;
import org.nasdanika.sdk.runtime.models.jvm.Member;
import org.nasdanika.sdk.runtime.models.jvm.Method;
import org.nasdanika.sdk.runtime.models.jvm.Opens;
import org.nasdanika.sdk.runtime.models.jvm.Parameter;
import org.nasdanika.sdk.runtime.models.jvm.Provides;
import org.nasdanika.sdk.runtime.models.jvm.Requires;
import org.nasdanika.sdk.runtime.models.jvm.Type;

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
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage
 * @generated
 */
public class JvmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JvmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmSwitch() {
		if (modelPackage == null) {
			modelPackage = JvmPackage.eINSTANCE;
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
			case JvmPackage.JVM_ELEMENT: {
				JvmElement jvmElement = (JvmElement)theEObject;
				T result = caseJvmElement(jvmElement);
				if (result == null) result = caseNamedElement(jvmElement);
				if (result == null) result = caseModelElement(jvmElement);
				if (result == null) result = caseStringIdentity(jvmElement);
				if (result == null) result = caseDocumented(jvmElement);
				if (result == null) result = caseMarked(jvmElement);
				if (result == null) result = caseReferrable(jvmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.JAVA_VIRTUAL_MACHINE: {
				JavaVirtualMachine javaVirtualMachine = (JavaVirtualMachine)theEObject;
				T result = caseJavaVirtualMachine(javaVirtualMachine);
				if (result == null) result = caseModelElement(javaVirtualMachine);
				if (result == null) result = caseStringIdentity(javaVirtualMachine);
				if (result == null) result = caseDocumented(javaVirtualMachine);
				if (result == null) result = caseMarked(javaVirtualMachine);
				if (result == null) result = caseReferrable(javaVirtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseJvmElement(layer);
				if (result == null) result = caseNamedElement(layer);
				if (result == null) result = caseModelElement(layer);
				if (result == null) result = caseStringIdentity(layer);
				if (result == null) result = caseDocumented(layer);
				if (result == null) result = caseMarked(layer);
				if (result == null) result = caseReferrable(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.CLASS_LOADER: {
				org.nasdanika.sdk.runtime.models.jvm.ClassLoader classLoader = (org.nasdanika.sdk.runtime.models.jvm.ClassLoader)theEObject;
				T result = caseClassLoader(classLoader);
				if (result == null) result = caseJvmElement(classLoader);
				if (result == null) result = caseNamedElement(classLoader);
				if (result == null) result = caseModelElement(classLoader);
				if (result == null) result = caseStringIdentity(classLoader);
				if (result == null) result = caseDocumented(classLoader);
				if (result == null) result = caseMarked(classLoader);
				if (result == null) result = caseReferrable(classLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.MODULE: {
				org.nasdanika.sdk.runtime.models.jvm.Module module = (org.nasdanika.sdk.runtime.models.jvm.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseJvmElement(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseStringIdentity(module);
				if (result == null) result = caseDocumented(module);
				if (result == null) result = caseMarked(module);
				if (result == null) result = caseReferrable(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.REQUIRES: {
				Requires requires = (Requires)theEObject;
				T result = caseRequires(requires);
				if (result == null) result = caseJvmElement(requires);
				if (result == null) result = caseNamedElement(requires);
				if (result == null) result = caseModelElement(requires);
				if (result == null) result = caseStringIdentity(requires);
				if (result == null) result = caseDocumented(requires);
				if (result == null) result = caseMarked(requires);
				if (result == null) result = caseReferrable(requires);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.EXPORTS: {
				Exports exports = (Exports)theEObject;
				T result = caseExports(exports);
				if (result == null) result = caseJvmElement(exports);
				if (result == null) result = caseNamedElement(exports);
				if (result == null) result = caseModelElement(exports);
				if (result == null) result = caseStringIdentity(exports);
				if (result == null) result = caseDocumented(exports);
				if (result == null) result = caseMarked(exports);
				if (result == null) result = caseReferrable(exports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.OPENS: {
				Opens opens = (Opens)theEObject;
				T result = caseOpens(opens);
				if (result == null) result = caseJvmElement(opens);
				if (result == null) result = caseNamedElement(opens);
				if (result == null) result = caseModelElement(opens);
				if (result == null) result = caseStringIdentity(opens);
				if (result == null) result = caseDocumented(opens);
				if (result == null) result = caseMarked(opens);
				if (result == null) result = caseReferrable(opens);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.PROVIDES: {
				Provides provides = (Provides)theEObject;
				T result = caseProvides(provides);
				if (result == null) result = caseJvmElement(provides);
				if (result == null) result = caseNamedElement(provides);
				if (result == null) result = caseModelElement(provides);
				if (result == null) result = caseStringIdentity(provides);
				if (result == null) result = caseDocumented(provides);
				if (result == null) result = caseMarked(provides);
				if (result == null) result = caseReferrable(provides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.PACKAGE: {
				org.nasdanika.sdk.runtime.models.jvm.Package package_ = (org.nasdanika.sdk.runtime.models.jvm.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseJvmElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseStringIdentity(package_);
				if (result == null) result = caseDocumented(package_);
				if (result == null) result = caseMarked(package_);
				if (result == null) result = caseReferrable(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseJvmElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseModelElement(type);
				if (result == null) result = caseStringIdentity(type);
				if (result == null) result = caseDocumented(type);
				if (result == null) result = caseMarked(type);
				if (result == null) result = caseReferrable(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = caseJvmElement(member);
				if (result == null) result = caseNamedElement(member);
				if (result == null) result = caseModelElement(member);
				if (result == null) result = caseStringIdentity(member);
				if (result == null) result = caseDocumented(member);
				if (result == null) result = caseMarked(member);
				if (result == null) result = caseReferrable(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseMember(method);
				if (result == null) result = caseJvmElement(method);
				if (result == null) result = caseNamedElement(method);
				if (result == null) result = caseModelElement(method);
				if (result == null) result = caseStringIdentity(method);
				if (result == null) result = caseDocumented(method);
				if (result == null) result = caseMarked(method);
				if (result == null) result = caseReferrable(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseMember(field);
				if (result == null) result = caseJvmElement(field);
				if (result == null) result = caseNamedElement(field);
				if (result == null) result = caseModelElement(field);
				if (result == null) result = caseStringIdentity(field);
				if (result == null) result = caseDocumented(field);
				if (result == null) result = caseMarked(field);
				if (result == null) result = caseReferrable(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JvmPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseJvmElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = caseStringIdentity(parameter);
				if (result == null) result = caseDocumented(parameter);
				if (result == null) result = caseMarked(parameter);
				if (result == null) result = caseReferrable(parameter);
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
	public T caseJvmElement(JvmElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaVirtualMachine(JavaVirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassLoader(org.nasdanika.sdk.runtime.models.jvm.ClassLoader object) {
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
	public T caseModule(org.nasdanika.sdk.runtime.models.jvm.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequires(Requires object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExports(Exports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opens</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opens</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpens(Opens object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvides(Provides object) {
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
	public T casePackage(org.nasdanika.sdk.runtime.models.jvm.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
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

} //JvmSwitch
