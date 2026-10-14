/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FloatingLabel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Form;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormCheck;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormControl;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormFeedback;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormLabel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormRange;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormSelect;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormText;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormTextArea;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsFactory;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.InputGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.InputGroupText;
import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.Validated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsPackageImpl extends EPackageImpl implements FormsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputGroupTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackTypeEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.html.bootstrap.forms.FormsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormsPackageImpl() {
		super(eNS_URI, FormsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FormsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormsPackage init() {
		if (isInited) return (FormsPackage)EPackage.Registry.INSTANCE.getEPackage(FormsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFormsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FormsPackageImpl theFormsPackage = registeredFormsPackage instanceof FormsPackageImpl ? (FormsPackageImpl)registeredFormsPackage : new FormsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		BootstrapPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFormsPackage.createPackageContents();

		// Initialize created meta-data
		theFormsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFormsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormsPackage.eNS_URI, theFormsPackage);
		return theFormsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidated() {
		return validatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidated_IsValid() {
		return (EAttribute)validatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidated_IsInvalid() {
		return (EAttribute)validatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Disabled() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Required() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Action() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Method() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Enctype() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Validated() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Novalidate() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Groups() {
		return (EReference)formEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormGroup() {
		return formGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormGroup_ControlId() {
		return (EAttribute)formGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormGroup_Label() {
		return (EReference)formGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormGroup_Controls() {
		return (EReference)formGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormGroup_Text() {
		return (EReference)formGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormGroup_Feedback() {
		return (EReference)formGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormLabel() {
		return formLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLabel_HtmlFor() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLabel_Column() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLabel_Sizes() {
		return (EReference)formLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLabel_Size() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLabel_VisuallyHidden() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormControl() {
		return formControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Type() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Placeholder() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Value() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Size() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Plaintext() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Readonly() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Autocomplete() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormTextArea() {
		return formTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormTextArea_Placeholder() {
		return (EAttribute)formTextAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormTextArea_Rows() {
		return (EAttribute)formTextAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormTextArea_Size() {
		return (EAttribute)formTextAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormTextArea_Readonly() {
		return (EAttribute)formTextAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormSelect() {
		return formSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormSelect_Size() {
		return (EAttribute)formSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormSelect_Multiple() {
		return (EAttribute)formSelectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormSelect_Options() {
		return (EReference)formSelectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormCheck() {
		return formCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Type() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_InputId() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Label() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Value() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Inline() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Reverse() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Checked() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_Feedback() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormCheck_FeedbackType() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormRange() {
		return formRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormRange_Min() {
		return (EAttribute)formRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormRange_Max() {
		return (EAttribute)formRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormRange_Step() {
		return (EAttribute)formRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormRange_Value() {
		return (EAttribute)formRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormText() {
		return formTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormFeedback() {
		return formFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormFeedback_Type() {
		return (EAttribute)formFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormFeedback_Tooltip() {
		return (EAttribute)formFeedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingLabel() {
		return floatingLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingLabel_ControlId() {
		return (EAttribute)floatingLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatingLabel_Label() {
		return (EAttribute)floatingLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatingLabel_Control() {
		return (EReference)floatingLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputGroup() {
		return inputGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputGroup_Size() {
		return (EAttribute)inputGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputGroup_HasValidation() {
		return (EAttribute)inputGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputGroup_Items() {
		return (EReference)inputGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputGroupText() {
		return inputGroupTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCheckType() {
		return checkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeedbackType() {
		return feedbackTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsFactory getFormsFactory() {
		return (FormsFactory)getEFactoryInstance();
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
		validatedEClass = createEClass(VALIDATED);
		createEAttribute(validatedEClass, VALIDATED__IS_VALID);
		createEAttribute(validatedEClass, VALIDATED__IS_INVALID);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__DISABLED);
		createEAttribute(fieldEClass, FIELD__REQUIRED);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__ACTION);
		createEAttribute(formEClass, FORM__METHOD);
		createEAttribute(formEClass, FORM__ENCTYPE);
		createEAttribute(formEClass, FORM__VALIDATED);
		createEAttribute(formEClass, FORM__NOVALIDATE);
		createEReference(formEClass, FORM__GROUPS);

		formGroupEClass = createEClass(FORM_GROUP);
		createEAttribute(formGroupEClass, FORM_GROUP__CONTROL_ID);
		createEReference(formGroupEClass, FORM_GROUP__LABEL);
		createEReference(formGroupEClass, FORM_GROUP__CONTROLS);
		createEReference(formGroupEClass, FORM_GROUP__TEXT);
		createEReference(formGroupEClass, FORM_GROUP__FEEDBACK);

		formLabelEClass = createEClass(FORM_LABEL);
		createEAttribute(formLabelEClass, FORM_LABEL__HTML_FOR);
		createEAttribute(formLabelEClass, FORM_LABEL__COLUMN);
		createEReference(formLabelEClass, FORM_LABEL__SIZES);
		createEAttribute(formLabelEClass, FORM_LABEL__SIZE);
		createEAttribute(formLabelEClass, FORM_LABEL__VISUALLY_HIDDEN);

		formControlEClass = createEClass(FORM_CONTROL);
		createEAttribute(formControlEClass, FORM_CONTROL__TYPE);
		createEAttribute(formControlEClass, FORM_CONTROL__PLACEHOLDER);
		createEAttribute(formControlEClass, FORM_CONTROL__VALUE);
		createEAttribute(formControlEClass, FORM_CONTROL__SIZE);
		createEAttribute(formControlEClass, FORM_CONTROL__PLAINTEXT);
		createEAttribute(formControlEClass, FORM_CONTROL__READONLY);
		createEAttribute(formControlEClass, FORM_CONTROL__AUTOCOMPLETE);

		formTextAreaEClass = createEClass(FORM_TEXT_AREA);
		createEAttribute(formTextAreaEClass, FORM_TEXT_AREA__PLACEHOLDER);
		createEAttribute(formTextAreaEClass, FORM_TEXT_AREA__ROWS);
		createEAttribute(formTextAreaEClass, FORM_TEXT_AREA__SIZE);
		createEAttribute(formTextAreaEClass, FORM_TEXT_AREA__READONLY);

		formSelectEClass = createEClass(FORM_SELECT);
		createEAttribute(formSelectEClass, FORM_SELECT__SIZE);
		createEAttribute(formSelectEClass, FORM_SELECT__MULTIPLE);
		createEReference(formSelectEClass, FORM_SELECT__OPTIONS);

		formCheckEClass = createEClass(FORM_CHECK);
		createEAttribute(formCheckEClass, FORM_CHECK__TYPE);
		createEAttribute(formCheckEClass, FORM_CHECK__INPUT_ID);
		createEAttribute(formCheckEClass, FORM_CHECK__LABEL);
		createEAttribute(formCheckEClass, FORM_CHECK__VALUE);
		createEAttribute(formCheckEClass, FORM_CHECK__INLINE);
		createEAttribute(formCheckEClass, FORM_CHECK__REVERSE);
		createEAttribute(formCheckEClass, FORM_CHECK__CHECKED);
		createEAttribute(formCheckEClass, FORM_CHECK__FEEDBACK);
		createEAttribute(formCheckEClass, FORM_CHECK__FEEDBACK_TYPE);

		formRangeEClass = createEClass(FORM_RANGE);
		createEAttribute(formRangeEClass, FORM_RANGE__MIN);
		createEAttribute(formRangeEClass, FORM_RANGE__MAX);
		createEAttribute(formRangeEClass, FORM_RANGE__STEP);
		createEAttribute(formRangeEClass, FORM_RANGE__VALUE);

		formTextEClass = createEClass(FORM_TEXT);

		formFeedbackEClass = createEClass(FORM_FEEDBACK);
		createEAttribute(formFeedbackEClass, FORM_FEEDBACK__TYPE);
		createEAttribute(formFeedbackEClass, FORM_FEEDBACK__TOOLTIP);

		floatingLabelEClass = createEClass(FLOATING_LABEL);
		createEAttribute(floatingLabelEClass, FLOATING_LABEL__CONTROL_ID);
		createEAttribute(floatingLabelEClass, FLOATING_LABEL__LABEL);
		createEReference(floatingLabelEClass, FLOATING_LABEL__CONTROL);

		inputGroupEClass = createEClass(INPUT_GROUP);
		createEAttribute(inputGroupEClass, INPUT_GROUP__SIZE);
		createEAttribute(inputGroupEClass, INPUT_GROUP__HAS_VALIDATION);
		createEReference(inputGroupEClass, INPUT_GROUP__ITEMS);

		inputGroupTextEClass = createEClass(INPUT_GROUP_TEXT);

		// Create enums
		checkTypeEEnum = createEEnum(CHECK_TYPE);
		feedbackTypeEEnum = createEEnum(FEEDBACK_TYPE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fieldEClass.getESuperTypes().add(this.getValidated());
		formEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formLabelEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formLabelEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		formControlEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formControlEClass.getESuperTypes().add(this.getField());
		formTextAreaEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formTextAreaEClass.getESuperTypes().add(this.getField());
		formTextAreaEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		formSelectEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formSelectEClass.getESuperTypes().add(this.getField());
		formCheckEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formCheckEClass.getESuperTypes().add(this.getField());
		formRangeEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formRangeEClass.getESuperTypes().add(this.getField());
		formTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		formFeedbackEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		formFeedbackEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		floatingLabelEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		inputGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		inputGroupTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		inputGroupTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(validatedEClass, Validated.class, "Validated", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidated_IsValid(), theEcorePackage.getEBoolean(), "isValid", null, 0, 1, Validated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidated_IsInvalid(), theEcorePackage.getEBoolean(), "isInvalid", null, 0, 1, Validated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Action(), theEcorePackage.getEString(), "action", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Method(), theEcorePackage.getEString(), "method", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Enctype(), theEcorePackage.getEString(), "enctype", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Validated(), theEcorePackage.getEBoolean(), "validated", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Novalidate(), theEcorePackage.getEBoolean(), "novalidate", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Groups(), this.getFormGroup(), null, "groups", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formGroupEClass, FormGroup.class, "FormGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormGroup_ControlId(), theEcorePackage.getEString(), "controlId", null, 0, 1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Label(), this.getFormLabel(), null, "label", null, 0, 1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Controls(), theHtmlPackage.getNode(), null, "controls", null, 0, -1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Text(), this.getFormText(), null, "text", null, 0, 1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Feedback(), this.getFormFeedback(), null, "feedback", null, 0, -1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLabelEClass, FormLabel.class, "FormLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormLabel_HtmlFor(), theEcorePackage.getEString(), "htmlFor", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLabel_Column(), theEcorePackage.getEBoolean(), "column", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormLabel_Sizes(), theBootstrapPackage.getColumnSize(), null, "sizes", null, 0, -1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLabel_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLabel_VisuallyHidden(), theEcorePackage.getEBoolean(), "visuallyHidden", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formControlEClass, FormControl.class, "FormControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormControl_Type(), theEcorePackage.getEString(), "type", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Value(), theEcorePackage.getEString(), "value", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Plaintext(), theEcorePackage.getEBoolean(), "plaintext", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Autocomplete(), theEcorePackage.getEString(), "autocomplete", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formTextAreaEClass, FormTextArea.class, "FormTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormTextArea_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, FormTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormTextArea_Rows(), theEcorePackage.getEInt(), "rows", null, 0, 1, FormTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormTextArea_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, FormTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormTextArea_Readonly(), theEcorePackage.getEBoolean(), "readonly", null, 0, 1, FormTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formSelectEClass, FormSelect.class, "FormSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormSelect_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormSelect_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormSelect_Options(), theHtmlPackage.getOption(), null, "options", null, 0, -1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formCheckEClass, FormCheck.class, "FormCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormCheck_Type(), this.getCheckType(), "type", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_InputId(), theEcorePackage.getEString(), "inputId", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Label(), theEcorePackage.getEString(), "label", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Value(), theEcorePackage.getEString(), "value", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Inline(), theEcorePackage.getEBoolean(), "inline", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Reverse(), theEcorePackage.getEBoolean(), "reverse", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Checked(), theEcorePackage.getEBoolean(), "checked", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Feedback(), theEcorePackage.getEString(), "feedback", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_FeedbackType(), this.getFeedbackType(), "feedbackType", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formRangeEClass, FormRange.class, "FormRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormRange_Min(), theEcorePackage.getEInt(), "min", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormRange_Max(), theEcorePackage.getEInt(), "max", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormRange_Step(), theEcorePackage.getEInt(), "step", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormRange_Value(), theEcorePackage.getEString(), "value", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formTextEClass, FormText.class, "FormText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formFeedbackEClass, FormFeedback.class, "FormFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormFeedback_Type(), this.getFeedbackType(), "type", null, 0, 1, FormFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormFeedback_Tooltip(), theEcorePackage.getEBoolean(), "tooltip", null, 0, 1, FormFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingLabelEClass, FloatingLabel.class, "FloatingLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingLabel_ControlId(), theEcorePackage.getEString(), "controlId", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingLabel_Label(), theEcorePackage.getEString(), "label", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloatingLabel_Control(), theHtmlPackage.getNode(), null, "control", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputGroupEClass, InputGroup.class, "InputGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputGroup_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, InputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputGroup_HasValidation(), theEcorePackage.getEBoolean(), "hasValidation", null, 0, 1, InputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputGroup_Items(), theHtmlPackage.getNode(), null, "items", null, 0, -1, InputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputGroupTextEClass, InputGroupText.class, "InputGroupText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(checkTypeEEnum, CheckType.class, "CheckType");
		addEEnumLiteral(checkTypeEEnum, CheckType.CHECKBOX);
		addEEnumLiteral(checkTypeEEnum, CheckType.RADIO);
		addEEnumLiteral(checkTypeEEnum, CheckType.SWITCH);

		initEEnum(feedbackTypeEEnum, FeedbackType.class, "FeedbackType");
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.INVALID);
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.VALID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika:html
		createUrnorgAnnotations();
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
			   "modelDirectory", "/bootstrap/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models.html.bootstrap"
		   });
		addAnnotation
		  (validatedEClass,
		   source,
		   new String[] {
			   "documentation", "Validation state of a field, shown when the form is not validated by the browser."
		   });
		addAnnotation
		  (fieldEClass,
		   source,
		   new String[] {
			   "documentation", "Attributes of form fields."
		   });
		addAnnotation
		  (getForm_Validated(),
		   source,
		   new String[] {
			   "documentation", " Shows validation feedback"
		   });
		addAnnotation
		  (getForm_Novalidate(),
		   source,
		   new String[] {
			   "documentation", " Disables browser validation in favor of Bootstrap styles"
		   });
		addAnnotation
		  (formGroupEClass,
		   source,
		   new String[] {
			   "documentation", "A label, controls, help text and feedback."
		   });
		addAnnotation
		  (getFormGroup_ControlId(),
		   source,
		   new String[] {
			   "documentation", " for of the label and id of the first field without them"
		   });
		addAnnotation
		  (formLabelEClass,
		   source,
		   new String[] {
			   "documentation", "form-label, or col-form-label with column sizes in a horizontal form."
		   });
		addAnnotation
		  (formControlEClass,
		   source,
		   new String[] {
			   "documentation", "form-control input, or form-control-plaintext."
		   });
		addAnnotation
		  (getFormControl_Type(),
		   source,
		   new String[] {
			   "documentation", " Input type: text, email, password, number, date, color, file, ..."
		   });
		addAnnotation
		  (getFormControl_Plaintext(),
		   source,
		   new String[] {
			   "documentation", " Read only value rendered as plain text"
		   });
		addAnnotation
		  (getFormSelect_Options(),
		   source,
		   new String[] {
			   "documentation", " HTML options and option groups"
		   });
		addAnnotation
		  (formCheckEClass,
		   source,
		   new String[] {
			   "documentation", "form-check with an input and a label."
		   });
		addAnnotation
		  (getFormCheck_InputId(),
		   source,
		   new String[] {
			   "documentation", " id of the input, generated if not set"
		   });
		addAnnotation
		  (getFormCheck_Feedback(),
		   source,
		   new String[] {
			   "documentation", " Feedback text shown under the check"
		   });
		addAnnotation
		  (formTextEClass,
		   source,
		   new String[] {
			   "documentation", "Help text under a field."
		   });
		addAnnotation
		  (formFeedbackEClass,
		   source,
		   new String[] {
			   "documentation", "invalid-feedback, valid-feedback, or invalid-tooltip and valid-tooltip."
		   });
		addAnnotation
		  (floatingLabelEClass,
		   source,
		   new String[] {
			   "documentation", "Label floating over its field - the field has to have a placeholder."
		   });
		addAnnotation
		  (getInputGroup_Items(),
		   source,
		   new String[] {
			   "documentation", " Texts, fields, buttons and dropdowns, in order"
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
			   "Html", "urn:org.nasdanika:html"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:html</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:html";
		addAnnotation
		  (getValidated_IsValid(),
		   source,
		   new String[] {
			   "classes", "is-valid"
		   });
		addAnnotation
		  (getValidated_IsInvalid(),
		   source,
		   new String[] {
			   "classes", "is-invalid"
		   });
		addAnnotation
		  (formEClass,
		   source,
		   new String[] {
			   "tag", "form"
		   });
		addAnnotation
		  (getForm_Validated(),
		   source,
		   new String[] {
			   "classes", "was-validated"
		   });
		addAnnotation
		  (formGroupEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getFormGroup_ControlId(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (formLabelEClass,
		   source,
		   new String[] {
			   "tag", "label"
		   });
		addAnnotation
		  (getFormLabel_HtmlFor(),
		   source,
		   new String[] {
			   "attribute", "for"
		   });
		addAnnotation
		  (getFormLabel_Column(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormLabel_Sizes(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormLabel_Size(),
		   source,
		   new String[] {
			   "classes", "col-form-label-{}"
		   });
		addAnnotation
		  (getFormLabel_VisuallyHidden(),
		   source,
		   new String[] {
			   "classes", "visually-hidden"
		   });
		addAnnotation
		  (formControlEClass,
		   source,
		   new String[] {
			   "tag", "input",
			   "voidElement", "true",
			   "attributes", "type=text"
		   });
		addAnnotation
		  (getFormControl_Size(),
		   source,
		   new String[] {
			   "classes", "form-control-{}"
		   });
		addAnnotation
		  (getFormControl_Plaintext(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (formTextAreaEClass,
		   source,
		   new String[] {
			   "tag", "textarea",
			   "classes", "form-control"
		   });
		addAnnotation
		  (getFormTextArea_Size(),
		   source,
		   new String[] {
			   "classes", "form-control-{}"
		   });
		addAnnotation
		  (formSelectEClass,
		   source,
		   new String[] {
			   "tag", "select",
			   "classes", "form-select"
		   });
		addAnnotation
		  (getFormSelect_Size(),
		   source,
		   new String[] {
			   "classes", "form-select-{}"
		   });
		addAnnotation
		  (formCheckEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "form-check"
		   });
		addAnnotation
		  (getFormCheck_Type(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormCheck_InputId(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormCheck_Label(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormCheck_Value(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormCheck_Inline(),
		   source,
		   new String[] {
			   "classes", "form-check-inline"
		   });
		addAnnotation
		  (getFormCheck_Reverse(),
		   source,
		   new String[] {
			   "classes", "form-check-reverse"
		   });
		addAnnotation
		  (getFormCheck_Checked(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormCheck_Feedback(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormCheck_FeedbackType(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (formRangeEClass,
		   source,
		   new String[] {
			   "tag", "input",
			   "classes", "form-range",
			   "voidElement", "true",
			   "attributes", "type=range"
		   });
		addAnnotation
		  (formTextEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "form-text"
		   });
		addAnnotation
		  (formFeedbackEClass,
		   source,
		   new String[] {
			   "tag", "div"
		   });
		addAnnotation
		  (getFormFeedback_Type(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFormFeedback_Tooltip(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (floatingLabelEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "form-floating"
		   });
		addAnnotation
		  (getFloatingLabel_ControlId(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (getFloatingLabel_Label(),
		   source,
		   new String[] {
			   "logical", "true"
		   });
		addAnnotation
		  (inputGroupEClass,
		   source,
		   new String[] {
			   "tag", "div",
			   "classes", "input-group"
		   });
		addAnnotation
		  (getInputGroup_Size(),
		   source,
		   new String[] {
			   "classes", "input-group-{}"
		   });
		addAnnotation
		  (getInputGroup_HasValidation(),
		   source,
		   new String[] {
			   "classes", "has-validation"
		   });
		addAnnotation
		  (inputGroupTextEClass,
		   source,
		   new String[] {
			   "tag", "span",
			   "classes", "input-group-text"
		   });
	}

} //FormsPackageImpl
