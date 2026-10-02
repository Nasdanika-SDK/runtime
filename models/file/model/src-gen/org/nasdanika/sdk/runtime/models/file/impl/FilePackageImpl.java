/**
 */
package org.nasdanika.sdk.runtime.models.file.impl;

import java.io.InputStream;
import java.io.OutputStream;

import java.time.Instant;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.file.ArchiveFile;
import org.nasdanika.sdk.runtime.models.file.Directory;
import org.nasdanika.sdk.runtime.models.file.Entry;
import org.nasdanika.sdk.runtime.models.file.File;
import org.nasdanika.sdk.runtime.models.file.FileFactory;
import org.nasdanika.sdk.runtime.models.file.FilePackage;
import org.nasdanika.sdk.runtime.models.file.LineSeparator;
import org.nasdanika.sdk.runtime.models.file.Link;
import org.nasdanika.sdk.runtime.models.file.Match;
import org.nasdanika.sdk.runtime.models.file.TextFile;

import org.nasdanika.sdk.runtime.volume.Content;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilePackageImpl extends EPackageImpl implements FilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archiveFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineSeparatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charSequenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantEDataType = null;

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
	 * @see org.nasdanika.sdk.runtime.models.file.FilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FilePackageImpl() {
		super(eNS_URI, FileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FilePackage init() {
		if (isInited) return (FilePackage)EPackage.Registry.INSTANCE.getEPackage(FilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FilePackageImpl theFilePackage = registeredFilePackage instanceof FilePackageImpl ? (FilePackageImpl)registeredFilePackage : new FilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFilePackage.createPackageContents();

		// Initialize created meta-data
		theFilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FilePackage.eNS_URI, theFilePackage);
		return theFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Name() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Path() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Hash() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Modified() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Live() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntry__Snapshot() {
		return entryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntry__Delete() {
		return entryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntry__MoveTo__Directory_String() {
		return entryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectory_Children() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectory__List__String_int_int() {
		return directoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectory__Find__String() {
		return directoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectory__Glob__String() {
		return directoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectory__Grep__String_String() {
		return directoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectory__CreateFile__String_Content() {
		return directoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDirectory__CreateDirectory__String() {
		return directoryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Content() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_ContentType() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Size() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile__OpenStream() {
		return fileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile__WriteTo__OutputStream() {
		return fileEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextFile() {
		return textFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextFile_Charset() {
		return (EAttribute)textFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextFile_LineSeparator() {
		return (EAttribute)textFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextFile_Text() {
		return (EAttribute)textFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextFile__LineCount() {
		return textFileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextFile__View__int_int() {
		return textFileEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextFile__Replace__String_String() {
		return textFileEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextFile__Insert__int_CharSequence() {
		return textFileEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextFile__Grep__String() {
		return textFileEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchiveFile() {
		return archiveFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArchiveFile__Open() {
		return archiveFileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Target() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Path() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Line() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Text() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineSeparator() {
		return lineSeparatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContent() {
		return contentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputStream() {
		return outputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharSequence() {
		return charSequenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstant() {
		return instantEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileFactory getFileFactory() {
		return (FileFactory)getEFactoryInstance();
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
		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__NAME);
		createEAttribute(entryEClass, ENTRY__PATH);
		createEAttribute(entryEClass, ENTRY__HASH);
		createEAttribute(entryEClass, ENTRY__MODIFIED);
		createEAttribute(entryEClass, ENTRY__LIVE);
		createEOperation(entryEClass, ENTRY___SNAPSHOT);
		createEOperation(entryEClass, ENTRY___DELETE);
		createEOperation(entryEClass, ENTRY___MOVE_TO__DIRECTORY_STRING);

		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__CHILDREN);
		createEOperation(directoryEClass, DIRECTORY___LIST__STRING_INT_INT);
		createEOperation(directoryEClass, DIRECTORY___FIND__STRING);
		createEOperation(directoryEClass, DIRECTORY___GLOB__STRING);
		createEOperation(directoryEClass, DIRECTORY___GREP__STRING_STRING);
		createEOperation(directoryEClass, DIRECTORY___CREATE_FILE__STRING_CONTENT);
		createEOperation(directoryEClass, DIRECTORY___CREATE_DIRECTORY__STRING);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__CONTENT);
		createEAttribute(fileEClass, FILE__CONTENT_TYPE);
		createEAttribute(fileEClass, FILE__SIZE);
		createEOperation(fileEClass, FILE___OPEN_STREAM);
		createEOperation(fileEClass, FILE___WRITE_TO__OUTPUTSTREAM);

		textFileEClass = createEClass(TEXT_FILE);
		createEAttribute(textFileEClass, TEXT_FILE__CHARSET);
		createEAttribute(textFileEClass, TEXT_FILE__LINE_SEPARATOR);
		createEAttribute(textFileEClass, TEXT_FILE__TEXT);
		createEOperation(textFileEClass, TEXT_FILE___LINE_COUNT);
		createEOperation(textFileEClass, TEXT_FILE___VIEW__INT_INT);
		createEOperation(textFileEClass, TEXT_FILE___REPLACE__STRING_STRING);
		createEOperation(textFileEClass, TEXT_FILE___INSERT__INT_CHARSEQUENCE);
		createEOperation(textFileEClass, TEXT_FILE___GREP__STRING);

		archiveFileEClass = createEClass(ARCHIVE_FILE);
		createEOperation(archiveFileEClass, ARCHIVE_FILE___OPEN);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__TARGET);

		matchEClass = createEClass(MATCH);
		createEAttribute(matchEClass, MATCH__PATH);
		createEAttribute(matchEClass, MATCH__LINE);
		createEAttribute(matchEClass, MATCH__TEXT);

		// Create enums
		lineSeparatorEEnum = createEEnum(LINE_SEPARATOR);

		// Create data types
		contentEDataType = createEDataType(CONTENT);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		outputStreamEDataType = createEDataType(OUTPUT_STREAM);
		charSequenceEDataType = createEDataType(CHAR_SEQUENCE);
		instantEDataType = createEDataType(INSTANT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		directoryEClass.getESuperTypes().add(this.getEntry());
		fileEClass.getESuperTypes().add(this.getEntry());
		textFileEClass.getESuperTypes().add(this.getFile());
		archiveFileEClass.getESuperTypes().add(this.getFile());
		linkEClass.getESuperTypes().add(this.getEntry());

		// Initialize classes, features, and operations; add parameters
		initEClass(entryEClass, Entry.class, "Entry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Path(), theEcorePackage.getEString(), "path", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Hash(), theEcorePackage.getEString(), "hash", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Modified(), this.getInstant(), "modified", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Live(), theEcorePackage.getEBoolean(), "live", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getEntry__Snapshot(), this.getEntry(), "snapshot", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntry__Delete(), null, "delete", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getEntry__MoveTo__Directory_String(), null, "moveTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDirectory(), "target", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectory_Children(), this.getEntry(), null, "children", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDirectory__List__String_int_int(), this.getEntry(), "list", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "glob", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "offset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "limit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectory__Find__String(), this.getEntry(), "find", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectory__Glob__String(), this.getEntry(), "glob", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "pattern", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectory__Grep__String_String(), this.getMatch(), "grep", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "regex", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "glob", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectory__CreateFile__String_Content(), this.getFile(), "createFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContent(), "content", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDirectory__CreateDirectory__String(), this.getDirectory(), "createDirectory", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Content(), this.getContent(), "content", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_ContentType(), theEcorePackage.getEString(), "contentType", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Size(), theEcorePackage.getELong(), "size", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getFile__OpenStream(), this.getInputStream(), "openStream", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFile__WriteTo__OutputStream(), null, "writeTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "out", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(textFileEClass, TextFile.class, "TextFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextFile_Charset(), theEcorePackage.getEString(), "charset", "UTF-8", 0, 1, TextFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextFile_LineSeparator(), this.getLineSeparator(), "lineSeparator", null, 0, 1, TextFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextFile_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TextFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTextFile__LineCount(), theEcorePackage.getEInt(), "lineCount", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextFile__View__int_int(), theEcorePackage.getEString(), "view", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "startLine", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "endLine", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextFile__Replace__String_String(), null, "replace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "oldText", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newText", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextFile__Insert__int_CharSequence(), null, "insert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "afterLine", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharSequence(), "text", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextFile__Grep__String(), this.getMatch(), "grep", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "regex", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(archiveFileEClass, ArchiveFile.class, "ArchiveFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getArchiveFile__Open(), this.getDirectory(), "open", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatch_Path(), theEcorePackage.getEString(), "path", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Line(), theEcorePackage.getEInt(), "line", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatch_Text(), theEcorePackage.getEString(), "text", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lineSeparatorEEnum, LineSeparator.class, "LineSeparator");
		addEEnumLiteral(lineSeparatorEEnum, LineSeparator.LF);
		addEEnumLiteral(lineSeparatorEEnum, LineSeparator.CRLF);
		addEEnumLiteral(lineSeparatorEEnum, LineSeparator.CR);

		// Initialize data types
		initEDataType(contentEDataType, Content.class, "Content", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charSequenceEDataType, CharSequence.class, "CharSequence", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(instantEDataType, Instant.class, "Instant", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// https://runtime.sdk.nasdanika.org/models/file/delegate
		createDelegateAnnotations();
		// https://runtime.sdk.nasdanika.org/models/inference/tool-binding
		createToolbindingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "https://runtime.sdk.nasdanika.org/models/file/delegate",
			   "settingDelegates", "https://runtime.sdk.nasdanika.org/models/file/delegate"
		   });
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
			   "modelDirectory", "/org.nasdanika.sdk.runtime.models.file.model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models"
		   });
		addAnnotation
		  (contentEDataType,
		   source,
		   new String[] {
			   "documentation", "The state of a file. Snapshot serialization converts it to and from a string: base64 for small\ncontent, a reference to a stored blob for large content (an open decision)."
		   });
		addAnnotation
		  (entryEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA file, a directory or a link. Its parent is its container."
		   });
		addAnnotation
		  (getEntry__Snapshot(),
		   source,
		   new String[] {
			   "documentation", "* A detached copy of this entry and everything under it, with content materialized."
		   });
		addAnnotation
		  (getEntry_Path(),
		   source,
		   new String[] {
			   "documentation", "* Relative to the volume root, slash-separated, computed from the containment chain."
		   });
		addAnnotation
		  (getEntry_Hash(),
		   source,
		   new String[] {
			   "documentation", "* A content hash or a Git blob id, from the backend\'s stat. Null when unknown."
		   });
		addAnnotation
		  (getEntry_Live(),
		   source,
		   new String[] {
			   "documentation", "* True when bound to a volume, false for a snapshot."
		   });
		addAnnotation
		  (getDirectory__List__String_int_int(),
		   source,
		   new String[] {
			   "documentation", "*\nA page of children matching a glob, without materializing the rest: for very large\ndirectories, where reading children would load everything."
		   });
		addAnnotation
		  (getDirectory__Find__String(),
		   source,
		   new String[] {
			   "documentation", "* Resolves a relative path below this directory. Null when nothing is there."
		   });
		addAnnotation
		  (getDirectory_Children(),
		   source,
		   new String[] {
			   "documentation", "* Lazy: filled from the backend on first access, invalidated by change reports."
		   });
		addAnnotation
		  (getFile__WriteTo__OutputStream(),
		   source,
		   new String[] {
			   "documentation", "* Pushes the bytes into a stream the caller owns. Preferred over openStream."
		   });
		addAnnotation
		  (getFile_Content(),
		   source,
		   new String[] {
			   "documentation", "*\nThe one state. Getting it does no I/O; assigning it records content for the unit of work,\nand bytes move when something reads it."
		   });
		addAnnotation
		  (getFile_ContentType(),
		   source,
		   new String[] {
			   "documentation", "* The EMF content type identifier this file was classified as."
		   });
		addAnnotation
		  (getTextFile__View__int_int(),
		   source,
		   new String[] {
			   "documentation", "* Lines startLine to endLine, one-based and inclusive; endLine -1 means to the end."
		   });
		addAnnotation
		  (getTextFile__Replace__String_String(),
		   source,
		   new String[] {
			   "documentation", "*\nReplaces exactly one occurrence. Fails on zero or several. Preserves the charset and the\nline separator, so an edit is a small diff."
		   });
		addAnnotation
		  (getTextFile__Insert__int_CharSequence(),
		   source,
		   new String[] {
			   "documentation", "* Inserts after a line; 0 inserts at the beginning."
		   });
		addAnnotation
		  (getTextFile_Text(),
		   source,
		   new String[] {
			   "documentation", "*\nThe text view. Get decodes the content with the charset; set assigns content that encodes\nwhen read. For large files, use the line operations."
		   });
		addAnnotation
		  (archiveFileEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA zip or jar file. Opening it presents its entries as a directory over a zip volume. A zip\nloaded through its resource factory is a snapshot Directory instead."
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA link. In the model volume, non-containment references are links."
		   });
		addAnnotation
		  (matchEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA search result line."
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
			   "Nasdanika", "urn:org.nasdanika",
			   "Delegate", "https://runtime.sdk.nasdanika.org/models/file/delegate",
			   "ToolBinding", "https://runtime.sdk.nasdanika.org/models/inference/tool-binding"
		   });
	}

	/**
	 * Initializes the annotations for <b>https://runtime.sdk.nasdanika.org/models/file/delegate</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDelegateAnnotations() {
		String source = "https://runtime.sdk.nasdanika.org/models/file/delegate";
		addAnnotation
		  (getEntry__Snapshot(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntry__Delete(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntry__MoveTo__Directory_String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntry_Path(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntry_Hash(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntry_Modified(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEntry_Live(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectory__List__String_int_int(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectory__Find__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectory__Glob__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectory__Grep__String_String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectory__CreateFile__String_Content(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectory__CreateDirectory__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFile__OpenStream(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFile__WriteTo__OutputStream(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFile_Size(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextFile__LineCount(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextFile__View__int_int(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextFile__Replace__String_String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextFile__Insert__int_CharSequence(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextFile__Grep__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextFile_Text(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getArchiveFile__Open(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>https://runtime.sdk.nasdanika.org/models/inference/tool-binding</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createToolbindingAnnotations() {
		String source = "https://runtime.sdk.nasdanika.org/models/inference/tool-binding";
		addAnnotation
		  (getDirectory__CreateFile__String_Content(),
		   source,
		   new String[] {
			   "provider", "anthropic",
			   "type", "text_editor_20250728",
			   "command", "create"
		   });
		addAnnotation
		  (getTextFile__View__int_int(),
		   source,
		   new String[] {
			   "provider", "anthropic",
			   "type", "text_editor_20250728",
			   "command", "view"
		   });
		addAnnotation
		  (getTextFile__Replace__String_String(),
		   source,
		   new String[] {
			   "provider", "anthropic",
			   "type", "text_editor_20250728",
			   "command", "str_replace"
		   });
		addAnnotation
		  (getTextFile__Insert__int_CharSequence(),
		   source,
		   new String[] {
			   "provider", "anthropic",
			   "type", "text_editor_20250728",
			   "command", "insert"
		   });
	}

} //FilePackageImpl
