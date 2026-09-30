/**
 */
package org.nasdanika.sdk.runtime.models.core.impl;

import java.time.Duration;
import java.time.Instant;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.Content;
import org.nasdanika.sdk.runtime.models.core.CoreFactory;
import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.Documented;
import org.nasdanika.sdk.runtime.models.core.Evaluator;
import org.nasdanika.sdk.runtime.models.core.ExpressionEvaluator;
import org.nasdanika.sdk.runtime.models.core.GitMarker;
import org.nasdanika.sdk.runtime.models.core.GroovyEvaluator;
import org.nasdanika.sdk.runtime.models.core.Marked;
import org.nasdanika.sdk.runtime.models.core.Marker;
import org.nasdanika.sdk.runtime.models.core.ModelElement;
import org.nasdanika.sdk.runtime.models.core.NamedElement;
import org.nasdanika.sdk.runtime.models.core.Referrable;
import org.nasdanika.sdk.runtime.models.core.ScriptEvaluator;
import org.nasdanika.sdk.runtime.models.core.Section;
import org.nasdanika.sdk.runtime.models.core.SectionReference;
import org.nasdanika.sdk.runtime.models.core.SourceEvaluator;
import org.nasdanika.sdk.runtime.models.core.SpelEvaluator;
import org.nasdanika.sdk.runtime.models.core.StringIdentity;
import org.nasdanika.sdk.runtime.models.core.XPathEvaluator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referrableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringIdentityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spelEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPathEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groovyEvaluatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

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
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferrable() {
		return referrableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferrable__Collect__Object_EReference_EList() {
		return referrableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferrable__GetReferrers__EReference() {
		return referrableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringIdentity() {
		return stringIdentityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringIdentity_Id() {
		return (EAttribute)stringIdentityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToStringMapEntry() {
		return stringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMapEntry_Key() {
		return (EAttribute)stringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringMapEntry_Value() {
		return (EAttribute)stringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarker() {
		return markerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarker_Location() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarker_Position() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarker_Comment() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarker_Date() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarker_Feature() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarker_Digest() {
		return (EAttribute)markerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarker_Children() {
		return (EReference)markerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGitMarker() {
		return gitMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitMarker_Path() {
		return (EAttribute)gitMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGitMarker_Remotes() {
		return (EReference)gitMarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitMarker_Branch() {
		return (EAttribute)gitMarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitMarker_Head() {
		return (EAttribute)gitMarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitMarker_HeadRefs() {
		return (EAttribute)gitMarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarked() {
		return markedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarked_Markers() {
		return (EReference)markedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContent_Content() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContent_ContentRef() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContent_ContentType() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSectionReference() {
		return sectionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSectionReference_Title() {
		return (EAttribute)sectionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSectionReference_Id() {
		return (EAttribute)sectionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Children() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Contents() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumented() {
		return documentedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumented_Documentation() {
		return (EAttribute)documentedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumented_DocRef() {
		return (EAttribute)documentedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumented_DocFormat() {
		return (EAttribute)documentedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumented_DocContents() {
		return (EReference)documentedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumented_DocSections() {
		return (EReference)documentedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Icon() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Uris() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvaluator() {
		return evaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvaluator__Evaluate__Class_Map() {
		return evaluatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvaluator__Evaluate__Class() {
		return evaluatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvaluator__Evaluate__Map() {
		return evaluatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvaluator__Evaluate() {
		return evaluatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceEvaluator() {
		return sourceEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceEvaluator_Script() {
		return (EAttribute)sourceEvaluatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceEvaluator_ScriptRef() {
		return (EAttribute)sourceEvaluatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionEvaluator() {
		return expressionEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionEvaluator_Expression() {
		return (EAttribute)expressionEvaluatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpelEvaluator() {
		return spelEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpelEvaluator__Evaluate__Class_Map() {
		return spelEvaluatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXPathEvaluator() {
		return xPathEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXPathEvaluator__Evaluate__Class_Map() {
		return xPathEvaluatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptEvaluator() {
		return scriptEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptEvaluator_Language() {
		return (EAttribute)scriptEvaluatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getScriptEvaluator__Evaluate__Class_Map() {
		return scriptEvaluatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroovyEvaluator() {
		return groovyEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGroovyEvaluator__Evaluate__Class_Map() {
		return groovyEvaluatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstant() {
		return instantEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDuration() {
		return durationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getClass_() {
		return classEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		referrableEClass = createEClass(REFERRABLE);
		createEOperation(referrableEClass, REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST);
		createEOperation(referrableEClass, REFERRABLE___GET_REFERRERS__EREFERENCE);

		stringIdentityEClass = createEClass(STRING_IDENTITY);
		createEAttribute(stringIdentityEClass, STRING_IDENTITY__ID);

		stringToStringMapEntryEClass = createEClass(STRING_TO_STRING_MAP_ENTRY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__VALUE);

		markerEClass = createEClass(MARKER);
		createEAttribute(markerEClass, MARKER__LOCATION);
		createEAttribute(markerEClass, MARKER__POSITION);
		createEAttribute(markerEClass, MARKER__COMMENT);
		createEAttribute(markerEClass, MARKER__DATE);
		createEAttribute(markerEClass, MARKER__FEATURE);
		createEAttribute(markerEClass, MARKER__DIGEST);
		createEReference(markerEClass, MARKER__CHILDREN);

		gitMarkerEClass = createEClass(GIT_MARKER);
		createEAttribute(gitMarkerEClass, GIT_MARKER__PATH);
		createEReference(gitMarkerEClass, GIT_MARKER__REMOTES);
		createEAttribute(gitMarkerEClass, GIT_MARKER__BRANCH);
		createEAttribute(gitMarkerEClass, GIT_MARKER__HEAD);
		createEAttribute(gitMarkerEClass, GIT_MARKER__HEAD_REFS);

		markedEClass = createEClass(MARKED);
		createEReference(markedEClass, MARKED__MARKERS);

		contentEClass = createEClass(CONTENT);
		createEAttribute(contentEClass, CONTENT__CONTENT);
		createEAttribute(contentEClass, CONTENT__CONTENT_REF);
		createEAttribute(contentEClass, CONTENT__CONTENT_TYPE);

		sectionReferenceEClass = createEClass(SECTION_REFERENCE);
		createEAttribute(sectionReferenceEClass, SECTION_REFERENCE__TITLE);
		createEAttribute(sectionReferenceEClass, SECTION_REFERENCE__ID);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__CHILDREN);
		createEReference(sectionEClass, SECTION__CONTENTS);

		documentedEClass = createEClass(DOCUMENTED);
		createEAttribute(documentedEClass, DOCUMENTED__DOCUMENTATION);
		createEAttribute(documentedEClass, DOCUMENTED__DOC_REF);
		createEAttribute(documentedEClass, DOCUMENTED__DOC_FORMAT);
		createEReference(documentedEClass, DOCUMENTED__DOC_CONTENTS);
		createEReference(documentedEClass, DOCUMENTED__DOC_SECTIONS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ICON);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__URIS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		evaluatorEClass = createEClass(EVALUATOR);
		createEOperation(evaluatorEClass, EVALUATOR___EVALUATE__CLASS_MAP);
		createEOperation(evaluatorEClass, EVALUATOR___EVALUATE__CLASS);
		createEOperation(evaluatorEClass, EVALUATOR___EVALUATE__MAP);
		createEOperation(evaluatorEClass, EVALUATOR___EVALUATE);

		sourceEvaluatorEClass = createEClass(SOURCE_EVALUATOR);
		createEAttribute(sourceEvaluatorEClass, SOURCE_EVALUATOR__SCRIPT);
		createEAttribute(sourceEvaluatorEClass, SOURCE_EVALUATOR__SCRIPT_REF);

		expressionEvaluatorEClass = createEClass(EXPRESSION_EVALUATOR);
		createEAttribute(expressionEvaluatorEClass, EXPRESSION_EVALUATOR__EXPRESSION);

		spelEvaluatorEClass = createEClass(SPEL_EVALUATOR);
		createEOperation(spelEvaluatorEClass, SPEL_EVALUATOR___EVALUATE__CLASS_MAP);

		xPathEvaluatorEClass = createEClass(XPATH_EVALUATOR);
		createEOperation(xPathEvaluatorEClass, XPATH_EVALUATOR___EVALUATE__CLASS_MAP);

		scriptEvaluatorEClass = createEClass(SCRIPT_EVALUATOR);
		createEAttribute(scriptEvaluatorEClass, SCRIPT_EVALUATOR__LANGUAGE);
		createEOperation(scriptEvaluatorEClass, SCRIPT_EVALUATOR___EVALUATE__CLASS_MAP);

		groovyEvaluatorEClass = createEClass(GROOVY_EVALUATOR);
		createEOperation(groovyEvaluatorEClass, GROOVY_EVALUATOR___EVALUATE__CLASS_MAP);

		// Create data types
		instantEDataType = createEDataType(INSTANT);
		durationEDataType = createEDataType(DURATION);
		classEDataType = createEDataType(CLASS);
		mapEDataType = createEDataType(MAP);
		objectEDataType = createEDataType(OBJECT);
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
		addETypeParameter(classEDataType, "T");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		stringIdentityEClass.getESuperTypes().add(this.getReferrable());
		gitMarkerEClass.getESuperTypes().add(this.getMarker());
		sectionEClass.getESuperTypes().add(this.getSectionReference());
		modelElementEClass.getESuperTypes().add(this.getStringIdentity());
		modelElementEClass.getESuperTypes().add(this.getDocumented());
		modelElementEClass.getESuperTypes().add(this.getMarked());
		namedElementEClass.getESuperTypes().add(this.getModelElement());
		evaluatorEClass.getESuperTypes().add(this.getDocumented());
		evaluatorEClass.getESuperTypes().add(this.getMarked());
		sourceEvaluatorEClass.getESuperTypes().add(this.getEvaluator());
		expressionEvaluatorEClass.getESuperTypes().add(this.getEvaluator());
		spelEvaluatorEClass.getESuperTypes().add(this.getExpressionEvaluator());
		xPathEvaluatorEClass.getESuperTypes().add(this.getExpressionEvaluator());
		scriptEvaluatorEClass.getESuperTypes().add(this.getSourceEvaluator());
		groovyEvaluatorEClass.getESuperTypes().add(this.getSourceEvaluator());

		// Initialize classes, features, and operations; add parameters
		initEClass(referrableEClass, Referrable.class, "Referrable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getReferrable__Collect__Object_EReference_EList(), null, "collect", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "source", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEReference(), "eReference", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "accumulator", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReferrable__GetReferrers__EReference(), theEcorePackage.getEObject(), "getReferrers", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEReference(), "eReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(stringIdentityEClass, StringIdentity.class, "StringIdentity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringIdentity_Id(), theEcorePackage.getEString(), "id", null, 0, 1, StringIdentity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEntryEClass, Map.Entry.class, "StringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMapEntry_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMapEntry_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markerEClass, Marker.class, "Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarker_Location(), theEcorePackage.getEString(), "location", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_Position(), theEcorePackage.getEString(), "position", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_Feature(), theEcorePackage.getEString(), "feature", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarker_Digest(), theEcorePackage.getEString(), "digest", null, 0, 1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarker_Children(), this.getMarker(), null, "children", null, 0, -1, Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitMarkerEClass, GitMarker.class, "GitMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitMarker_Path(), theEcorePackage.getEString(), "path", null, 0, 1, GitMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGitMarker_Remotes(), this.getStringToStringMapEntry(), null, "remotes", null, 0, -1, GitMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitMarker_Branch(), theEcorePackage.getEString(), "branch", null, 0, 1, GitMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitMarker_Head(), theEcorePackage.getEString(), "head", null, 0, 1, GitMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitMarker_HeadRefs(), theEcorePackage.getEString(), "headRefs", null, 0, -1, GitMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markedEClass, Marked.class, "Marked", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarked_Markers(), this.getMarker(), null, "markers", null, 0, -1, Marked.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContent_Content(), theEcorePackage.getEString(), "content", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_ContentRef(), theEcorePackage.getEString(), "contentRef", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_ContentType(), theEcorePackage.getEString(), "contentType", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionReferenceEClass, SectionReference.class, "SectionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSectionReference_Title(), theEcorePackage.getEString(), "title", null, 0, 1, SectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionReference_Id(), theEcorePackage.getEString(), "id", null, 0, 1, SectionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Children(), this.getSection(), null, "children", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_Contents(), this.getContent(), null, "contents", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedEClass, Documented.class, "Documented", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumented_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, Documented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumented_DocRef(), theEcorePackage.getEString(), "docRef", null, 0, 1, Documented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumented_DocFormat(), theEcorePackage.getEString(), "docFormat", null, 0, 1, Documented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumented_DocContents(), this.getContent(), null, "docContents", null, 0, -1, Documented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumented_DocSections(), this.getSection(), null, "docSections", null, 0, -1, Documented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Uris(), theEcorePackage.getEString(), "uris", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluatorEClass, Evaluator.class, "Evaluator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEvaluator__Evaluate__Class_Map(), null, "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		EGenericType g1 = createEGenericType(this.getClass_());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bindings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getEvaluator__Evaluate__Class(), null, "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getClass_());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getEvaluator__Evaluate__Map(), this.getObject(), "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bindings", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEvaluator__Evaluate(), this.getObject(), "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sourceEvaluatorEClass, SourceEvaluator.class, "SourceEvaluator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceEvaluator_Script(), theEcorePackage.getEString(), "script", null, 0, 1, SourceEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceEvaluator_ScriptRef(), theEcorePackage.getEString(), "scriptRef", null, 0, 1, SourceEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEvaluatorEClass, ExpressionEvaluator.class, "ExpressionEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionEvaluator_Expression(), theEcorePackage.getEString(), "expression", null, 0, 1, ExpressionEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spelEvaluatorEClass, SpelEvaluator.class, "SpelEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSpelEvaluator__Evaluate__Class_Map(), null, "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getClass_());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bindings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(xPathEvaluatorEClass, XPathEvaluator.class, "XPathEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getXPathEvaluator__Evaluate__Class_Map(), null, "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getClass_());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bindings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(scriptEvaluatorEClass, ScriptEvaluator.class, "ScriptEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptEvaluator_Language(), theEcorePackage.getEString(), "language", null, 0, 1, ScriptEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getScriptEvaluator__Evaluate__Class_Map(), null, "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getClass_());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bindings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(groovyEvaluatorEClass, GroovyEvaluator.class, "GroovyEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGroovyEvaluator__Evaluate__Class_Map(), null, "evaluate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getClass_());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "bindings", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(instantEDataType, Instant.class, "Instant", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(durationEDataType, Duration.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classEDataType, Class.class, "Class", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
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
			   "modelDirectory", "/org.nasdanika.sdk.runtime.models.core/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models"
		   });
		addAnnotation
		  (getReferrable__Collect__Object_EReference_EList(),
		   source,
		   new String[] {
			   "body", "boolean _isInstance = eReference.getEContainingClass().isInstance(source);\nif (_isInstance)\n{\n\tfinal <%java.lang.Object%> value = ((<%org.eclipse.emf.ecore.EObject%>) source).eGet(eReference);\n\tboolean _isMany = eReference.isMany();\n\tif (_isMany)\n\t{\n\t\tboolean _contains = ((<%java.util.Collection%><?>) value).contains(this);\n\t\tif (_contains)\n\t\t{\n\t\t\taccumulator.add(((<%org.eclipse.emf.ecore.EObject%>) source));\n\t\t}\n\t}\n\telse\n\t{\n\t\tif ((value == this))\n\t\t{\n\t\t\taccumulator.add(((<%org.eclipse.emf.ecore.EObject%>) source));\n\t\t}\n\t}\n}"
		   });
		addAnnotation
		  (getReferrable__GetReferrers__EReference(),
		   source,
		   new String[] {
			   "body", "final <%org.eclipse.emf.common.util.BasicEList%><<%org.eclipse.emf.ecore.EObject%>> ret = new <%org.eclipse.emf.common.util.BasicEList%><<%org.eclipse.emf.ecore.EObject%>>();\nfinal <%org.eclipse.emf.ecore.resource.Resource%> res = this.eResource();\n<%org.eclipse.emf.common.util.TreeIterator%><?> cit = null;\nif ((res == null))\n{\n\t<%org.eclipse.emf.ecore.EObject%> root = this;\n\t<%org.eclipse.emf.ecore.EObject%> rc = null;\n\twhile (((rc = root.eContainer()) != null))\n\t{\n\t\troot = rc;\n\t}\n\tif ((root != null))\n\t{\n\t\tthis.collect(root, eReference, ret);\n\t\tcit = root.eAllContents();\n\t}\n}\nelse\n{\n\tfinal <%org.eclipse.emf.ecore.resource.ResourceSet%> rSet = res.getResourceSet();\n\t<%org.eclipse.emf.common.util.TreeIterator%><? extends <%org.eclipse.emf.common.notify.Notifier%>> _xifexpression = null;\n\tif ((rSet == null))\n\t{\n\t\t_xifexpression = res.getAllContents();\n\t}\n\telse\n\t{\n\t\t_xifexpression = rSet.getAllContents();\n\t}\n\tcit = _xifexpression;\n}\nif ((cit != null))\n{\n\twhile (cit.hasNext())\n\t{\n\t\tthis.collect(cit.next(), eReference, ret);\n\t}\n}\nreturn ret;"
		   });
		addAnnotation
		  (getMarker_Feature(),
		   source,
		   new String[] {
			   "documentation", "*\nFeature name for feature markers"
		   });
		addAnnotation
		  (getMarker_Digest(),
		   source,
		   new String[] {
			   "documentation", "*\nOptional source hash/digest.\nE.g. SHA for a text file or Merkle tree hash for models - may exclude some features and may be also computed on graphs including non-containment references, not only on trees"
		   });
		addAnnotation
		  (getMarker_Children(),
		   source,
		   new String[] {
			   "documentation", "*\nChild markers. For example, a feature can be computed from two features with their own markers. In this case those markers may be recorded as\nchildren of a parent marker."
		   });
		addAnnotation
		  (getGitMarker_Path(),
		   source,
		   new String[] {
			   "documentation", "*\nPath in the repository"
		   });
		addAnnotation
		  (getGitMarker_Remotes(),
		   source,
		   new String[] {
			   "documentation", "*\nA map of remote names to URLs"
		   });
		addAnnotation
		  (getGitMarker_Branch(),
		   source,
		   new String[] {
			   "documentation", "*\nShort branch name"
		   });
		addAnnotation
		  (getGitMarker_Head(),
		   source,
		   new String[] {
			   "documentation", "*\nCommit ID of the head"
		   });
		addAnnotation
		  (getGitMarker_HeadRefs(),
		   source,
		   new String[] {
			   "documentation", "*\nRefs on the head commit excluding the head itself. E.g. branch, tags."
		   });
		addAnnotation
		  (contentEClass,
		   source,
		   new String[] {
			   "documentation", "*\nSection/documentation content"
		   });
		addAnnotation
		  (getDocumented_Documentation(),
		   source,
		   new String[] {
			   "documentation", "*\nInline documentation"
		   });
		addAnnotation
		  (getDocumented_DocRef(),
		   source,
		   new String[] {
			   "documentation", "*\nDocumentation resource URI resolved relative to this model element resource URI.\nDocumentation format is derived from extension if not set."
		   });
		addAnnotation
		  (getDocumented_DocFormat(),
		   source,
		   new String[] {
			   "documentation", "*\nDocumentation format. If not set, defaults to markdown for inline documentation and is\nderived from the documentation resource extension for docRef"
		   });
		addAnnotation
		  (getDocumented_DocContents(),
		   source,
		   new String[] {
			   "documentation", "*\nDocumentation contents - follows after the own documentation/docRef"
		   });
		addAnnotation
		  (getDocumented_DocSections(),
		   source,
		   new String[] {
			   "documentation", "*\nDocumentation sections, follow after docContents"
		   });
		addAnnotation
		  (getModelElement_Icon(),
		   source,
		   new String[] {
			   "documentation", "*\nCustom icon - treated as URL if contains / or as a CSS class otherwise.\nE.g. fas fa-wrench would be treated as a CSS class.\nFor URLs the recommended icon size is 20x20 pixels and the recommended format is SVG."
		   });
		addAnnotation
		  (getModelElement_Uris(),
		   source,
		   new String[] {
			   "documentation", "*\nAlias URIs resolved relative to the parent URIs - can be absolute or opaque - global references.\nFor example: actors://john-smith.\nFor domains URIs can be used as anchors to merge domains from different sources.\nFor example, several teams may maintain capability domains with URI myorg://capabilities/developer-productivity\nWhen these definitions are assembled into the organization\'s product management model to generate documentation\nall of these domains are merged into a single logical domain."
		   });
		addAnnotation
		  (getEvaluator__Evaluate__Class_Map(),
		   source,
		   new String[] {
			   "documentation", "Evaluates this evaluator\'s expression/script against the provided\nbindings and coerces the result to resultType.\nAnalogous to javax.script.CompiledScript.eval(), but the source\ncomes from the evaluator instance itself."
		   });
		addAnnotation
		  (getEvaluator__Evaluate__Class(),
		   source,
		   new String[] {
			   "body", "return this.<T>evaluate(resultType, null);"
		   });
		addAnnotation
		  (getEvaluator__Evaluate__Map(),
		   source,
		   new String[] {
			   "body", "return this.<<%java.lang.Object%>>evaluate(null, bindings);"
		   });
		addAnnotation
		  (getEvaluator__Evaluate(),
		   source,
		   new String[] {
			   "body", "return this.<<%java.lang.Object%>>evaluate(null, null);"
		   });
		addAnnotation
		  (sourceEvaluatorEClass,
		   source,
		   new String[] {
			   "documentation", " Carries script source, inline or by reference. Exactly one of\nscript and scriptRef must be set."
		   });
		addAnnotation
		  (getSourceEvaluator_ScriptRef(),
		   source,
		   new String[] {
			   "documentation", " URI resolved against eResource().getURI()."
		   });
		addAnnotation
		  (getSpelEvaluator__Evaluate__Class_Map(),
		   source,
		   new String[] {
			   "body", "return org.nasdanika.sdk.runtime.models.core.util.EvaluatorSupport.evaluateSpel(this, resultType, bindings);"
		   });
		addAnnotation
		  (getXPathEvaluator__Evaluate__Class_Map(),
		   source,
		   new String[] {
			   "body", "return org.nasdanika.sdk.runtime.models.core.util.EvaluatorSupport.evaluateXPath(this, resultType, bindings);"
		   });
		addAnnotation
		  (getScriptEvaluator__Evaluate__Class_Map(),
		   source,
		   new String[] {
			   "body", "return org.nasdanika.sdk.runtime.models.core.util.EvaluatorSupport.evaluateScript(this, resultType, bindings);"
		   });
		addAnnotation
		  (getScriptEvaluator_Language(),
		   source,
		   new String[] {
			   "documentation", " JSR-223 engine short name. Required for script; for scriptRef\nfalls back to selection by URI extension."
		   });
		addAnnotation
		  (getGroovyEvaluator__Evaluate__Class_Map(),
		   source,
		   new String[] {
			   "body", "return org.nasdanika.sdk.runtime.models.core.util.EvaluatorSupport.evaluateGroovy(this, resultType, bindings);"
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
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //CorePackageImpl
