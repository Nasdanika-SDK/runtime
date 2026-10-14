/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.html.bootstrap.forms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsFactoryImpl extends EFactoryImpl implements FormsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormsFactory init() {
		try {
			FormsFactory theFormsFactory = (FormsFactory)EPackage.Registry.INSTANCE.getEFactory(FormsPackage.eNS_URI);
			if (theFormsFactory != null) {
				return theFormsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsFactoryImpl() {
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
			case FormsPackage.FORM: return createForm();
			case FormsPackage.FORM_GROUP: return createFormGroup();
			case FormsPackage.FORM_LABEL: return createFormLabel();
			case FormsPackage.FORM_CONTROL: return createFormControl();
			case FormsPackage.FORM_TEXT_AREA: return createFormTextArea();
			case FormsPackage.FORM_SELECT: return createFormSelect();
			case FormsPackage.FORM_CHECK: return createFormCheck();
			case FormsPackage.FORM_RANGE: return createFormRange();
			case FormsPackage.FORM_TEXT: return createFormText();
			case FormsPackage.FORM_FEEDBACK: return createFormFeedback();
			case FormsPackage.FLOATING_LABEL: return createFloatingLabel();
			case FormsPackage.INPUT_GROUP: return createInputGroup();
			case FormsPackage.INPUT_GROUP_TEXT: return createInputGroupText();
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
			case FormsPackage.CHECK_TYPE:
				return createCheckTypeFromString(eDataType, initialValue);
			case FormsPackage.FEEDBACK_TYPE:
				return createFeedbackTypeFromString(eDataType, initialValue);
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
			case FormsPackage.CHECK_TYPE:
				return convertCheckTypeToString(eDataType, instanceValue);
			case FormsPackage.FEEDBACK_TYPE:
				return convertFeedbackTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormGroup createFormGroup() {
		FormGroupImpl formGroup = new FormGroupImpl();
		return formGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLabel createFormLabel() {
		FormLabelImpl formLabel = new FormLabelImpl();
		return formLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormControl createFormControl() {
		FormControlImpl formControl = new FormControlImpl();
		return formControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormTextArea createFormTextArea() {
		FormTextAreaImpl formTextArea = new FormTextAreaImpl();
		return formTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormSelect createFormSelect() {
		FormSelectImpl formSelect = new FormSelectImpl();
		return formSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormCheck createFormCheck() {
		FormCheckImpl formCheck = new FormCheckImpl();
		return formCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormRange createFormRange() {
		FormRangeImpl formRange = new FormRangeImpl();
		return formRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormText createFormText() {
		FormTextImpl formText = new FormTextImpl();
		return formText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFeedback createFormFeedback() {
		FormFeedbackImpl formFeedback = new FormFeedbackImpl();
		return formFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingLabel createFloatingLabel() {
		FloatingLabelImpl floatingLabel = new FloatingLabelImpl();
		return floatingLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputGroup createInputGroup() {
		InputGroupImpl inputGroup = new InputGroupImpl();
		return inputGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputGroupText createInputGroupText() {
		InputGroupTextImpl inputGroupText = new InputGroupTextImpl();
		return inputGroupText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckType createCheckTypeFromString(EDataType eDataType, String initialValue) {
		CheckType result = CheckType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCheckTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackType createFeedbackTypeFromString(EDataType eDataType, String initialValue) {
		FeedbackType result = FeedbackType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsPackage getFormsPackage() {
		return (FormsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormsPackage getPackage() {
		return FormsPackage.eINSTANCE;
	}

} //FormsFactoryImpl
