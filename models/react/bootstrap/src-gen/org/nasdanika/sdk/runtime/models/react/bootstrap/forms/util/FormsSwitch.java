/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;

import org.nasdanika.sdk.runtime.models.react.JsxContainer;
import org.nasdanika.sdk.runtime.models.react.JsxNode;
import org.nasdanika.sdk.runtime.models.react.LibraryComponent;
import org.nasdanika.sdk.runtime.models.react.ReactElement;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapComponent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.*;

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
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage
 * @generated
 */
public class FormsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsSwitch() {
		if (modelPackage == null) {
			modelPackage = FormsPackage.eINSTANCE;
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
			case FormsPackage.VALIDATED: {
				Validated validated = (Validated)theEObject;
				T result = caseValidated(validated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseValidated(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseBootstrapComponent(form);
				if (result == null) result = caseLibraryComponent(form);
				if (result == null) result = caseJsxContainer(form);
				if (result == null) result = caseJsxNode(form);
				if (result == null) result = caseReactElement(form);
				if (result == null) result = caseTypeScriptElement(form);
				if (result == null) result = caseNamedElement(form);
				if (result == null) result = caseModelElement(form);
				if (result == null) result = caseStringIdentity(form);
				if (result == null) result = caseDocumented(form);
				if (result == null) result = caseMarked(form);
				if (result == null) result = caseReferrable(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_GROUP: {
				FormGroup formGroup = (FormGroup)theEObject;
				T result = caseFormGroup(formGroup);
				if (result == null) result = caseBootstrapComponent(formGroup);
				if (result == null) result = caseLibraryComponent(formGroup);
				if (result == null) result = caseJsxContainer(formGroup);
				if (result == null) result = caseJsxNode(formGroup);
				if (result == null) result = caseReactElement(formGroup);
				if (result == null) result = caseTypeScriptElement(formGroup);
				if (result == null) result = caseNamedElement(formGroup);
				if (result == null) result = caseModelElement(formGroup);
				if (result == null) result = caseStringIdentity(formGroup);
				if (result == null) result = caseDocumented(formGroup);
				if (result == null) result = caseMarked(formGroup);
				if (result == null) result = caseReferrable(formGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_LABEL: {
				FormLabel formLabel = (FormLabel)theEObject;
				T result = caseFormLabel(formLabel);
				if (result == null) result = caseBootstrapComponent(formLabel);
				if (result == null) result = caseTextContent(formLabel);
				if (result == null) result = caseLibraryComponent(formLabel);
				if (result == null) result = caseJsxContainer(formLabel);
				if (result == null) result = caseJsxNode(formLabel);
				if (result == null) result = caseReactElement(formLabel);
				if (result == null) result = caseTypeScriptElement(formLabel);
				if (result == null) result = caseNamedElement(formLabel);
				if (result == null) result = caseModelElement(formLabel);
				if (result == null) result = caseStringIdentity(formLabel);
				if (result == null) result = caseDocumented(formLabel);
				if (result == null) result = caseMarked(formLabel);
				if (result == null) result = caseReferrable(formLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_CONTROL: {
				FormControl formControl = (FormControl)theEObject;
				T result = caseFormControl(formControl);
				if (result == null) result = caseBootstrapComponent(formControl);
				if (result == null) result = caseField(formControl);
				if (result == null) result = caseLibraryComponent(formControl);
				if (result == null) result = caseValidated(formControl);
				if (result == null) result = caseJsxContainer(formControl);
				if (result == null) result = caseJsxNode(formControl);
				if (result == null) result = caseReactElement(formControl);
				if (result == null) result = caseTypeScriptElement(formControl);
				if (result == null) result = caseNamedElement(formControl);
				if (result == null) result = caseModelElement(formControl);
				if (result == null) result = caseStringIdentity(formControl);
				if (result == null) result = caseDocumented(formControl);
				if (result == null) result = caseMarked(formControl);
				if (result == null) result = caseReferrable(formControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_SELECT: {
				FormSelect formSelect = (FormSelect)theEObject;
				T result = caseFormSelect(formSelect);
				if (result == null) result = caseBootstrapComponent(formSelect);
				if (result == null) result = caseField(formSelect);
				if (result == null) result = caseLibraryComponent(formSelect);
				if (result == null) result = caseValidated(formSelect);
				if (result == null) result = caseJsxContainer(formSelect);
				if (result == null) result = caseJsxNode(formSelect);
				if (result == null) result = caseReactElement(formSelect);
				if (result == null) result = caseTypeScriptElement(formSelect);
				if (result == null) result = caseNamedElement(formSelect);
				if (result == null) result = caseModelElement(formSelect);
				if (result == null) result = caseStringIdentity(formSelect);
				if (result == null) result = caseDocumented(formSelect);
				if (result == null) result = caseMarked(formSelect);
				if (result == null) result = caseReferrable(formSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_CHECK: {
				FormCheck formCheck = (FormCheck)theEObject;
				T result = caseFormCheck(formCheck);
				if (result == null) result = caseBootstrapComponent(formCheck);
				if (result == null) result = caseField(formCheck);
				if (result == null) result = caseLibraryComponent(formCheck);
				if (result == null) result = caseValidated(formCheck);
				if (result == null) result = caseJsxContainer(formCheck);
				if (result == null) result = caseJsxNode(formCheck);
				if (result == null) result = caseReactElement(formCheck);
				if (result == null) result = caseTypeScriptElement(formCheck);
				if (result == null) result = caseNamedElement(formCheck);
				if (result == null) result = caseModelElement(formCheck);
				if (result == null) result = caseStringIdentity(formCheck);
				if (result == null) result = caseDocumented(formCheck);
				if (result == null) result = caseMarked(formCheck);
				if (result == null) result = caseReferrable(formCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_RANGE: {
				FormRange formRange = (FormRange)theEObject;
				T result = caseFormRange(formRange);
				if (result == null) result = caseBootstrapComponent(formRange);
				if (result == null) result = caseField(formRange);
				if (result == null) result = caseLibraryComponent(formRange);
				if (result == null) result = caseValidated(formRange);
				if (result == null) result = caseJsxContainer(formRange);
				if (result == null) result = caseJsxNode(formRange);
				if (result == null) result = caseReactElement(formRange);
				if (result == null) result = caseTypeScriptElement(formRange);
				if (result == null) result = caseNamedElement(formRange);
				if (result == null) result = caseModelElement(formRange);
				if (result == null) result = caseStringIdentity(formRange);
				if (result == null) result = caseDocumented(formRange);
				if (result == null) result = caseMarked(formRange);
				if (result == null) result = caseReferrable(formRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_TEXT: {
				FormText formText = (FormText)theEObject;
				T result = caseFormText(formText);
				if (result == null) result = caseBootstrapComponent(formText);
				if (result == null) result = caseTextContent(formText);
				if (result == null) result = caseLibraryComponent(formText);
				if (result == null) result = caseJsxContainer(formText);
				if (result == null) result = caseJsxNode(formText);
				if (result == null) result = caseReactElement(formText);
				if (result == null) result = caseTypeScriptElement(formText);
				if (result == null) result = caseNamedElement(formText);
				if (result == null) result = caseModelElement(formText);
				if (result == null) result = caseStringIdentity(formText);
				if (result == null) result = caseDocumented(formText);
				if (result == null) result = caseMarked(formText);
				if (result == null) result = caseReferrable(formText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_CONTROL_FEEDBACK: {
				FormControlFeedback formControlFeedback = (FormControlFeedback)theEObject;
				T result = caseFormControlFeedback(formControlFeedback);
				if (result == null) result = caseBootstrapComponent(formControlFeedback);
				if (result == null) result = caseTextContent(formControlFeedback);
				if (result == null) result = caseLibraryComponent(formControlFeedback);
				if (result == null) result = caseJsxContainer(formControlFeedback);
				if (result == null) result = caseJsxNode(formControlFeedback);
				if (result == null) result = caseReactElement(formControlFeedback);
				if (result == null) result = caseTypeScriptElement(formControlFeedback);
				if (result == null) result = caseNamedElement(formControlFeedback);
				if (result == null) result = caseModelElement(formControlFeedback);
				if (result == null) result = caseStringIdentity(formControlFeedback);
				if (result == null) result = caseDocumented(formControlFeedback);
				if (result == null) result = caseMarked(formControlFeedback);
				if (result == null) result = caseReferrable(formControlFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FLOATING_LABEL: {
				FloatingLabel floatingLabel = (FloatingLabel)theEObject;
				T result = caseFloatingLabel(floatingLabel);
				if (result == null) result = caseBootstrapComponent(floatingLabel);
				if (result == null) result = caseLibraryComponent(floatingLabel);
				if (result == null) result = caseJsxContainer(floatingLabel);
				if (result == null) result = caseJsxNode(floatingLabel);
				if (result == null) result = caseReactElement(floatingLabel);
				if (result == null) result = caseTypeScriptElement(floatingLabel);
				if (result == null) result = caseNamedElement(floatingLabel);
				if (result == null) result = caseModelElement(floatingLabel);
				if (result == null) result = caseStringIdentity(floatingLabel);
				if (result == null) result = caseDocumented(floatingLabel);
				if (result == null) result = caseMarked(floatingLabel);
				if (result == null) result = caseReferrable(floatingLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.INPUT_GROUP: {
				InputGroup inputGroup = (InputGroup)theEObject;
				T result = caseInputGroup(inputGroup);
				if (result == null) result = caseBootstrapComponent(inputGroup);
				if (result == null) result = caseLibraryComponent(inputGroup);
				if (result == null) result = caseJsxContainer(inputGroup);
				if (result == null) result = caseJsxNode(inputGroup);
				if (result == null) result = caseReactElement(inputGroup);
				if (result == null) result = caseTypeScriptElement(inputGroup);
				if (result == null) result = caseNamedElement(inputGroup);
				if (result == null) result = caseModelElement(inputGroup);
				if (result == null) result = caseStringIdentity(inputGroup);
				if (result == null) result = caseDocumented(inputGroup);
				if (result == null) result = caseMarked(inputGroup);
				if (result == null) result = caseReferrable(inputGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.INPUT_GROUP_TEXT: {
				InputGroupText inputGroupText = (InputGroupText)theEObject;
				T result = caseInputGroupText(inputGroupText);
				if (result == null) result = caseBootstrapComponent(inputGroupText);
				if (result == null) result = caseTextContent(inputGroupText);
				if (result == null) result = caseLibraryComponent(inputGroupText);
				if (result == null) result = caseJsxContainer(inputGroupText);
				if (result == null) result = caseJsxNode(inputGroupText);
				if (result == null) result = caseReactElement(inputGroupText);
				if (result == null) result = caseTypeScriptElement(inputGroupText);
				if (result == null) result = caseNamedElement(inputGroupText);
				if (result == null) result = caseModelElement(inputGroupText);
				if (result == null) result = caseStringIdentity(inputGroupText);
				if (result == null) result = caseDocumented(inputGroupText);
				if (result == null) result = caseMarked(inputGroupText);
				if (result == null) result = caseReferrable(inputGroupText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidated(Validated object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormGroup(FormGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormLabel(FormLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormControl(FormControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormSelect(FormSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormCheck(FormCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormRange(FormRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormText(FormText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Control Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Control Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormControlFeedback(FormControlFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingLabel(FloatingLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputGroup(InputGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Group Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Group Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputGroupText(InputGroupText object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapComponent(BootstrapComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContent(TextContent object) {
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

} //FormsSwitch
