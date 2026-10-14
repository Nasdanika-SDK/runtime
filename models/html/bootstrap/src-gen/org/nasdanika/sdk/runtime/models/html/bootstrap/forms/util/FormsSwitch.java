/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.sdk.runtime.models.core.Marked;

import org.nasdanika.sdk.runtime.models.html.Container;
import org.nasdanika.sdk.runtime.models.html.Element;
import org.nasdanika.sdk.runtime.models.html.LibraryElement;
import org.nasdanika.sdk.runtime.models.html.Node;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapElement;
import org.nasdanika.sdk.runtime.models.html.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.*;

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
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage
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
				if (result == null) result = caseBootstrapElement(form);
				if (result == null) result = caseLibraryElement(form);
				if (result == null) result = caseElement(form);
				if (result == null) result = caseContainer(form);
				if (result == null) result = caseNode(form);
				if (result == null) result = caseMarked(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_GROUP: {
				FormGroup formGroup = (FormGroup)theEObject;
				T result = caseFormGroup(formGroup);
				if (result == null) result = caseBootstrapElement(formGroup);
				if (result == null) result = caseLibraryElement(formGroup);
				if (result == null) result = caseElement(formGroup);
				if (result == null) result = caseContainer(formGroup);
				if (result == null) result = caseNode(formGroup);
				if (result == null) result = caseMarked(formGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_LABEL: {
				FormLabel formLabel = (FormLabel)theEObject;
				T result = caseFormLabel(formLabel);
				if (result == null) result = caseBootstrapElement(formLabel);
				if (result == null) result = caseTextContent(formLabel);
				if (result == null) result = caseLibraryElement(formLabel);
				if (result == null) result = caseElement(formLabel);
				if (result == null) result = caseContainer(formLabel);
				if (result == null) result = caseNode(formLabel);
				if (result == null) result = caseMarked(formLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_CONTROL: {
				FormControl formControl = (FormControl)theEObject;
				T result = caseFormControl(formControl);
				if (result == null) result = caseBootstrapElement(formControl);
				if (result == null) result = caseField(formControl);
				if (result == null) result = caseLibraryElement(formControl);
				if (result == null) result = caseValidated(formControl);
				if (result == null) result = caseElement(formControl);
				if (result == null) result = caseContainer(formControl);
				if (result == null) result = caseNode(formControl);
				if (result == null) result = caseMarked(formControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_TEXT_AREA: {
				FormTextArea formTextArea = (FormTextArea)theEObject;
				T result = caseFormTextArea(formTextArea);
				if (result == null) result = caseBootstrapElement(formTextArea);
				if (result == null) result = caseField(formTextArea);
				if (result == null) result = caseTextContent(formTextArea);
				if (result == null) result = caseLibraryElement(formTextArea);
				if (result == null) result = caseValidated(formTextArea);
				if (result == null) result = caseElement(formTextArea);
				if (result == null) result = caseContainer(formTextArea);
				if (result == null) result = caseNode(formTextArea);
				if (result == null) result = caseMarked(formTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_SELECT: {
				FormSelect formSelect = (FormSelect)theEObject;
				T result = caseFormSelect(formSelect);
				if (result == null) result = caseBootstrapElement(formSelect);
				if (result == null) result = caseField(formSelect);
				if (result == null) result = caseLibraryElement(formSelect);
				if (result == null) result = caseValidated(formSelect);
				if (result == null) result = caseElement(formSelect);
				if (result == null) result = caseContainer(formSelect);
				if (result == null) result = caseNode(formSelect);
				if (result == null) result = caseMarked(formSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_CHECK: {
				FormCheck formCheck = (FormCheck)theEObject;
				T result = caseFormCheck(formCheck);
				if (result == null) result = caseBootstrapElement(formCheck);
				if (result == null) result = caseField(formCheck);
				if (result == null) result = caseLibraryElement(formCheck);
				if (result == null) result = caseValidated(formCheck);
				if (result == null) result = caseElement(formCheck);
				if (result == null) result = caseContainer(formCheck);
				if (result == null) result = caseNode(formCheck);
				if (result == null) result = caseMarked(formCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_RANGE: {
				FormRange formRange = (FormRange)theEObject;
				T result = caseFormRange(formRange);
				if (result == null) result = caseBootstrapElement(formRange);
				if (result == null) result = caseField(formRange);
				if (result == null) result = caseLibraryElement(formRange);
				if (result == null) result = caseValidated(formRange);
				if (result == null) result = caseElement(formRange);
				if (result == null) result = caseContainer(formRange);
				if (result == null) result = caseNode(formRange);
				if (result == null) result = caseMarked(formRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_TEXT: {
				FormText formText = (FormText)theEObject;
				T result = caseFormText(formText);
				if (result == null) result = caseBootstrapElement(formText);
				if (result == null) result = caseTextContent(formText);
				if (result == null) result = caseLibraryElement(formText);
				if (result == null) result = caseElement(formText);
				if (result == null) result = caseContainer(formText);
				if (result == null) result = caseNode(formText);
				if (result == null) result = caseMarked(formText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FORM_FEEDBACK: {
				FormFeedback formFeedback = (FormFeedback)theEObject;
				T result = caseFormFeedback(formFeedback);
				if (result == null) result = caseBootstrapElement(formFeedback);
				if (result == null) result = caseTextContent(formFeedback);
				if (result == null) result = caseLibraryElement(formFeedback);
				if (result == null) result = caseElement(formFeedback);
				if (result == null) result = caseContainer(formFeedback);
				if (result == null) result = caseNode(formFeedback);
				if (result == null) result = caseMarked(formFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.FLOATING_LABEL: {
				FloatingLabel floatingLabel = (FloatingLabel)theEObject;
				T result = caseFloatingLabel(floatingLabel);
				if (result == null) result = caseBootstrapElement(floatingLabel);
				if (result == null) result = caseLibraryElement(floatingLabel);
				if (result == null) result = caseElement(floatingLabel);
				if (result == null) result = caseContainer(floatingLabel);
				if (result == null) result = caseNode(floatingLabel);
				if (result == null) result = caseMarked(floatingLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.INPUT_GROUP: {
				InputGroup inputGroup = (InputGroup)theEObject;
				T result = caseInputGroup(inputGroup);
				if (result == null) result = caseBootstrapElement(inputGroup);
				if (result == null) result = caseLibraryElement(inputGroup);
				if (result == null) result = caseElement(inputGroup);
				if (result == null) result = caseContainer(inputGroup);
				if (result == null) result = caseNode(inputGroup);
				if (result == null) result = caseMarked(inputGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormsPackage.INPUT_GROUP_TEXT: {
				InputGroupText inputGroupText = (InputGroupText)theEObject;
				T result = caseInputGroupText(inputGroupText);
				if (result == null) result = caseBootstrapElement(inputGroupText);
				if (result == null) result = caseTextContent(inputGroupText);
				if (result == null) result = caseLibraryElement(inputGroupText);
				if (result == null) result = caseElement(inputGroupText);
				if (result == null) result = caseContainer(inputGroupText);
				if (result == null) result = caseNode(inputGroupText);
				if (result == null) result = caseMarked(inputGroupText);
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
	 * Returns the result of interpreting the object as an instance of '<em>Form Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormTextArea(FormTextArea object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Form Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormFeedback(FormFeedback object) {
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
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
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
	public T caseBootstrapElement(BootstrapElement object) {
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
