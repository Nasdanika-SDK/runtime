/**
 */
package org.nasdanika.sdk.runtime.models.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nasdanika.sdk.runtime.models.core.CoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.nasdanika.sdk.runtime.models.core/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.Referrable <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.Referrable
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST = 0;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE___GET_REFERRERS__EREFERENCE = 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity <em>String Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.StringIdentity
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getStringIdentity()
	 * @generated
	 */
	int STRING_IDENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY__ID = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST = REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY___GET_REFERRERS__EREFERENCE = REFERRABLE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.StringToStringMapEntryImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__DATE = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__DIGEST = 5;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__CHILDREN = 6;

	/**
	 * The number of structural features of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.GitMarkerImpl <em>Git Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.GitMarkerImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getGitMarker()
	 * @generated
	 */
	int GIT_MARKER = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__LOCATION = MARKER__LOCATION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__POSITION = MARKER__POSITION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__COMMENT = MARKER__COMMENT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__DATE = MARKER__DATE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__FEATURE = MARKER__FEATURE;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__DIGEST = MARKER__DIGEST;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__CHILDREN = MARKER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__PATH = MARKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remotes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__REMOTES = MARKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__BRANCH = MARKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__HEAD = MARKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Head Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__HEAD_REFS = MARKER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Git Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER_FEATURE_COUNT = MARKER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Git Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER_OPERATION_COUNT = MARKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.Marked <em>Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.Marked
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getMarked()
	 * @generated
	 */
	int MARKED = 5;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED__MARKERS = 0;

	/**
	 * The number of structural features of the '<em>Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.ContentImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Content Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_REF = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.SectionReferenceImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSectionReference()
	 * @generated
	 */
	int SECTION_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE__ID = 1;

	/**
	 * The number of structural features of the '<em>Section Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.SectionImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = SECTION_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = SECTION_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CHILDREN = SECTION_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = SECTION_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = SECTION_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = SECTION_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.Documented <em>Documented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.Documented
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getDocumented()
	 * @generated
	 */
	int DOCUMENTED = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_REF = 1;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_CONTENTS = 3;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_SECTIONS = 4;

	/**
	 * The number of structural features of the '<em>Documented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Documented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_REF = STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_FORMAT = STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_CONTENTS = STRING_IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_SECTIONS = STRING_IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__MARKERS = STRING_IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ICON = STRING_IDENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URIS = STRING_IDENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___GET_REFERRERS__EREFERENCE = STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_CONTENTS = MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_SECTIONS = MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__MARKERS = MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.Evaluator <em>Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.Evaluator
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getEvaluator()
	 * @generated
	 */
	int EVALUATOR = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOCUMENTATION = DOCUMENTED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_REF = DOCUMENTED__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_FORMAT = DOCUMENTED__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_CONTENTS = DOCUMENTED__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_SECTIONS = DOCUMENTED__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__MARKERS = DOCUMENTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR_FEATURE_COUNT = DOCUMENTED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE__CLASS_MAP = DOCUMENTED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE__CLASS = DOCUMENTED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE__MAP = DOCUMENTED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE = DOCUMENTED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR_OPERATION_COUNT = DOCUMENTED_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SourceEvaluatorImpl <em>Source Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.SourceEvaluatorImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSourceEvaluator()
	 * @generated
	 */
	int SOURCE_EVALUATOR = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOCUMENTATION = EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_REF = EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_FORMAT = EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_CONTENTS = EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_SECTIONS = EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__MARKERS = EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__SCRIPT = EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__SCRIPT_REF = EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR_FEATURE_COUNT = EVALUATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE__CLASS_MAP = EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE__CLASS = EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE__MAP = EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE = EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Source Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR_OPERATION_COUNT = EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl <em>Expression Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getExpressionEvaluator()
	 * @generated
	 */
	int EXPRESSION_EVALUATOR = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__DOCUMENTATION = EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__DOC_REF = EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__DOC_FORMAT = EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__DOC_CONTENTS = EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__DOC_SECTIONS = EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__MARKERS = EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR__EXPRESSION = EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR_FEATURE_COUNT = EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR___EVALUATE__CLASS_MAP = EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR___EVALUATE__CLASS = EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR___EVALUATE__MAP = EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR___EVALUATE = EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Expression Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EVALUATOR_OPERATION_COUNT = EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SpelEvaluatorImpl <em>Spel Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.SpelEvaluatorImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSpelEvaluator()
	 * @generated
	 */
	int SPEL_EVALUATOR = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOCUMENTATION = EXPRESSION_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_REF = EXPRESSION_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_FORMAT = EXPRESSION_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_CONTENTS = EXPRESSION_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_SECTIONS = EXPRESSION_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__MARKERS = EXPRESSION_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__EXPRESSION = EXPRESSION_EVALUATOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Spel Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR_FEATURE_COUNT = EXPRESSION_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE__CLASS = EXPRESSION_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE__MAP = EXPRESSION_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE = EXPRESSION_EVALUATOR___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE__CLASS_MAP = EXPRESSION_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spel Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR_OPERATION_COUNT = EXPRESSION_EVALUATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.XPathEvaluatorImpl <em>XPath Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.XPathEvaluatorImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getXPathEvaluator()
	 * @generated
	 */
	int XPATH_EVALUATOR = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__DOCUMENTATION = EXPRESSION_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__DOC_REF = EXPRESSION_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__DOC_FORMAT = EXPRESSION_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__DOC_CONTENTS = EXPRESSION_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__DOC_SECTIONS = EXPRESSION_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__MARKERS = EXPRESSION_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR__EXPRESSION = EXPRESSION_EVALUATOR__EXPRESSION;

	/**
	 * The number of structural features of the '<em>XPath Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR_FEATURE_COUNT = EXPRESSION_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR___EVALUATE__CLASS = EXPRESSION_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR___EVALUATE__MAP = EXPRESSION_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR___EVALUATE = EXPRESSION_EVALUATOR___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR___EVALUATE__CLASS_MAP = EXPRESSION_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>XPath Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPATH_EVALUATOR_OPERATION_COUNT = EXPRESSION_EVALUATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ScriptEvaluatorImpl <em>Script Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.ScriptEvaluatorImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getScriptEvaluator()
	 * @generated
	 */
	int SCRIPT_EVALUATOR = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOCUMENTATION = SOURCE_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_REF = SOURCE_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_FORMAT = SOURCE_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_CONTENTS = SOURCE_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_SECTIONS = SOURCE_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__MARKERS = SOURCE_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__SCRIPT = SOURCE_EVALUATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__SCRIPT_REF = SOURCE_EVALUATOR__SCRIPT_REF;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__LANGUAGE = SOURCE_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR_FEATURE_COUNT = SOURCE_EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE__CLASS = SOURCE_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE__MAP = SOURCE_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE = SOURCE_EVALUATOR___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE__CLASS_MAP = SOURCE_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR_OPERATION_COUNT = SOURCE_EVALUATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.core.impl.GroovyEvaluatorImpl <em>Groovy Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.core.impl.GroovyEvaluatorImpl
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getGroovyEvaluator()
	 * @generated
	 */
	int GROOVY_EVALUATOR = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOCUMENTATION = SOURCE_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_REF = SOURCE_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_FORMAT = SOURCE_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_CONTENTS = SOURCE_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_SECTIONS = SOURCE_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__MARKERS = SOURCE_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__SCRIPT = SOURCE_EVALUATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__SCRIPT_REF = SOURCE_EVALUATOR__SCRIPT_REF;

	/**
	 * The number of structural features of the '<em>Groovy Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR_FEATURE_COUNT = SOURCE_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE__CLASS = SOURCE_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE__MAP = SOURCE_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE = SOURCE_EVALUATOR___EVALUATE;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE__CLASS_MAP = SOURCE_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Groovy Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR_OPERATION_COUNT = SOURCE_EVALUATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Instant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 19;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Duration
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 20;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 21;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 22;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 23;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.Referrable#collect(java.lang.Object, org.eclipse.emf.ecore.EReference, org.eclipse.emf.common.util.EList) <em>Collect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.Referrable#collect(java.lang.Object, org.eclipse.emf.ecore.EReference, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getReferrable__Collect__Object_EReference_EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.Referrable#getReferrers(org.eclipse.emf.ecore.EReference) <em>Get Referrers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referrers</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.Referrable#getReferrers(org.eclipse.emf.ecore.EReference)
	 * @generated
	 */
	EOperation getReferrable__GetReferrers__EReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity <em>String Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Identity</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.StringIdentity
	 * @generated
	 */
	EClass getStringIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.StringIdentity#getId()
	 * @see #getStringIdentity()
	 * @generated
	 */
	EAttribute getStringIdentity_Id();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Marker#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getLocation()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Marker#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getPosition()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Marker#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getComment()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Marker#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getDate()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Marker#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getFeature()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Marker#getDigest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getDigest()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Digest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.core.Marker#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marker#getChildren()
	 * @see #getMarker()
	 * @generated
	 */
	EReference getMarker_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.GitMarker <em>Git Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Marker</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GitMarker
	 * @generated
	 */
	EClass getGitMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GitMarker#getPath()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_Path();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getRemotes <em>Remotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Remotes</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GitMarker#getRemotes()
	 * @see #getGitMarker()
	 * @generated
	 */
	EReference getGitMarker_Remotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GitMarker#getBranch()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_Branch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GitMarker#getHead()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_Head();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.core.GitMarker#getHeadRefs <em>Head Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Head Refs</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GitMarker#getHeadRefs()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_HeadRefs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marked
	 * @generated
	 */
	EClass getMarked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.core.Marked#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Marked#getMarkers()
	 * @see #getMarked()
	 * @generated
	 */
	EReference getMarked_Markers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Content#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Content#getContent()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Content#getContentRef <em>Content Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Ref</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Content#getContentRef()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Content#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Content#getContentType()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.SectionReference <em>Section Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Reference</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SectionReference
	 * @generated
	 */
	EClass getSectionReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.SectionReference#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SectionReference#getTitle()
	 * @see #getSectionReference()
	 * @generated
	 */
	EAttribute getSectionReference_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.SectionReference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SectionReference#getId()
	 * @see #getSectionReference()
	 * @generated
	 */
	EAttribute getSectionReference_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.core.Section#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Section#getChildren()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.core.Section#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Section#getContents()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Contents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented
	 * @generated
	 */
	EClass getDocumented();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Documented#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented#getDocumentation()
	 * @see #getDocumented()
	 * @generated
	 */
	EAttribute getDocumented_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Documented#getDocRef <em>Doc Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Ref</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented#getDocRef()
	 * @see #getDocumented()
	 * @generated
	 */
	EAttribute getDocumented_DocRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.Documented#getDocFormat <em>Doc Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Format</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented#getDocFormat()
	 * @see #getDocumented()
	 * @generated
	 */
	EAttribute getDocumented_DocFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.core.Documented#getDocContents <em>Doc Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc Contents</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented#getDocContents()
	 * @see #getDocumented()
	 * @generated
	 */
	EReference getDocumented_DocContents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.core.Documented#getDocSections <em>Doc Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc Sections</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Documented#getDocSections()
	 * @see #getDocumented()
	 * @generated
	 */
	EReference getDocumented_DocSections();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.ModelElement#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ModelElement#getIcon()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Icon();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.sdk.runtime.models.core.ModelElement#getUris <em>Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uris</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ModelElement#getUris()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uris();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.Evaluator <em>Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.Evaluator
	 * @generated
	 */
	EClass getEvaluator();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate(java.lang.Class, java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate(java.lang.Class, java.util.Map)
	 * @generated
	 */
	EOperation getEvaluator__Evaluate__Class_Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate(java.lang.Class) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate(java.lang.Class)
	 * @generated
	 */
	EOperation getEvaluator__Evaluate__Class();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate(java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate(java.util.Map)
	 * @generated
	 */
	EOperation getEvaluator__Evaluate__Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.Evaluator#evaluate()
	 * @generated
	 */
	EOperation getEvaluator__Evaluate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator <em>Source Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SourceEvaluator
	 * @generated
	 */
	EClass getSourceEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScript()
	 * @see #getSourceEvaluator()
	 * @generated
	 */
	EAttribute getSourceEvaluator_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScriptRef <em>Script Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Ref</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SourceEvaluator#getScriptRef()
	 * @see #getSourceEvaluator()
	 * @generated
	 */
	EAttribute getSourceEvaluator_ScriptRef();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.ExpressionEvaluator <em>Expression Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ExpressionEvaluator
	 * @generated
	 */
	EClass getExpressionEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.ExpressionEvaluator#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ExpressionEvaluator#getExpression()
	 * @see #getExpressionEvaluator()
	 * @generated
	 */
	EAttribute getExpressionEvaluator_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.SpelEvaluator <em>Spel Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spel Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.SpelEvaluator
	 * @generated
	 */
	EClass getSpelEvaluator();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.SpelEvaluator#evaluate(java.lang.Class, java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.SpelEvaluator#evaluate(java.lang.Class, java.util.Map)
	 * @generated
	 */
	EOperation getSpelEvaluator__Evaluate__Class_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.XPathEvaluator <em>XPath Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPath Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.XPathEvaluator
	 * @generated
	 */
	EClass getXPathEvaluator();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.XPathEvaluator#evaluate(java.lang.Class, java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.XPathEvaluator#evaluate(java.lang.Class, java.util.Map)
	 * @generated
	 */
	EOperation getXPathEvaluator__Evaluate__Class_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.ScriptEvaluator <em>Script Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ScriptEvaluator
	 * @generated
	 */
	EClass getScriptEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.core.ScriptEvaluator#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.ScriptEvaluator#getLanguage()
	 * @see #getScriptEvaluator()
	 * @generated
	 */
	EAttribute getScriptEvaluator_Language();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.ScriptEvaluator#evaluate(java.lang.Class, java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.ScriptEvaluator#evaluate(java.lang.Class, java.util.Map)
	 * @generated
	 */
	EOperation getScriptEvaluator__Evaluate__Class_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.core.GroovyEvaluator <em>Groovy Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groovy Evaluator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.core.GroovyEvaluator
	 * @generated
	 */
	EClass getGroovyEvaluator();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.core.GroovyEvaluator#evaluate(java.lang.Class, java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.core.GroovyEvaluator#evaluate(java.lang.Class, java.util.Map)
	 * @generated
	 */
	EOperation getGroovyEvaluator__Evaluate__Class_Map();

	/**
	 * Returns the meta object for data type '{@link java.time.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instant</em>'.
	 * @see java.time.Instant
	 * @model instanceClass="java.time.Instant"
	 * @generated
	 */
	EDataType getInstant();

	/**
	 * Returns the meta object for data type '{@link java.time.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @see java.time.Duration
	 * @model instanceClass="java.time.Duration"
	 * @generated
	 */
	EDataType getDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 * @generated
	 */
	EDataType getClass_();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.Referrable <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.Referrable
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Collect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST = eINSTANCE.getReferrable__Collect__Object_EReference_EList();

		/**
		 * The meta object literal for the '<em><b>Get Referrers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRABLE___GET_REFERRERS__EREFERENCE = eINSTANCE.getReferrable__GetReferrers__EReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity <em>String Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.StringIdentity
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getStringIdentity()
		 * @generated
		 */
		EClass STRING_IDENTITY = eINSTANCE.getStringIdentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_IDENTITY__ID = eINSTANCE.getStringIdentity_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.StringToStringMapEntryImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl <em>Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__LOCATION = eINSTANCE.getMarker_Location();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__POSITION = eINSTANCE.getMarker_Position();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__COMMENT = eINSTANCE.getMarker_Comment();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__DATE = eINSTANCE.getMarker_Date();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__FEATURE = eINSTANCE.getMarker_Feature();

		/**
		 * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__DIGEST = eINSTANCE.getMarker_Digest();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKER__CHILDREN = eINSTANCE.getMarker_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.GitMarkerImpl <em>Git Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.GitMarkerImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getGitMarker()
		 * @generated
		 */
		EClass GIT_MARKER = eINSTANCE.getGitMarker();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__PATH = eINSTANCE.getGitMarker_Path();

		/**
		 * The meta object literal for the '<em><b>Remotes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_MARKER__REMOTES = eINSTANCE.getGitMarker_Remotes();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__BRANCH = eINSTANCE.getGitMarker_Branch();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__HEAD = eINSTANCE.getGitMarker_Head();

		/**
		 * The meta object literal for the '<em><b>Head Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__HEAD_REFS = eINSTANCE.getGitMarker_HeadRefs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.Marked <em>Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.Marked
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getMarked()
		 * @generated
		 */
		EClass MARKED = eINSTANCE.getMarked();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKED__MARKERS = eINSTANCE.getMarked_Markers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.ContentImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT = eINSTANCE.getContent_Content();

		/**
		 * The meta object literal for the '<em><b>Content Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_REF = eINSTANCE.getContent_ContentRef();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_TYPE = eINSTANCE.getContent_ContentType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.SectionReferenceImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSectionReference()
		 * @generated
		 */
		EClass SECTION_REFERENCE = eINSTANCE.getSectionReference();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_REFERENCE__TITLE = eINSTANCE.getSectionReference_Title();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_REFERENCE__ID = eINSTANCE.getSectionReference_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.SectionImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CHILDREN = eINSTANCE.getSection_Children();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CONTENTS = eINSTANCE.getSection_Contents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.Documented <em>Documented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.Documented
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getDocumented()
		 * @generated
		 */
		EClass DOCUMENTED = eINSTANCE.getDocumented();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED__DOCUMENTATION = eINSTANCE.getDocumented_Documentation();

		/**
		 * The meta object literal for the '<em><b>Doc Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED__DOC_REF = eINSTANCE.getDocumented_DocRef();

		/**
		 * The meta object literal for the '<em><b>Doc Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED__DOC_FORMAT = eINSTANCE.getDocumented_DocFormat();

		/**
		 * The meta object literal for the '<em><b>Doc Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED__DOC_CONTENTS = eINSTANCE.getDocumented_DocContents();

		/**
		 * The meta object literal for the '<em><b>Doc Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED__DOC_SECTIONS = eINSTANCE.getDocumented_DocSections();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.ModelElementImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ICON = eINSTANCE.getModelElement_Icon();

		/**
		 * The meta object literal for the '<em><b>Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__URIS = eINSTANCE.getModelElement_Uris();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.Evaluator <em>Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.Evaluator
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getEvaluator()
		 * @generated
		 */
		EClass EVALUATOR = eINSTANCE.getEvaluator();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE__CLASS_MAP = eINSTANCE.getEvaluator__Evaluate__Class_Map();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE__CLASS = eINSTANCE.getEvaluator__Evaluate__Class();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE__MAP = eINSTANCE.getEvaluator__Evaluate__Map();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE = eINSTANCE.getEvaluator__Evaluate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SourceEvaluatorImpl <em>Source Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.SourceEvaluatorImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSourceEvaluator()
		 * @generated
		 */
		EClass SOURCE_EVALUATOR = eINSTANCE.getSourceEvaluator();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_EVALUATOR__SCRIPT = eINSTANCE.getSourceEvaluator_Script();

		/**
		 * The meta object literal for the '<em><b>Script Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_EVALUATOR__SCRIPT_REF = eINSTANCE.getSourceEvaluator_ScriptRef();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl <em>Expression Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.ExpressionEvaluatorImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getExpressionEvaluator()
		 * @generated
		 */
		EClass EXPRESSION_EVALUATOR = eINSTANCE.getExpressionEvaluator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_EVALUATOR__EXPRESSION = eINSTANCE.getExpressionEvaluator_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.SpelEvaluatorImpl <em>Spel Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.SpelEvaluatorImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getSpelEvaluator()
		 * @generated
		 */
		EClass SPEL_EVALUATOR = eINSTANCE.getSpelEvaluator();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPEL_EVALUATOR___EVALUATE__CLASS_MAP = eINSTANCE.getSpelEvaluator__Evaluate__Class_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.XPathEvaluatorImpl <em>XPath Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.XPathEvaluatorImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getXPathEvaluator()
		 * @generated
		 */
		EClass XPATH_EVALUATOR = eINSTANCE.getXPathEvaluator();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPATH_EVALUATOR___EVALUATE__CLASS_MAP = eINSTANCE.getXPathEvaluator__Evaluate__Class_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.ScriptEvaluatorImpl <em>Script Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.ScriptEvaluatorImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getScriptEvaluator()
		 * @generated
		 */
		EClass SCRIPT_EVALUATOR = eINSTANCE.getScriptEvaluator();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_EVALUATOR__LANGUAGE = eINSTANCE.getScriptEvaluator_Language();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCRIPT_EVALUATOR___EVALUATE__CLASS_MAP = eINSTANCE.getScriptEvaluator__Evaluate__Class_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.core.impl.GroovyEvaluatorImpl <em>Groovy Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.core.impl.GroovyEvaluatorImpl
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getGroovyEvaluator()
		 * @generated
		 */
		EClass GROOVY_EVALUATOR = eINSTANCE.getGroovyEvaluator();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GROOVY_EVALUATOR___EVALUATE__CLASS_MAP = eINSTANCE.getGroovyEvaluator__Evaluate__Class_Map();

		/**
		 * The meta object literal for the '<em>Instant</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getInstant()
		 * @generated
		 */
		EDataType INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Duration
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getClass_()
		 * @generated
		 */
		EDataType CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.nasdanika.sdk.runtime.models.core.impl.CorePackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //CorePackage
