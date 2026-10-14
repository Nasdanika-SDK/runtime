/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/bootstrap/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.react.bootstrap'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' React='urn:org.nasdanika:react'"
 * @generated
 */
public interface FormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/react/bootstrap/forms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.react.bootstrap.forms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsPackage eINSTANCE = org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated <em>Validated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getValidated()
	 * @generated
	 */
	int VALIDATED = 0;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATED__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Is Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATED__IS_INVALID = 1;

	/**
	 * The number of structural features of the '<em>Validated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Validated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_VALID = VALIDATED__IS_VALID;

	/**
	 * The feature id for the '<em><b>Is Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_INVALID = VALIDATED__IS_INVALID;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD_NAME = VALIDATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DISABLED = VALIDATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REQUIRED = VALIDATED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = VALIDATED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = VALIDATED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Validated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VALIDATED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NO_VALIDATE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTION = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__GROUPS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl <em>Form Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormGroup()
	 * @generated
	 */
	int FORM_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__CONTROL_ID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__LABEL = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__CONTROLS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__TEXT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP__FEEDBACK = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Form Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormLabelImpl <em>Form Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormLabelImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormLabel()
	 * @generated
	 */
	int FORM_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__COLUMN = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__SIZES = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visually Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__VISUALLY_HIDDEN = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>For Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL__FOR_ID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Form Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_LABEL_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlImpl <em>Form Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormControl()
	 * @generated
	 */
	int FORM_CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__IS_VALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__IS_INVALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__FIELD_NAME = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__REQUIRED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__TYPE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__PLACEHOLDER = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__INITIAL_VALUE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__SIZE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Plaintext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__PLAINTEXT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__READ_ONLY = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__ROWS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL__AUTO_COMPLETE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Form Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl <em>Form Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormSelect()
	 * @generated
	 */
	int FORM_SELECT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__IS_VALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__IS_INVALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__FIELD_NAME = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__REQUIRED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__SIZE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__MULTIPLE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__INITIAL_VALUE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT__OPTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Form Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_SELECT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormCheckImpl <em>Form Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormCheckImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormCheck()
	 * @generated
	 */
	int FORM_CHECK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__IS_VALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__IS_INVALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__FIELD_NAME = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__REQUIRED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__TYPE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__LABEL = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__LABEL_NODE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__VALUE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__INLINE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__REVERSE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Default Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__DEFAULT_CHECKED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__FEEDBACK = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Feedback Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK__FEEDBACK_TYPE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Form Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CHECK_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl <em>Form Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormRange()
	 * @generated
	 */
	int FORM_RANGE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__IS_VALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Invalid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__IS_INVALID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__FIELD_NAME = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__DISABLED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__REQUIRED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__MIN = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__MAX = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__STEP = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE__INITIAL_VALUE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Form Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_RANGE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormTextImpl <em>Form Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormTextImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormText()
	 * @generated
	 */
	int FORM_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Muted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT__MUTED = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_TEXT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl <em>Form Control Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormControlFeedback()
	 * @generated
	 */
	int FORM_CONTROL_FEEDBACK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__TYPE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK__TOOLTIP = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Form Control Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Form Control Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTROL_FEEDBACK_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl <em>Floating Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFloatingLabel()
	 * @generated
	 */
	int FLOATING_LABEL = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__CONTROL_ID = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__LABEL = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__LABEL_NODE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL__CONTROL = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Floating Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Floating Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_LABEL_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupImpl <em>Input Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getInputGroup()
	 * @generated
	 */
	int INPUT_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__SIZE = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__HAS_VALIDATION = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP__ITEMS = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupTextImpl <em>Input Group Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupTextImpl
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getInputGroupText()
	 * @generated
	 */
	int INPUT_GROUP_TEXT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__DOCUMENTATION = BootstrapPackage.BOOTSTRAP_COMPONENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__DOC_REF = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__DOC_FORMAT = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__DOC_CONTENTS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__DOC_SECTIONS = BootstrapPackage.BOOTSTRAP_COMPONENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__MARKERS = BootstrapPackage.BOOTSTRAP_COMPONENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__ICON = BootstrapPackage.BOOTSTRAP_COMPONENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__URIS = BootstrapPackage.BOOTSTRAP_COMPONENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__NAME = BootstrapPackage.BOOTSTRAP_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__CHILDREN = BootstrapPackage.BOOTSTRAP_COMPONENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__ATTRIBUTES = BootstrapPackage.BOOTSTRAP_COMPONENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__ELEMENT_ID = BootstrapPackage.BOOTSTRAP_COMPONENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__CLASSES = BootstrapPackage.BOOTSTRAP_COMPONENT__CLASSES;

	/**
	 * The feature id for the '<em><b>Style</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__STYLE = BootstrapPackage.BOOTSTRAP_COMPONENT__STYLE;

	/**
	 * The feature id for the '<em><b>As</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__AS = BootstrapPackage.BOOTSTRAP_COMPONENT__AS;

	/**
	 * The feature id for the '<em><b>As Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__AS_COMPONENT = BootstrapPackage.BOOTSTRAP_COMPONENT__AS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT__CONTENT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Group Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT___COLLECT__OBJECT_EREFERENCE_ELIST = BootstrapPackage.BOOTSTRAP_COMPONENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT___GET_REFERRERS__EREFERENCE = BootstrapPackage.BOOTSTRAP_COMPONENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Input Group Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_TEXT_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType <em>Check Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getCheckType()
	 * @generated
	 */
	int CHECK_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType <em>Feedback Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFeedbackType()
	 * @generated
	 */
	int FEEDBACK_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated <em>Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validated</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated
	 * @generated
	 */
	EClass getValidated();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated#isIsValid()
	 * @see #getValidated()
	 * @generated
	 */
	EAttribute getValidated_IsValid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated#isIsInvalid <em>Is Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Invalid</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated#isIsInvalid()
	 * @see #getValidated()
	 * @generated
	 */
	EAttribute getValidated_IsInvalid();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field#getFieldName <em>Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field#getFieldName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_FieldName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field#isDisabled()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field#isRequired()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Required();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#isValidated <em>Validated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validated</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#isValidated()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Validated();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#isNoValidate <em>No Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Validate</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#isNoValidate()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_NoValidate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#getAction()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#getMethod()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Form#getGroups()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Groups();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup <em>Form Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup
	 * @generated
	 */
	EClass getFormGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getControlId()
	 * @see #getFormGroup()
	 * @generated
	 */
	EAttribute getFormGroup_ControlId();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getLabel()
	 * @see #getFormGroup()
	 * @generated
	 */
	EReference getFormGroup_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getControls()
	 * @see #getFormGroup()
	 * @generated
	 */
	EReference getFormGroup_Controls();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getText()
	 * @see #getFormGroup()
	 * @generated
	 */
	EReference getFormGroup_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormGroup#getFeedback()
	 * @see #getFormGroup()
	 * @generated
	 */
	EReference getFormGroup_Feedback();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel <em>Form Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel
	 * @generated
	 */
	EClass getFormLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isColumn()
	 * @see #getFormLabel()
	 * @generated
	 */
	EAttribute getFormLabel_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sizes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getSizes()
	 * @see #getFormLabel()
	 * @generated
	 */
	EReference getFormLabel_Sizes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isVisuallyHidden <em>Visually Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visually Hidden</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#isVisuallyHidden()
	 * @see #getFormLabel()
	 * @generated
	 */
	EAttribute getFormLabel_VisuallyHidden();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getForId <em>For Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormLabel#getForId()
	 * @see #getFormLabel()
	 * @generated
	 */
	EAttribute getFormLabel_ForId();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl <em>Form Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Control</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl
	 * @generated
	 */
	EClass getFormControl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getType()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getPlaceholder()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getInitialValue()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getSize()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isPlaintext <em>Plaintext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plaintext</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isPlaintext()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_Plaintext();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#isReadOnly()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getRows()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getAutoComplete <em>Auto Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Complete</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControl#getAutoComplete()
	 * @see #getFormControl()
	 * @generated
	 */
	EAttribute getFormControl_AutoComplete();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect <em>Form Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Select</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect
	 * @generated
	 */
	EClass getFormSelect();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getSize()
	 * @see #getFormSelect()
	 * @generated
	 */
	EAttribute getFormSelect_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#isMultiple()
	 * @see #getFormSelect()
	 * @generated
	 */
	EAttribute getFormSelect_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getInitialValue()
	 * @see #getFormSelect()
	 * @generated
	 */
	EAttribute getFormSelect_InitialValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormSelect#getOptions()
	 * @see #getFormSelect()
	 * @generated
	 */
	EReference getFormSelect_Options();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck <em>Form Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Check</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck
	 * @generated
	 */
	EClass getFormCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getType()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabel()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabelNode <em>Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getLabelNode()
	 * @see #getFormCheck()
	 * @generated
	 */
	EReference getFormCheck_LabelNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getValue()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inline</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isInline()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_Inline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isReverse()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_Reverse();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isDefaultChecked <em>Default Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Checked</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#isDefaultChecked()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_DefaultChecked();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedback()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormCheck#getFeedbackType()
	 * @see #getFormCheck()
	 * @generated
	 */
	EAttribute getFormCheck_FeedbackType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange <em>Form Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Range</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange
	 * @generated
	 */
	EClass getFormRange();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMin()
	 * @see #getFormRange()
	 * @generated
	 */
	EAttribute getFormRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getMax()
	 * @see #getFormRange()
	 * @generated
	 */
	EAttribute getFormRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getStep()
	 * @see #getFormRange()
	 * @generated
	 */
	EAttribute getFormRange_Step();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormRange#getInitialValue()
	 * @see #getFormRange()
	 * @generated
	 */
	EAttribute getFormRange_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText <em>Form Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText
	 * @generated
	 */
	EClass getFormText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText#isMuted <em>Muted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Muted</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText#isMuted()
	 * @see #getFormText()
	 * @generated
	 */
	EAttribute getFormText_Muted();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback <em>Form Control Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Control Feedback</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback
	 * @generated
	 */
	EClass getFormControlFeedback();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback#getType()
	 * @see #getFormControlFeedback()
	 * @generated
	 */
	EAttribute getFormControlFeedback_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback#isTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback#isTooltip()
	 * @see #getFormControlFeedback()
	 * @generated
	 */
	EAttribute getFormControlFeedback_Tooltip();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel <em>Floating Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel
	 * @generated
	 */
	EClass getFloatingLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getControlId <em>Control Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getControlId()
	 * @see #getFloatingLabel()
	 * @generated
	 */
	EAttribute getFloatingLabel_ControlId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getLabel()
	 * @see #getFloatingLabel()
	 * @generated
	 */
	EAttribute getFloatingLabel_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getLabelNode <em>Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Node</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getLabelNode()
	 * @see #getFloatingLabel()
	 * @generated
	 */
	EReference getFloatingLabel_LabelNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FloatingLabel#getControl()
	 * @see #getFloatingLabel()
	 * @generated
	 */
	EReference getFloatingLabel_Control();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup <em>Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Group</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup
	 * @generated
	 */
	EClass getInputGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup#getSize()
	 * @see #getInputGroup()
	 * @generated
	 */
	EAttribute getInputGroup_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup#isHasValidation <em>Has Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Validation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup#isHasValidation()
	 * @see #getInputGroup()
	 * @generated
	 */
	EAttribute getInputGroup_HasValidation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroup#getItems()
	 * @see #getInputGroup()
	 * @generated
	 */
	EReference getInputGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroupText <em>Input Group Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Group Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.InputGroupText
	 * @generated
	 */
	EClass getInputGroupText();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType <em>Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Check Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType
	 * @generated
	 */
	EEnum getCheckType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType <em>Feedback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType
	 * @generated
	 */
	EEnum getFeedbackType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormsFactory getFormsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated <em>Validated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Validated
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getValidated()
		 * @generated
		 */
		EClass VALIDATED = eINSTANCE.getValidated();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATED__IS_VALID = eINSTANCE.getValidated_IsValid();

		/**
		 * The meta object literal for the '<em><b>Is Invalid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATED__IS_INVALID = eINSTANCE.getValidated_IsInvalid();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.Field
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIELD_NAME = eINSTANCE.getField_FieldName();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DISABLED = eINSTANCE.getField_Disabled();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Validated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__VALIDATED = eINSTANCE.getForm_Validated();

		/**
		 * The meta object literal for the '<em><b>No Validate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NO_VALIDATE = eINSTANCE.getForm_NoValidate();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__ACTION = eINSTANCE.getForm_Action();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__METHOD = eINSTANCE.getForm_Method();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__GROUPS = eINSTANCE.getForm_Groups();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl <em>Form Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormGroup()
		 * @generated
		 */
		EClass FORM_GROUP = eINSTANCE.getFormGroup();

		/**
		 * The meta object literal for the '<em><b>Control Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_GROUP__CONTROL_ID = eINSTANCE.getFormGroup_ControlId();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_GROUP__LABEL = eINSTANCE.getFormGroup_Label();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_GROUP__CONTROLS = eINSTANCE.getFormGroup_Controls();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_GROUP__TEXT = eINSTANCE.getFormGroup_Text();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_GROUP__FEEDBACK = eINSTANCE.getFormGroup_Feedback();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormLabelImpl <em>Form Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormLabelImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormLabel()
		 * @generated
		 */
		EClass FORM_LABEL = eINSTANCE.getFormLabel();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LABEL__COLUMN = eINSTANCE.getFormLabel_Column();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_LABEL__SIZES = eINSTANCE.getFormLabel_Sizes();

		/**
		 * The meta object literal for the '<em><b>Visually Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LABEL__VISUALLY_HIDDEN = eINSTANCE.getFormLabel_VisuallyHidden();

		/**
		 * The meta object literal for the '<em><b>For Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_LABEL__FOR_ID = eINSTANCE.getFormLabel_ForId();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlImpl <em>Form Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormControl()
		 * @generated
		 */
		EClass FORM_CONTROL = eINSTANCE.getFormControl();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__TYPE = eINSTANCE.getFormControl_Type();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__PLACEHOLDER = eINSTANCE.getFormControl_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__INITIAL_VALUE = eINSTANCE.getFormControl_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__SIZE = eINSTANCE.getFormControl_Size();

		/**
		 * The meta object literal for the '<em><b>Plaintext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__PLAINTEXT = eINSTANCE.getFormControl_Plaintext();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__READ_ONLY = eINSTANCE.getFormControl_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__ROWS = eINSTANCE.getFormControl_Rows();

		/**
		 * The meta object literal for the '<em><b>Auto Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL__AUTO_COMPLETE = eINSTANCE.getFormControl_AutoComplete();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl <em>Form Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormSelectImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormSelect()
		 * @generated
		 */
		EClass FORM_SELECT = eINSTANCE.getFormSelect();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_SELECT__SIZE = eINSTANCE.getFormSelect_Size();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_SELECT__MULTIPLE = eINSTANCE.getFormSelect_Multiple();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_SELECT__INITIAL_VALUE = eINSTANCE.getFormSelect_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_SELECT__OPTIONS = eINSTANCE.getFormSelect_Options();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormCheckImpl <em>Form Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormCheckImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormCheck()
		 * @generated
		 */
		EClass FORM_CHECK = eINSTANCE.getFormCheck();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__TYPE = eINSTANCE.getFormCheck_Type();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__LABEL = eINSTANCE.getFormCheck_Label();

		/**
		 * The meta object literal for the '<em><b>Label Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CHECK__LABEL_NODE = eINSTANCE.getFormCheck_LabelNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__VALUE = eINSTANCE.getFormCheck_Value();

		/**
		 * The meta object literal for the '<em><b>Inline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__INLINE = eINSTANCE.getFormCheck_Inline();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__REVERSE = eINSTANCE.getFormCheck_Reverse();

		/**
		 * The meta object literal for the '<em><b>Default Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__DEFAULT_CHECKED = eINSTANCE.getFormCheck_DefaultChecked();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__FEEDBACK = eINSTANCE.getFormCheck_Feedback();

		/**
		 * The meta object literal for the '<em><b>Feedback Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CHECK__FEEDBACK_TYPE = eINSTANCE.getFormCheck_FeedbackType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl <em>Form Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormRangeImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormRange()
		 * @generated
		 */
		EClass FORM_RANGE = eINSTANCE.getFormRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_RANGE__MIN = eINSTANCE.getFormRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_RANGE__MAX = eINSTANCE.getFormRange_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_RANGE__STEP = eINSTANCE.getFormRange_Step();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_RANGE__INITIAL_VALUE = eINSTANCE.getFormRange_InitialValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormTextImpl <em>Form Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormTextImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormText()
		 * @generated
		 */
		EClass FORM_TEXT = eINSTANCE.getFormText();

		/**
		 * The meta object literal for the '<em><b>Muted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_TEXT__MUTED = eINSTANCE.getFormText_Muted();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl <em>Form Control Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFormControlFeedback()
		 * @generated
		 */
		EClass FORM_CONTROL_FEEDBACK = eINSTANCE.getFormControlFeedback();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL_FEEDBACK__TYPE = eINSTANCE.getFormControlFeedback_Type();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTROL_FEEDBACK__TOOLTIP = eINSTANCE.getFormControlFeedback_Tooltip();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl <em>Floating Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FloatingLabelImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFloatingLabel()
		 * @generated
		 */
		EClass FLOATING_LABEL = eINSTANCE.getFloatingLabel();

		/**
		 * The meta object literal for the '<em><b>Control Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_LABEL__CONTROL_ID = eINSTANCE.getFloatingLabel_ControlId();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_LABEL__LABEL = eINSTANCE.getFloatingLabel_Label();

		/**
		 * The meta object literal for the '<em><b>Label Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOATING_LABEL__LABEL_NODE = eINSTANCE.getFloatingLabel_LabelNode();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOATING_LABEL__CONTROL = eINSTANCE.getFloatingLabel_Control();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupImpl <em>Input Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getInputGroup()
		 * @generated
		 */
		EClass INPUT_GROUP = eINSTANCE.getInputGroup();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_GROUP__SIZE = eINSTANCE.getInputGroup_Size();

		/**
		 * The meta object literal for the '<em><b>Has Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_GROUP__HAS_VALIDATION = eINSTANCE.getInputGroup_HasValidation();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_GROUP__ITEMS = eINSTANCE.getInputGroup_Items();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupTextImpl <em>Input Group Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.InputGroupTextImpl
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getInputGroupText()
		 * @generated
		 */
		EClass INPUT_GROUP_TEXT = eINSTANCE.getInputGroupText();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType <em>Check Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.CheckType
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getCheckType()
		 * @generated
		 */
		EEnum CHECK_TYPE = eINSTANCE.getCheckType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType <em>Feedback Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType
		 * @see org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormsPackageImpl#getFeedbackType()
		 * @generated
		 */
		EEnum FEEDBACK_TYPE = eINSTANCE.getFeedbackType();

	}

} //FormsPackage
