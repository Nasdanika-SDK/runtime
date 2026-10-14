/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage
 * @generated
 */
public interface FormsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsFactory eINSTANCE = org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl.FormsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Form Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Group</em>'.
	 * @generated
	 */
	FormGroup createFormGroup();

	/**
	 * Returns a new object of class '<em>Form Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Label</em>'.
	 * @generated
	 */
	FormLabel createFormLabel();

	/**
	 * Returns a new object of class '<em>Form Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Control</em>'.
	 * @generated
	 */
	FormControl createFormControl();

	/**
	 * Returns a new object of class '<em>Form Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Text Area</em>'.
	 * @generated
	 */
	FormTextArea createFormTextArea();

	/**
	 * Returns a new object of class '<em>Form Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Select</em>'.
	 * @generated
	 */
	FormSelect createFormSelect();

	/**
	 * Returns a new object of class '<em>Form Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Check</em>'.
	 * @generated
	 */
	FormCheck createFormCheck();

	/**
	 * Returns a new object of class '<em>Form Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Range</em>'.
	 * @generated
	 */
	FormRange createFormRange();

	/**
	 * Returns a new object of class '<em>Form Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Text</em>'.
	 * @generated
	 */
	FormText createFormText();

	/**
	 * Returns a new object of class '<em>Form Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Feedback</em>'.
	 * @generated
	 */
	FormFeedback createFormFeedback();

	/**
	 * Returns a new object of class '<em>Floating Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Label</em>'.
	 * @generated
	 */
	FloatingLabel createFloatingLabel();

	/**
	 * Returns a new object of class '<em>Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Group</em>'.
	 * @generated
	 */
	InputGroup createInputGroup();

	/**
	 * Returns a new object of class '<em>Input Group Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Group Text</em>'.
	 * @generated
	 */
	InputGroupText createInputGroupText();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormsPackage getFormsPackage();

} //FormsFactory
