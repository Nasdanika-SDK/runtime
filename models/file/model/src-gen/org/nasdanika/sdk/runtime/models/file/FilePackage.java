/**
 */
package org.nasdanika.sdk.runtime.models.file;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.nasdanika.sdk.runtime.models.file.FileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='https://runtime.sdk.nasdanika.org/models/file/delegate' settingDelegates='https://runtime.sdk.nasdanika.org/models/file/delegate'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.nasdanika.sdk.runtime.models.file.model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika' Delegate='https://runtime.sdk.nasdanika.org/models/file/delegate' ToolBinding='https://runtime.sdk.nasdanika.org/models/inference/tool-binding'"
 * @generated
 */
public interface FilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/file";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.file";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilePackage eINSTANCE = org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.EntryImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PATH = 1;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__HASH = 2;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__LIVE = 4;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY___SNAPSHOT = 0;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY___DELETE = 1;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY___MOVE_TO__DIRECTORY_STRING = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.DirectoryImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = ENTRY__PATH;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__HASH = ENTRY__HASH;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__MODIFIED = ENTRY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__LIVE = ENTRY__LIVE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__CHILDREN = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___SNAPSHOT = ENTRY___SNAPSHOT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___DELETE = ENTRY___DELETE;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___MOVE_TO__DIRECTORY_STRING = ENTRY___MOVE_TO__DIRECTORY_STRING;

	/**
	 * The operation id for the '<em>List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___LIST__STRING_INT_INT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Find</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___FIND__STRING = ENTRY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Glob</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___GLOB__STRING = ENTRY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Grep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___GREP__STRING_STRING = ENTRY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Create File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___CREATE_FILE__STRING_CONTENT = ENTRY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Directory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY___CREATE_DIRECTORY__STRING = ENTRY_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FileImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = ENTRY__PATH;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__HASH = ENTRY__HASH;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFIED = ENTRY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LIVE = ENTRY__LIVE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTENT = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTENT_TYPE = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___SNAPSHOT = ENTRY___SNAPSHOT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___DELETE = ENTRY___DELETE;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___MOVE_TO__DIRECTORY_STRING = ENTRY___MOVE_TO__DIRECTORY_STRING;

	/**
	 * The operation id for the '<em>Open Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___OPEN_STREAM = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Write To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___WRITE_TO__OUTPUTSTREAM = ENTRY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl <em>Text File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getTextFile()
	 * @generated
	 */
	int TEXT_FILE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__PATH = FILE__PATH;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__HASH = FILE__HASH;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__LIVE = FILE__LIVE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONTENT = FILE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CONTENT_TYPE = FILE__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__SIZE = FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__CHARSET = FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__LINE_SEPARATOR = FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE__TEXT = FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___SNAPSHOT = FILE___SNAPSHOT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___DELETE = FILE___DELETE;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___MOVE_TO__DIRECTORY_STRING = FILE___MOVE_TO__DIRECTORY_STRING;

	/**
	 * The operation id for the '<em>Open Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___OPEN_STREAM = FILE___OPEN_STREAM;

	/**
	 * The operation id for the '<em>Write To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___WRITE_TO__OUTPUTSTREAM = FILE___WRITE_TO__OUTPUTSTREAM;

	/**
	 * The operation id for the '<em>Line Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___LINE_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___VIEW__INT_INT = FILE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Replace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___REPLACE__STRING_STRING = FILE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Insert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___INSERT__INT_CHARSEQUENCE = FILE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Grep</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE___GREP__STRING = FILE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Text File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.ArchiveFileImpl <em>Archive File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.ArchiveFileImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getArchiveFile()
	 * @generated
	 */
	int ARCHIVE_FILE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__PATH = FILE__PATH;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__HASH = FILE__HASH;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__MODIFIED = FILE__MODIFIED;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__LIVE = FILE__LIVE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__CONTENT = FILE__CONTENT;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__CONTENT_TYPE = FILE__CONTENT_TYPE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE__SIZE = FILE__SIZE;

	/**
	 * The number of structural features of the '<em>Archive File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE___SNAPSHOT = FILE___SNAPSHOT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE___DELETE = FILE___DELETE;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE___MOVE_TO__DIRECTORY_STRING = FILE___MOVE_TO__DIRECTORY_STRING;

	/**
	 * The operation id for the '<em>Open Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE___OPEN_STREAM = FILE___OPEN_STREAM;

	/**
	 * The operation id for the '<em>Write To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE___WRITE_TO__OUTPUTSTREAM = FILE___WRITE_TO__OUTPUTSTREAM;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE___OPEN = FILE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Archive File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVE_FILE_OPERATION_COUNT = FILE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.LinkImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PATH = ENTRY__PATH;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HASH = ENTRY__HASH;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MODIFIED = ENTRY__MODIFIED;

	/**
	 * The feature id for the '<em><b>Live</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LIVE = ENTRY__LIVE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Snapshot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___SNAPSHOT = ENTRY___SNAPSHOT;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___DELETE = ENTRY___DELETE;

	/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___MOVE_TO__DIRECTORY_STRING = ENTRY___MOVE_TO__DIRECTORY_STRING;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.impl.MatchImpl
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__PATH = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__LINE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TEXT = 2;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.file.LineSeparator <em>Line Separator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.file.LineSeparator
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getLineSeparator()
	 * @generated
	 */
	int LINE_SEPARATOR = 7;

	/**
	 * The meta object id for the '<em>Content</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.volume.Content
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 8;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 9;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 10;

	/**
	 * The meta object id for the '<em>Char Sequence</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.CharSequence
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getCharSequence()
	 * @generated
	 */
	int CHAR_SEQUENCE = 11;

	/**
	 * The meta object id for the '<em>Instant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 12;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Entry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#getName()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Entry#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#getPath()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Entry#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#getHash()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Hash();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Entry#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#getModified()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Modified();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Entry#isLive <em>Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#isLive()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Live();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Entry#snapshot() <em>Snapshot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Snapshot</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#snapshot()
	 * @generated
	 */
	EOperation getEntry__Snapshot();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Entry#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#delete()
	 * @generated
	 */
	EOperation getEntry__Delete();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Entry#moveTo(org.nasdanika.sdk.runtime.models.file.Directory, java.lang.String) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Entry#moveTo(org.nasdanika.sdk.runtime.models.file.Directory, java.lang.String)
	 * @generated
	 */
	EOperation getEntry__MoveTo__Directory_String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.sdk.runtime.models.file.Directory#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#getChildren()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Children();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Directory#list(java.lang.String, int, int) <em>List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#list(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getDirectory__List__String_int_int();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Directory#find(java.lang.String) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#find(java.lang.String)
	 * @generated
	 */
	EOperation getDirectory__Find__String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Directory#glob(java.lang.String) <em>Glob</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Glob</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#glob(java.lang.String)
	 * @generated
	 */
	EOperation getDirectory__Glob__String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Directory#grep(java.lang.String, java.lang.String) <em>Grep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Grep</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#grep(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDirectory__Grep__String_String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Directory#createFile(java.lang.String, org.nasdanika.sdk.runtime.volume.Content) <em>Create File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create File</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#createFile(java.lang.String, org.nasdanika.sdk.runtime.volume.Content)
	 * @generated
	 */
	EOperation getDirectory__CreateFile__String_Content();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.Directory#createDirectory(java.lang.String) <em>Create Directory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Directory</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.Directory#createDirectory(java.lang.String)
	 * @generated
	 */
	EOperation getDirectory__CreateDirectory__String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.File#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.File#getContent()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.File#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.File#getContentType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.File#openStream() <em>Open Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Stream</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.File#openStream()
	 * @generated
	 */
	EOperation getFile__OpenStream();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.File#writeTo(java.io.OutputStream) <em>Write To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write To</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.File#writeTo(java.io.OutputStream)
	 * @generated
	 */
	EOperation getFile__WriteTo__OutputStream();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.TextFile <em>Text File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text File</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile
	 * @generated
	 */
	EClass getTextFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.TextFile#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#getCharset()
	 * @see #getTextFile()
	 * @generated
	 */
	EAttribute getTextFile_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.TextFile#getLineSeparator <em>Line Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Separator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#getLineSeparator()
	 * @see #getTextFile()
	 * @generated
	 */
	EAttribute getTextFile_LineSeparator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.TextFile#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#getText()
	 * @see #getTextFile()
	 * @generated
	 */
	EAttribute getTextFile_Text();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#lineCount() <em>Line Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Line Count</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#lineCount()
	 * @generated
	 */
	EOperation getTextFile__LineCount();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#view(int, int) <em>View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#view(int, int)
	 * @generated
	 */
	EOperation getTextFile__View__int_int();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#replace(java.lang.String, java.lang.String) <em>Replace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Replace</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#replace(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getTextFile__Replace__String_String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#insert(int, java.lang.CharSequence) <em>Insert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Insert</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#insert(int, java.lang.CharSequence)
	 * @generated
	 */
	EOperation getTextFile__Insert__int_CharSequence();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.TextFile#grep(java.lang.String) <em>Grep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Grep</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.TextFile#grep(java.lang.String)
	 * @generated
	 */
	EOperation getTextFile__Grep__String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.ArchiveFile <em>Archive File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archive File</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.ArchiveFile
	 * @generated
	 */
	EClass getArchiveFile();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.sdk.runtime.models.file.ArchiveFile#open() <em>Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open</em>' operation.
	 * @see org.nasdanika.sdk.runtime.models.file.ArchiveFile#open()
	 * @generated
	 */
	EOperation getArchiveFile__Open();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.file.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Match#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Match#getPath()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Match#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Match#getLine()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.sdk.runtime.models.file.Match#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.Match#getText()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Text();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.sdk.runtime.models.file.LineSeparator <em>Line Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Separator</em>'.
	 * @see org.nasdanika.sdk.runtime.models.file.LineSeparator
	 * @generated
	 */
	EEnum getLineSeparator();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.sdk.runtime.volume.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The state of a file. Snapshot serialization converts it to and from a string: base64 for small
     * content, a reference to a stored blob for large content (an open decision).
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Content</em>'.
	 * @see org.nasdanika.sdk.runtime.volume.Content
	 * @model instanceClass="org.nasdanika.sdk.runtime.volume.Content"
	 * @generated
	 */
	EDataType getContent();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getOutputStream();

	/**
	 * Returns the meta object for data type '{@link java.lang.CharSequence <em>Char Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Char Sequence</em>'.
	 * @see java.lang.CharSequence
	 * @model instanceClass="java.lang.CharSequence"
	 * @generated
	 */
	EDataType getCharSequence();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileFactory getFileFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.EntryImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__NAME = eINSTANCE.getEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PATH = eINSTANCE.getEntry_Path();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__HASH = eINSTANCE.getEntry_Hash();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__MODIFIED = eINSTANCE.getEntry_Modified();

		/**
		 * The meta object literal for the '<em><b>Live</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__LIVE = eINSTANCE.getEntry_Live();

		/**
		 * The meta object literal for the '<em><b>Snapshot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRY___SNAPSHOT = eINSTANCE.getEntry__Snapshot();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRY___DELETE = eINSTANCE.getEntry__Delete();

		/**
		 * The meta object literal for the '<em><b>Move To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRY___MOVE_TO__DIRECTORY_STRING = eINSTANCE.getEntry__MoveTo__Directory_String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.DirectoryImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__CHILDREN = eINSTANCE.getDirectory_Children();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTORY___LIST__STRING_INT_INT = eINSTANCE.getDirectory__List__String_int_int();

		/**
		 * The meta object literal for the '<em><b>Find</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTORY___FIND__STRING = eINSTANCE.getDirectory__Find__String();

		/**
		 * The meta object literal for the '<em><b>Glob</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTORY___GLOB__STRING = eINSTANCE.getDirectory__Glob__String();

		/**
		 * The meta object literal for the '<em><b>Grep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTORY___GREP__STRING_STRING = eINSTANCE.getDirectory__Grep__String_String();

		/**
		 * The meta object literal for the '<em><b>Create File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTORY___CREATE_FILE__STRING_CONTENT = eINSTANCE.getDirectory__CreateFile__String_Content();

		/**
		 * The meta object literal for the '<em><b>Create Directory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DIRECTORY___CREATE_DIRECTORY__STRING = eINSTANCE.getDirectory__CreateDirectory__String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FileImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CONTENT = eINSTANCE.getFile_Content();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CONTENT_TYPE = eINSTANCE.getFile_ContentType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SIZE = eINSTANCE.getFile_Size();

		/**
		 * The meta object literal for the '<em><b>Open Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___OPEN_STREAM = eINSTANCE.getFile__OpenStream();

		/**
		 * The meta object literal for the '<em><b>Write To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE___WRITE_TO__OUTPUTSTREAM = eINSTANCE.getFile__WriteTo__OutputStream();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl <em>Text File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getTextFile()
		 * @generated
		 */
		EClass TEXT_FILE = eINSTANCE.getTextFile();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FILE__CHARSET = eINSTANCE.getTextFile_Charset();

		/**
		 * The meta object literal for the '<em><b>Line Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FILE__LINE_SEPARATOR = eINSTANCE.getTextFile_LineSeparator();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FILE__TEXT = eINSTANCE.getTextFile_Text();

		/**
		 * The meta object literal for the '<em><b>Line Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FILE___LINE_COUNT = eINSTANCE.getTextFile__LineCount();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FILE___VIEW__INT_INT = eINSTANCE.getTextFile__View__int_int();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FILE___REPLACE__STRING_STRING = eINSTANCE.getTextFile__Replace__String_String();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FILE___INSERT__INT_CHARSEQUENCE = eINSTANCE.getTextFile__Insert__int_CharSequence();

		/**
		 * The meta object literal for the '<em><b>Grep</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FILE___GREP__STRING = eINSTANCE.getTextFile__Grep__String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.ArchiveFileImpl <em>Archive File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.ArchiveFileImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getArchiveFile()
		 * @generated
		 */
		EClass ARCHIVE_FILE = eINSTANCE.getArchiveFile();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHIVE_FILE___OPEN = eINSTANCE.getArchiveFile__Open();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.LinkImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.impl.MatchImpl
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__PATH = eINSTANCE.getMatch_Path();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__LINE = eINSTANCE.getMatch_Line();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__TEXT = eINSTANCE.getMatch_Text();

		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.file.LineSeparator <em>Line Separator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.file.LineSeparator
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getLineSeparator()
		 * @generated
		 */
		EEnum LINE_SEPARATOR = eINSTANCE.getLineSeparator();

		/**
		 * The meta object literal for the '<em>Content</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.volume.Content
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getContent()
		 * @generated
		 */
		EDataType CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Char Sequence</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.CharSequence
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getCharSequence()
		 * @generated
		 */
		EDataType CHAR_SEQUENCE = eINSTANCE.getCharSequence();

		/**
		 * The meta object literal for the '<em>Instant</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see org.nasdanika.sdk.runtime.models.file.impl.FilePackageImpl#getInstant()
		 * @generated
		 */
		EDataType INSTANT = eINSTANCE.getInstant();

	}

} //FilePackage
