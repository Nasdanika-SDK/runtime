/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

import org.nasdanika.sdk.runtime.models.react.ReactPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsFactory;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroupText;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated;

import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

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
	private EClass formControlFeedbackEClass = null;

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
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage#eNS_URI
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
		CorePackage.eINSTANCE.eClass();
		ReactPackage.eINSTANCE.eClass();
		TypescriptPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();

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
	public EAttribute getField_FieldName() {
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
	public EAttribute getForm_Validated() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_NoValidate() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Action() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Method() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Groups() {
		return (EReference)formEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getFormLabel_Column() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormLabel_Sizes() {
		return (EReference)formLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLabel_VisuallyHidden() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormLabel_ForId() {
		return (EAttribute)formLabelEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getFormControl_InitialValue() {
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
	public EAttribute getFormControl_ReadOnly() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_Rows() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControl_AutoComplete() {
		return (EAttribute)formControlEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getFormSelect_InitialValue() {
		return (EAttribute)formSelectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormSelect_Options() {
		return (EReference)formSelectEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getFormCheck_Label() {
		return (EAttribute)formCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormCheck_LabelNode() {
		return (EReference)formCheckEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getFormCheck_DefaultChecked() {
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
	public EAttribute getFormRange_InitialValue() {
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
	public EAttribute getFormText_Muted() {
		return (EAttribute)formTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormControlFeedback() {
		return formControlFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControlFeedback_Type() {
		return (EAttribute)formControlFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormControlFeedback_Tooltip() {
		return (EAttribute)formControlFeedbackEClass.getEStructuralFeatures().get(1);
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
	public EReference getFloatingLabel_LabelNode() {
		return (EReference)floatingLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFloatingLabel_Control() {
		return (EReference)floatingLabelEClass.getEStructuralFeatures().get(3);
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
		createEAttribute(fieldEClass, FIELD__FIELD_NAME);
		createEAttribute(fieldEClass, FIELD__DISABLED);
		createEAttribute(fieldEClass, FIELD__REQUIRED);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__VALIDATED);
		createEAttribute(formEClass, FORM__NO_VALIDATE);
		createEAttribute(formEClass, FORM__ACTION);
		createEAttribute(formEClass, FORM__METHOD);
		createEReference(formEClass, FORM__GROUPS);

		formGroupEClass = createEClass(FORM_GROUP);
		createEAttribute(formGroupEClass, FORM_GROUP__CONTROL_ID);
		createEReference(formGroupEClass, FORM_GROUP__LABEL);
		createEReference(formGroupEClass, FORM_GROUP__CONTROLS);
		createEReference(formGroupEClass, FORM_GROUP__TEXT);
		createEReference(formGroupEClass, FORM_GROUP__FEEDBACK);

		formLabelEClass = createEClass(FORM_LABEL);
		createEAttribute(formLabelEClass, FORM_LABEL__COLUMN);
		createEReference(formLabelEClass, FORM_LABEL__SIZES);
		createEAttribute(formLabelEClass, FORM_LABEL__VISUALLY_HIDDEN);
		createEAttribute(formLabelEClass, FORM_LABEL__FOR_ID);

		formControlEClass = createEClass(FORM_CONTROL);
		createEAttribute(formControlEClass, FORM_CONTROL__TYPE);
		createEAttribute(formControlEClass, FORM_CONTROL__PLACEHOLDER);
		createEAttribute(formControlEClass, FORM_CONTROL__INITIAL_VALUE);
		createEAttribute(formControlEClass, FORM_CONTROL__SIZE);
		createEAttribute(formControlEClass, FORM_CONTROL__PLAINTEXT);
		createEAttribute(formControlEClass, FORM_CONTROL__READ_ONLY);
		createEAttribute(formControlEClass, FORM_CONTROL__ROWS);
		createEAttribute(formControlEClass, FORM_CONTROL__AUTO_COMPLETE);

		formSelectEClass = createEClass(FORM_SELECT);
		createEAttribute(formSelectEClass, FORM_SELECT__SIZE);
		createEAttribute(formSelectEClass, FORM_SELECT__MULTIPLE);
		createEAttribute(formSelectEClass, FORM_SELECT__INITIAL_VALUE);
		createEReference(formSelectEClass, FORM_SELECT__OPTIONS);

		formCheckEClass = createEClass(FORM_CHECK);
		createEAttribute(formCheckEClass, FORM_CHECK__TYPE);
		createEAttribute(formCheckEClass, FORM_CHECK__LABEL);
		createEReference(formCheckEClass, FORM_CHECK__LABEL_NODE);
		createEAttribute(formCheckEClass, FORM_CHECK__VALUE);
		createEAttribute(formCheckEClass, FORM_CHECK__INLINE);
		createEAttribute(formCheckEClass, FORM_CHECK__REVERSE);
		createEAttribute(formCheckEClass, FORM_CHECK__DEFAULT_CHECKED);
		createEAttribute(formCheckEClass, FORM_CHECK__FEEDBACK);
		createEAttribute(formCheckEClass, FORM_CHECK__FEEDBACK_TYPE);

		formRangeEClass = createEClass(FORM_RANGE);
		createEAttribute(formRangeEClass, FORM_RANGE__MIN);
		createEAttribute(formRangeEClass, FORM_RANGE__MAX);
		createEAttribute(formRangeEClass, FORM_RANGE__STEP);
		createEAttribute(formRangeEClass, FORM_RANGE__INITIAL_VALUE);

		formTextEClass = createEClass(FORM_TEXT);
		createEAttribute(formTextEClass, FORM_TEXT__MUTED);

		formControlFeedbackEClass = createEClass(FORM_CONTROL_FEEDBACK);
		createEAttribute(formControlFeedbackEClass, FORM_CONTROL_FEEDBACK__TYPE);
		createEAttribute(formControlFeedbackEClass, FORM_CONTROL_FEEDBACK__TOOLTIP);

		floatingLabelEClass = createEClass(FLOATING_LABEL);
		createEAttribute(floatingLabelEClass, FLOATING_LABEL__CONTROL_ID);
		createEAttribute(floatingLabelEClass, FLOATING_LABEL__LABEL);
		createEReference(floatingLabelEClass, FLOATING_LABEL__LABEL_NODE);
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
		ReactPackage theReactPackage = (ReactPackage)EPackage.Registry.INSTANCE.getEPackage(ReactPackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fieldEClass.getESuperTypes().add(this.getValidated());
		formEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formLabelEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formLabelEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		formControlEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formControlEClass.getESuperTypes().add(this.getField());
		formSelectEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formSelectEClass.getESuperTypes().add(this.getField());
		formCheckEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formCheckEClass.getESuperTypes().add(this.getField());
		formRangeEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formRangeEClass.getESuperTypes().add(this.getField());
		formTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		formControlFeedbackEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		formControlFeedbackEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());
		floatingLabelEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		inputGroupEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		inputGroupTextEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapComponent());
		inputGroupTextEClass.getESuperTypes().add(theBootstrapPackage.getTextContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(validatedEClass, Validated.class, "Validated", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidated_IsValid(), theEcorePackage.getEBoolean(), "isValid", null, 0, 1, Validated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidated_IsInvalid(), theEcorePackage.getEBoolean(), "isInvalid", null, 0, 1, Validated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_FieldName(), theEcorePackage.getEString(), "fieldName", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Validated(), theEcorePackage.getEBoolean(), "validated", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_NoValidate(), theEcorePackage.getEBoolean(), "noValidate", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Action(), theEcorePackage.getEString(), "action", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Method(), theEcorePackage.getEString(), "method", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Groups(), this.getFormGroup(), null, "groups", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formGroupEClass, FormGroup.class, "FormGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormGroup_ControlId(), theEcorePackage.getEString(), "controlId", null, 0, 1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Label(), this.getFormLabel(), null, "label", null, 0, 1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Controls(), theReactPackage.getJsxNode(), null, "controls", null, 0, -1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Text(), this.getFormText(), null, "text", null, 0, 1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormGroup_Feedback(), this.getFormControlFeedback(), null, "feedback", null, 0, -1, FormGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formLabelEClass, FormLabel.class, "FormLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormLabel_Column(), theEcorePackage.getEBoolean(), "column", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormLabel_Sizes(), theBootstrapPackage.getColumnSize(), null, "sizes", null, 0, -1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLabel_VisuallyHidden(), theEcorePackage.getEBoolean(), "visuallyHidden", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormLabel_ForId(), theEcorePackage.getEString(), "forId", null, 0, 1, FormLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formControlEClass, FormControl.class, "FormControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormControl_Type(), theEcorePackage.getEString(), "type", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Placeholder(), theEcorePackage.getEString(), "placeholder", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_InitialValue(), theEcorePackage.getEString(), "initialValue", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Plaintext(), theEcorePackage.getEBoolean(), "plaintext", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_ReadOnly(), theEcorePackage.getEBoolean(), "readOnly", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_Rows(), theEcorePackage.getEInt(), "rows", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControl_AutoComplete(), theEcorePackage.getEString(), "autoComplete", null, 0, 1, FormControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formSelectEClass, FormSelect.class, "FormSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormSelect_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormSelect_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormSelect_InitialValue(), theEcorePackage.getEString(), "initialValue", null, 0, 1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormSelect_Options(), theHtmlPackage.getOption(), null, "options", null, 0, -1, FormSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formCheckEClass, FormCheck.class, "FormCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormCheck_Type(), this.getCheckType(), "type", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Label(), theEcorePackage.getEString(), "label", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormCheck_LabelNode(), theReactPackage.getJsxNode(), null, "labelNode", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Value(), theEcorePackage.getEString(), "value", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Inline(), theEcorePackage.getEBoolean(), "inline", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Reverse(), theEcorePackage.getEBoolean(), "reverse", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_DefaultChecked(), theEcorePackage.getEBoolean(), "defaultChecked", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_Feedback(), theEcorePackage.getEString(), "feedback", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormCheck_FeedbackType(), theEcorePackage.getEString(), "feedbackType", null, 0, 1, FormCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formRangeEClass, FormRange.class, "FormRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormRange_Min(), theEcorePackage.getEInt(), "min", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormRange_Max(), theEcorePackage.getEInt(), "max", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormRange_Step(), theEcorePackage.getEInt(), "step", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormRange_InitialValue(), theEcorePackage.getEInt(), "initialValue", null, 0, 1, FormRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formTextEClass, FormText.class, "FormText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormText_Muted(), theEcorePackage.getEBoolean(), "muted", null, 0, 1, FormText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formControlFeedbackEClass, FormControlFeedback.class, "FormControlFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormControlFeedback_Type(), this.getFeedbackType(), "type", null, 0, 1, FormControlFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormControlFeedback_Tooltip(), theEcorePackage.getEBoolean(), "tooltip", null, 0, 1, FormControlFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingLabelEClass, FloatingLabel.class, "FloatingLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingLabel_ControlId(), theEcorePackage.getEString(), "controlId", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatingLabel_Label(), theEcorePackage.getEString(), "label", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloatingLabel_LabelNode(), theReactPackage.getJsxNode(), null, "labelNode", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFloatingLabel_Control(), theReactPackage.getJsxNode(), null, "control", null, 0, 1, FloatingLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputGroupEClass, InputGroup.class, "InputGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputGroup_Size(), theBootstrapPackage.getSize(), "size", null, 0, 1, InputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputGroup_HasValidation(), theEcorePackage.getEBoolean(), "hasValidation", null, 0, 1, InputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputGroup_Items(), theReactPackage.getJsxNode(), null, "items", null, 0, -1, InputGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputGroupTextEClass, InputGroupText.class, "InputGroupText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(checkTypeEEnum, CheckType.class, "CheckType");
		addEEnumLiteral(checkTypeEEnum, CheckType.CHECKBOX);
		addEEnumLiteral(checkTypeEEnum, CheckType.RADIO);
		addEEnumLiteral(checkTypeEEnum, CheckType.SWITCH);

		initEEnum(feedbackTypeEEnum, FeedbackType.class, "FeedbackType");
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.VALID);
		addEEnumLiteral(feedbackTypeEEnum, FeedbackType.INVALID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika:react
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
			   "basePackage", "org.nasdanika.sdk.runtime.models.react.bootstrap"
		   });
		addAnnotation
		  (validatedEClass,
		   source,
		   new String[] {
			   "documentation", "Validation state shared by form controls."
		   });
		addAnnotation
		  (fieldEClass,
		   source,
		   new String[] {
			   "documentation", "Props of fields - controls, selects, checks and ranges."
		   });
		addAnnotation
		  (getForm_Validated(),
		   source,
		   new String[] {
			   "documentation", " Shows validation feedback - usually an expression set on submit"
		   });
		addAnnotation
		  (getForm_NoValidate(),
		   source,
		   new String[] {
			   "documentation", " Disables browser validation in favor of Bootstrap styles"
		   });
		addAnnotation
		  (formGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Form.Group - sets controlId for the label and control in it."
		   });
		addAnnotation
		  (getFormGroup_Controls(),
		   source,
		   new String[] {
			   "documentation", " Control, select, check, range, input group or floating label"
		   });
		addAnnotation
		  (getFormLabel_Column(),
		   source,
		   new String[] {
			   "documentation", " Renders a label of a horizontal form as a column"
		   });
		addAnnotation
		  (getFormLabel_Sizes(),
		   source,
		   new String[] {
			   "documentation", " Column sizes of a horizontal form label, like Col sizes"
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
			   "documentation", " Rendered as plain text, for read only values in forms"
		   });
		addAnnotation
		  (getFormControl_Rows(),
		   source,
		   new String[] {
			   "documentation", " Rows of a textarea - as=\"textarea\""
		   });
		addAnnotation
		  (getFormSelect_Options(),
		   source,
		   new String[] {
			   "documentation", " HTML options and option groups"
		   });
		addAnnotation
		  (getFormCheck_LabelNode(),
		   source,
		   new String[] {
			   "documentation", " Label with markup. Wins over label."
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
			   "documentation", "Help text under a control."
		   });
		addAnnotation
		  (getFormControlFeedback_Tooltip(),
		   source,
		   new String[] {
			   "documentation", " Styled as a tooltip"
		   });
		addAnnotation
		  (floatingLabelEClass,
		   source,
		   new String[] {
			   "documentation", "Label floating over its control - the control has to have a placeholder."
		   });
		addAnnotation
		  (getInputGroup_Items(),
		   source,
		   new String[] {
			   "documentation", " Texts, controls, buttons and dropdowns, in order"
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
			   "React", "urn:org.nasdanika:react"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika:react</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika:react";
		addAnnotation
		  (getField_FieldName(),
		   source,
		   new String[] {
			   "prop", "name"
		   });
		addAnnotation
		  (formEClass,
		   source,
		   new String[] {
			   "component", "Form"
		   });
		addAnnotation
		  (formGroupEClass,
		   source,
		   new String[] {
			   "component", "Form.Group"
		   });
		addAnnotation
		  (formLabelEClass,
		   source,
		   new String[] {
			   "component", "Form.Label"
		   });
		addAnnotation
		  (getFormLabel_Sizes(),
		   source,
		   new String[] {
			   "key", "breakpoint"
		   });
		addAnnotation
		  (getFormLabel_ForId(),
		   source,
		   new String[] {
			   "prop", "htmlFor"
		   });
		addAnnotation
		  (formControlEClass,
		   source,
		   new String[] {
			   "component", "Form.Control"
		   });
		addAnnotation
		  (getFormControl_InitialValue(),
		   source,
		   new String[] {
			   "prop", "defaultValue"
		   });
		addAnnotation
		  (formSelectEClass,
		   source,
		   new String[] {
			   "component", "Form.Select"
		   });
		addAnnotation
		  (getFormSelect_InitialValue(),
		   source,
		   new String[] {
			   "prop", "defaultValue"
		   });
		addAnnotation
		  (formCheckEClass,
		   source,
		   new String[] {
			   "component", "Form.Check"
		   });
		addAnnotation
		  (getFormCheck_LabelNode(),
		   source,
		   new String[] {
			   "prop", "label"
		   });
		addAnnotation
		  (formRangeEClass,
		   source,
		   new String[] {
			   "component", "Form.Range"
		   });
		addAnnotation
		  (getFormRange_InitialValue(),
		   source,
		   new String[] {
			   "prop", "defaultValue"
		   });
		addAnnotation
		  (formTextEClass,
		   source,
		   new String[] {
			   "component", "Form.Text"
		   });
		addAnnotation
		  (formControlFeedbackEClass,
		   source,
		   new String[] {
			   "component", "Form.Control.Feedback"
		   });
		addAnnotation
		  (floatingLabelEClass,
		   source,
		   new String[] {
			   "component", "FloatingLabel"
		   });
		addAnnotation
		  (getFloatingLabel_LabelNode(),
		   source,
		   new String[] {
			   "prop", "label"
		   });
		addAnnotation
		  (inputGroupEClass,
		   source,
		   new String[] {
			   "component", "InputGroup"
		   });
		addAnnotation
		  (inputGroupTextEClass,
		   source,
		   new String[] {
			   "component", "InputGroup.Text"
		   });
	}

} //FormsPackageImpl
