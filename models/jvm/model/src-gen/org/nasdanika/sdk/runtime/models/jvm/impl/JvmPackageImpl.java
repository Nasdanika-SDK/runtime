/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.jvm.AccessLevel;
import org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier;
import org.nasdanika.sdk.runtime.models.jvm.Exports;
import org.nasdanika.sdk.runtime.models.jvm.Field;
import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;
import org.nasdanika.sdk.runtime.models.jvm.JvmElement;
import org.nasdanika.sdk.runtime.models.jvm.JvmFactory;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Layer;
import org.nasdanika.sdk.runtime.models.jvm.Member;
import org.nasdanika.sdk.runtime.models.jvm.Method;
import org.nasdanika.sdk.runtime.models.jvm.ModuleModifier;
import org.nasdanika.sdk.runtime.models.jvm.Opens;
import org.nasdanika.sdk.runtime.models.jvm.Parameter;
import org.nasdanika.sdk.runtime.models.jvm.Provides;
import org.nasdanika.sdk.runtime.models.jvm.Requires;
import org.nasdanika.sdk.runtime.models.jvm.RequiresModifier;
import org.nasdanika.sdk.runtime.models.jvm.Type;
import org.nasdanika.sdk.runtime.models.jvm.TypeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JvmPackageImpl extends EPackageImpl implements JvmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jvmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaVirtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opensEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

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
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requiresModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directiveModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessLevelEEnum = null;

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
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JvmPackageImpl() {
		super(eNS_URI, JvmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JvmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JvmPackage init() {
		if (isInited) return (JvmPackage)EPackage.Registry.INSTANCE.getEPackage(JvmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJvmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JvmPackageImpl theJvmPackage = registeredJvmPackage instanceof JvmPackageImpl ? (JvmPackageImpl)registeredJvmPackage : new JvmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJvmPackage.createPackageContents();

		// Initialize created meta-data
		theJvmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJvmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JvmPackage.eNS_URI, theJvmPackage);
		return theJvmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJvmElement() {
		return jvmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaVirtualMachine() {
		return javaVirtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaVirtualMachine_Live() {
		return (EAttribute)javaVirtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaVirtualMachine_VmName() {
		return (EAttribute)javaVirtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaVirtualMachine_VmVersion() {
		return (EAttribute)javaVirtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaVirtualMachine_VmVendor() {
		return (EAttribute)javaVirtualMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaVirtualMachine_SpecificationVersion() {
		return (EAttribute)javaVirtualMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaVirtualMachine_Modules() {
		return (EReference)javaVirtualMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaVirtualMachine_Layers() {
		return (EReference)javaVirtualMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaVirtualMachine_ClassLoaders() {
		return (EReference)javaVirtualMachineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayer_Boot() {
		return (EAttribute)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_Parents() {
		return (EReference)layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_Modules() {
		return (EReference)layerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassLoader() {
		return classLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassLoader_LoaderTypeName() {
		return (EAttribute)classLoaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassLoader_Parent() {
		return (EReference)classLoaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassLoader_UnnamedModule() {
		return (EReference)classLoaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Named() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Version() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Modifiers() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_MainClassName() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Packages() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Requires() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Exports() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Opens() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Provides() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Uses() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Reads() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Layer() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ClassLoader() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequires() {
		return requiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequires_Modifiers() {
		return (EAttribute)requiresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequires_CompiledVersion() {
		return (EAttribute)requiresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_Module() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExports() {
		return exportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExports_Modifiers() {
		return (EAttribute)exportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExports_TargetNames() {
		return (EAttribute)exportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExports_Package() {
		return (EReference)exportsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExports_Targets() {
		return (EReference)exportsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpens() {
		return opensEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpens_Modifiers() {
		return (EAttribute)opensEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpens_TargetNames() {
		return (EAttribute)opensEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpens_Package() {
		return (EReference)opensEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpens_Targets() {
		return (EReference)opensEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvides() {
		return providesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvides_ServiceName() {
		return (EAttribute)providesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvides_ProviderNames() {
		return (EAttribute)providesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvides_Service() {
		return (EReference)providesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvides_Providers() {
		return (EReference)providesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Types() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Kind() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Access() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_BinaryName() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Descriptor() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Abstract() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Final() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Synthetic() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Sealed() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_ClassFileVersion() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Methods() {
		return (EReference)typeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Fields() {
		return (EReference)typeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_SuperType() {
		return (EReference)typeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Interfaces() {
		return (EReference)typeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_ComponentType() {
		return (EReference)typeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Module() {
		return (EReference)typeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Access() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Static() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Final() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Synthetic() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Descriptor() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Abstract() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Synchronized() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Native() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Bridge() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Varargs() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Default() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ReturnDescriptor() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Parameters() {
		return (EReference)methodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_ReturnType() {
		return (EReference)methodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ThrownTypeNames() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_ThrownTypes() {
		return (EReference)methodEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getField_Transient() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Volatile() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_EnumConstant() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Index() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Descriptor() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Final() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Synthetic() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Mandated() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleModifier() {
		return moduleModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequiresModifier() {
		return requiresModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectiveModifier() {
		return directiveModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeKind() {
		return typeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessLevel() {
		return accessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmFactory getJvmFactory() {
		return (JvmFactory)getEFactoryInstance();
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
		jvmElementEClass = createEClass(JVM_ELEMENT);

		javaVirtualMachineEClass = createEClass(JAVA_VIRTUAL_MACHINE);
		createEAttribute(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__LIVE);
		createEAttribute(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__VM_NAME);
		createEAttribute(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__VM_VERSION);
		createEAttribute(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__VM_VENDOR);
		createEAttribute(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__SPECIFICATION_VERSION);
		createEReference(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__MODULES);
		createEReference(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__LAYERS);
		createEReference(javaVirtualMachineEClass, JAVA_VIRTUAL_MACHINE__CLASS_LOADERS);

		layerEClass = createEClass(LAYER);
		createEAttribute(layerEClass, LAYER__BOOT);
		createEReference(layerEClass, LAYER__PARENTS);
		createEReference(layerEClass, LAYER__MODULES);

		classLoaderEClass = createEClass(CLASS_LOADER);
		createEAttribute(classLoaderEClass, CLASS_LOADER__LOADER_TYPE_NAME);
		createEReference(classLoaderEClass, CLASS_LOADER__PARENT);
		createEReference(classLoaderEClass, CLASS_LOADER__UNNAMED_MODULE);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__NAMED);
		createEAttribute(moduleEClass, MODULE__VERSION);
		createEAttribute(moduleEClass, MODULE__MODIFIERS);
		createEAttribute(moduleEClass, MODULE__MAIN_CLASS_NAME);
		createEReference(moduleEClass, MODULE__PACKAGES);
		createEReference(moduleEClass, MODULE__REQUIRES);
		createEReference(moduleEClass, MODULE__EXPORTS);
		createEReference(moduleEClass, MODULE__OPENS);
		createEReference(moduleEClass, MODULE__PROVIDES);
		createEAttribute(moduleEClass, MODULE__USES);
		createEReference(moduleEClass, MODULE__READS);
		createEReference(moduleEClass, MODULE__LAYER);
		createEReference(moduleEClass, MODULE__CLASS_LOADER);

		requiresEClass = createEClass(REQUIRES);
		createEAttribute(requiresEClass, REQUIRES__MODIFIERS);
		createEAttribute(requiresEClass, REQUIRES__COMPILED_VERSION);
		createEReference(requiresEClass, REQUIRES__MODULE);

		exportsEClass = createEClass(EXPORTS);
		createEAttribute(exportsEClass, EXPORTS__MODIFIERS);
		createEAttribute(exportsEClass, EXPORTS__TARGET_NAMES);
		createEReference(exportsEClass, EXPORTS__PACKAGE);
		createEReference(exportsEClass, EXPORTS__TARGETS);

		opensEClass = createEClass(OPENS);
		createEAttribute(opensEClass, OPENS__MODIFIERS);
		createEAttribute(opensEClass, OPENS__TARGET_NAMES);
		createEReference(opensEClass, OPENS__PACKAGE);
		createEReference(opensEClass, OPENS__TARGETS);

		providesEClass = createEClass(PROVIDES);
		createEAttribute(providesEClass, PROVIDES__SERVICE_NAME);
		createEAttribute(providesEClass, PROVIDES__PROVIDER_NAMES);
		createEReference(providesEClass, PROVIDES__SERVICE);
		createEReference(providesEClass, PROVIDES__PROVIDERS);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__TYPES);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__KIND);
		createEAttribute(typeEClass, TYPE__ACCESS);
		createEAttribute(typeEClass, TYPE__BINARY_NAME);
		createEAttribute(typeEClass, TYPE__DESCRIPTOR);
		createEAttribute(typeEClass, TYPE__ABSTRACT);
		createEAttribute(typeEClass, TYPE__FINAL);
		createEAttribute(typeEClass, TYPE__SYNTHETIC);
		createEAttribute(typeEClass, TYPE__SEALED);
		createEAttribute(typeEClass, TYPE__CLASS_FILE_VERSION);
		createEReference(typeEClass, TYPE__METHODS);
		createEReference(typeEClass, TYPE__FIELDS);
		createEReference(typeEClass, TYPE__SUPER_TYPE);
		createEReference(typeEClass, TYPE__INTERFACES);
		createEReference(typeEClass, TYPE__COMPONENT_TYPE);
		createEReference(typeEClass, TYPE__MODULE);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__ACCESS);
		createEAttribute(memberEClass, MEMBER__STATIC);
		createEAttribute(memberEClass, MEMBER__FINAL);
		createEAttribute(memberEClass, MEMBER__SYNTHETIC);
		createEAttribute(memberEClass, MEMBER__DESCRIPTOR);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__ABSTRACT);
		createEAttribute(methodEClass, METHOD__SYNCHRONIZED);
		createEAttribute(methodEClass, METHOD__NATIVE);
		createEAttribute(methodEClass, METHOD__BRIDGE);
		createEAttribute(methodEClass, METHOD__VARARGS);
		createEAttribute(methodEClass, METHOD__DEFAULT);
		createEAttribute(methodEClass, METHOD__RETURN_DESCRIPTOR);
		createEReference(methodEClass, METHOD__PARAMETERS);
		createEReference(methodEClass, METHOD__RETURN_TYPE);
		createEAttribute(methodEClass, METHOD__THROWN_TYPE_NAMES);
		createEReference(methodEClass, METHOD__THROWN_TYPES);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__TRANSIENT);
		createEAttribute(fieldEClass, FIELD__VOLATILE);
		createEAttribute(fieldEClass, FIELD__ENUM_CONSTANT);
		createEReference(fieldEClass, FIELD__TYPE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__INDEX);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTOR);
		createEAttribute(parameterEClass, PARAMETER__FINAL);
		createEAttribute(parameterEClass, PARAMETER__SYNTHETIC);
		createEAttribute(parameterEClass, PARAMETER__MANDATED);
		createEReference(parameterEClass, PARAMETER__TYPE);

		// Create enums
		moduleModifierEEnum = createEEnum(MODULE_MODIFIER);
		requiresModifierEEnum = createEEnum(REQUIRES_MODIFIER);
		directiveModifierEEnum = createEEnum(DIRECTIVE_MODIFIER);
		typeKindEEnum = createEEnum(TYPE_KIND);
		accessLevelEEnum = createEEnum(ACCESS_LEVEL);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jvmElementEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		javaVirtualMachineEClass.getESuperTypes().add(theCorePackage.getModelElement());
		layerEClass.getESuperTypes().add(this.getJvmElement());
		classLoaderEClass.getESuperTypes().add(this.getJvmElement());
		moduleEClass.getESuperTypes().add(this.getJvmElement());
		requiresEClass.getESuperTypes().add(this.getJvmElement());
		exportsEClass.getESuperTypes().add(this.getJvmElement());
		opensEClass.getESuperTypes().add(this.getJvmElement());
		providesEClass.getESuperTypes().add(this.getJvmElement());
		packageEClass.getESuperTypes().add(this.getJvmElement());
		typeEClass.getESuperTypes().add(this.getJvmElement());
		memberEClass.getESuperTypes().add(this.getJvmElement());
		methodEClass.getESuperTypes().add(this.getMember());
		fieldEClass.getESuperTypes().add(this.getMember());
		parameterEClass.getESuperTypes().add(this.getJvmElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(jvmElementEClass, JvmElement.class, "JvmElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaVirtualMachineEClass, JavaVirtualMachine.class, "JavaVirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaVirtualMachine_Live(), theEcorePackage.getEBoolean(), "live", null, 0, 1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaVirtualMachine_VmName(), theEcorePackage.getEString(), "vmName", null, 0, 1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaVirtualMachine_VmVersion(), theEcorePackage.getEString(), "vmVersion", null, 0, 1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaVirtualMachine_VmVendor(), theEcorePackage.getEString(), "vmVendor", null, 0, 1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaVirtualMachine_SpecificationVersion(), theEcorePackage.getEString(), "specificationVersion", null, 0, 1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaVirtualMachine_Modules(), this.getModule(), null, "modules", null, 0, -1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaVirtualMachine_Layers(), this.getLayer(), null, "layers", null, 0, -1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaVirtualMachine_ClassLoaders(), this.getClassLoader(), null, "classLoaders", null, 0, -1, JavaVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayer_Boot(), theEcorePackage.getEBoolean(), "boot", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_Parents(), this.getLayer(), null, "parents", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_Modules(), this.getModule(), null, "modules", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classLoaderEClass, org.nasdanika.sdk.runtime.models.jvm.ClassLoader.class, "ClassLoader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassLoader_LoaderTypeName(), theEcorePackage.getEString(), "loaderTypeName", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.ClassLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassLoader_Parent(), this.getClassLoader(), null, "parent", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.ClassLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassLoader_UnnamedModule(), this.getModule(), null, "unnamedModule", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.ClassLoader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, org.nasdanika.sdk.runtime.models.jvm.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Named(), theEcorePackage.getEBoolean(), "named", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Version(), theEcorePackage.getEString(), "version", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Modifiers(), this.getModuleModifier(), "modifiers", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_MainClassName(), theEcorePackage.getEString(), "mainClassName", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Packages(), this.getPackage(), null, "packages", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Requires(), this.getRequires(), null, "requires", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Exports(), this.getExports(), null, "exports", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Opens(), this.getOpens(), null, "opens", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Provides(), this.getProvides(), null, "provides", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Uses(), theEcorePackage.getEString(), "uses", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Reads(), this.getModule(), null, "reads", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Layer(), this.getLayer(), null, "layer", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ClassLoader(), this.getClassLoader(), null, "classLoader", null, 0, 1, org.nasdanika.sdk.runtime.models.jvm.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequires_Modifiers(), this.getRequiresModifier(), "modifiers", null, 0, -1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequires_CompiledVersion(), theEcorePackage.getEString(), "compiledVersion", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequires_Module(), this.getModule(), null, "module", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportsEClass, Exports.class, "Exports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExports_Modifiers(), this.getDirectiveModifier(), "modifiers", null, 0, -1, Exports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExports_TargetNames(), theEcorePackage.getEString(), "targetNames", null, 0, -1, Exports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExports_Package(), this.getPackage(), null, "package", null, 0, 1, Exports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExports_Targets(), this.getModule(), null, "targets", null, 0, -1, Exports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opensEClass, Opens.class, "Opens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpens_Modifiers(), this.getDirectiveModifier(), "modifiers", null, 0, -1, Opens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpens_TargetNames(), theEcorePackage.getEString(), "targetNames", null, 0, -1, Opens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpens_Package(), this.getPackage(), null, "package", null, 0, 1, Opens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpens_Targets(), this.getModule(), null, "targets", null, 0, -1, Opens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providesEClass, Provides.class, "Provides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvides_ServiceName(), theEcorePackage.getEString(), "serviceName", null, 0, 1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvides_ProviderNames(), theEcorePackage.getEString(), "providerNames", null, 0, -1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvides_Service(), this.getType(), null, "service", null, 0, 1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvides_Providers(), this.getType(), null, "providers", null, 0, -1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.sdk.runtime.models.jvm.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Types(), this.getType(), null, "types", null, 0, -1, org.nasdanika.sdk.runtime.models.jvm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Kind(), this.getTypeKind(), "kind", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Access(), this.getAccessLevel(), "access", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_BinaryName(), theEcorePackage.getEString(), "binaryName", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Synthetic(), theEcorePackage.getEBoolean(), "synthetic", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Sealed(), theEcorePackage.getEBoolean(), "sealed", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_ClassFileVersion(), theEcorePackage.getEInt(), "classFileVersion", "-1", 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Methods(), this.getMethod(), null, "methods", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Fields(), this.getField(), null, "fields", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_SuperType(), this.getType(), null, "superType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Interfaces(), this.getType(), null, "interfaces", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_ComponentType(), this.getType(), null, "componentType", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Module(), this.getModule(), null, "module", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Access(), this.getAccessLevel(), "access", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Static(), theEcorePackage.getEBoolean(), "static", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Synthetic(), theEcorePackage.getEBoolean(), "synthetic", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Abstract(), theEcorePackage.getEBoolean(), "abstract", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Synchronized(), theEcorePackage.getEBoolean(), "synchronized", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Native(), theEcorePackage.getEBoolean(), "native", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Bridge(), theEcorePackage.getEBoolean(), "bridge", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Varargs(), theEcorePackage.getEBoolean(), "varargs", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Default(), theEcorePackage.getEBoolean(), "default", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ReturnDescriptor(), theEcorePackage.getEString(), "returnDescriptor", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_ReturnType(), this.getType(), null, "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_ThrownTypeNames(), theEcorePackage.getEString(), "thrownTypeNames", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_ThrownTypes(), this.getType(), null, "thrownTypes", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Transient(), theEcorePackage.getEBoolean(), "transient", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Volatile(), theEcorePackage.getEBoolean(), "volatile", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_EnumConstant(), theEcorePackage.getEBoolean(), "enumConstant", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Type(), this.getType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Index(), theEcorePackage.getEInt(), "index", "-1", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Descriptor(), theEcorePackage.getEString(), "descriptor", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Final(), theEcorePackage.getEBoolean(), "final", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Synthetic(), theEcorePackage.getEBoolean(), "synthetic", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Mandated(), theEcorePackage.getEBoolean(), "mandated", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(moduleModifierEEnum, ModuleModifier.class, "ModuleModifier");
		addEEnumLiteral(moduleModifierEEnum, ModuleModifier.OPEN);
		addEEnumLiteral(moduleModifierEEnum, ModuleModifier.AUTOMATIC);
		addEEnumLiteral(moduleModifierEEnum, ModuleModifier.SYNTHETIC);
		addEEnumLiteral(moduleModifierEEnum, ModuleModifier.MANDATED);

		initEEnum(requiresModifierEEnum, RequiresModifier.class, "RequiresModifier");
		addEEnumLiteral(requiresModifierEEnum, RequiresModifier.TRANSITIVE);
		addEEnumLiteral(requiresModifierEEnum, RequiresModifier.STATIC);
		addEEnumLiteral(requiresModifierEEnum, RequiresModifier.SYNTHETIC);
		addEEnumLiteral(requiresModifierEEnum, RequiresModifier.MANDATED);

		initEEnum(directiveModifierEEnum, DirectiveModifier.class, "DirectiveModifier");
		addEEnumLiteral(directiveModifierEEnum, DirectiveModifier.SYNTHETIC);
		addEEnumLiteral(directiveModifierEEnum, DirectiveModifier.MANDATED);

		initEEnum(typeKindEEnum, TypeKind.class, "TypeKind");
		addEEnumLiteral(typeKindEEnum, TypeKind.CLASS);
		addEEnumLiteral(typeKindEEnum, TypeKind.INTERFACE);
		addEEnumLiteral(typeKindEEnum, TypeKind.ENUM);
		addEEnumLiteral(typeKindEEnum, TypeKind.RECORD);
		addEEnumLiteral(typeKindEEnum, TypeKind.ANNOTATION);
		addEEnumLiteral(typeKindEEnum, TypeKind.PRIMITIVE);
		addEEnumLiteral(typeKindEEnum, TypeKind.ARRAY);

		initEEnum(accessLevelEEnum, AccessLevel.class, "AccessLevel");
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PUBLIC);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PROTECTED);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PACKAGE);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.PRIVATE);

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
			   "modelDirectory", "/model/src-gen",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "25",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.sdk.runtime.models"
		   });
		addAnnotation
		  (jvmElementEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nROOT AND BASE\n==========================================================================="
		   });
		addAnnotation
		  (javaVirtualMachineEClass,
		   source,
		   new String[] {
			   "documentation", "The root: one JVM, described. A live loader populates this from\nModuleLayer.boot() and reflection; a build-time scan synthesizes one with the\nruntime features left unset and modules derived from module-info.class,\nAutomatic-Module-Name, or the unnamed module.\n\nThe distinction matters enough to be visible in the data rather than inferred:\n`live` says whether anything here was observed running."
		   });
		addAnnotation
		  (getJavaVirtualMachine_Live(),
		   source,
		   new String[] {
			   "documentation", " True when populated from a running VM, false for a static scan."
		   });
		addAnnotation
		  (getJavaVirtualMachine_VmName(),
		   source,
		   new String[] {
			   "documentation", " java.vm.name, java.vm.version, java.vm.vendor when known."
		   });
		addAnnotation
		  (getJavaVirtualMachine_SpecificationVersion(),
		   source,
		   new String[] {
			   "documentation", " The Java SE specification version, e.g. \"21\"."
		   });
		addAnnotation
		  (getJavaVirtualMachine_Modules(),
		   source,
		   new String[] {
			   "documentation", "Modules are contained here rather than in a layer, because a named module\nbelongs to a layer and an unnamed module belongs to a class loader, and one\ncontainment cannot express both. Layers and loaders reference them."
		   });
		addAnnotation
		  (layerEClass,
		   source,
		   new String[] {
			   "documentation", "A module layer. Most applications have one, the boot layer, and the interesting\ncase is the one that does not: layers are the only standard mechanism for\nrunning two versions of the same module in one JVM, which makes \"which version\nis this code actually seeing\" answerable where a classpath makes it guesswork."
		   });
		addAnnotation
		  (getLayer_Boot(),
		   source,
		   new String[] {
			   "documentation", " True for ModuleLayer.boot()."
		   });
		addAnnotation
		  (classLoaderEClass,
		   source,
		   new String[] {
			   "documentation", "A class loader. Orthogonal to layers: a loader may serve modules in several\nlayers, and every loader has exactly one unnamed module holding whatever it\nloaded from the classpath."
		   });
		addAnnotation
		  (getClassLoader_LoaderTypeName(),
		   source,
		   new String[] {
			   "documentation", " The loader\'s own class, as a binary name, e.g. jdk.internal.loader.ClassLoaders$AppClassLoader."
		   });
		addAnnotation
		  (moduleModifierEEnum,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nMODULES\n==========================================================================="
		   });
		addAnnotation
		  (moduleEClass,
		   source,
		   new String[] {
			   "documentation", "A module, named or unnamed.\n\nThe two reference sets are the reason this model is worth having. `requires` is\nwhat the module declared; `reads` is what resolution actually gave it. They\ndiverge when `requires transitive` propagates readability, and, more\ninterestingly, when service binding pulls a provider into the graph that\nnothing declared a dependency on. That second case is absent from every POM by\nconstruction, so no dependency tree can report it."
		   });
		addAnnotation
		  (getModule_Named(),
		   source,
		   new String[] {
			   "documentation", " False for a class loader\'s unnamed module, where name is absent."
		   });
		addAnnotation
		  (getModule_Version(),
		   source,
		   new String[] {
			   "documentation", " The raw version string from the descriptor, unparsed."
		   });
		addAnnotation
		  (getModule_MainClassName(),
		   source,
		   new String[] {
			   "documentation", " Binary name of the main class, when declared."
		   });
		addAnnotation
		  (getModule_Uses(),
		   source,
		   new String[] {
			   "documentation", " Binary names of service interfaces this module uses."
		   });
		addAnnotation
		  (getModule_Reads(),
		   source,
		   new String[] {
			   "documentation", "Resolved readability, from the configuration rather than from the\ndescriptor. The set difference against `requires` is the money query."
		   });
		addAnnotation
		  (requiresModifierEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", " Propagates readability to modules that require this one."
		   });
		addAnnotation
		  (requiresModifierEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", " Compile time only, absent at run time."
		   });
		addAnnotation
		  (getRequires_CompiledVersion(),
		   source,
		   new String[] {
			   "documentation", " Version recorded at compile time, when present."
		   });
		addAnnotation
		  (getRequires_Module(),
		   source,
		   new String[] {
			   "documentation", " Resolved when the required module is in the model; name is authoritative."
		   });
		addAnnotation
		  (exportsEClass,
		   source,
		   new String[] {
			   "documentation", "exports a.b, or exports a.b to c.d - a qualified export, visible only to the\nnamed targets. An empty targets list means unqualified."
		   });
		addAnnotation
		  (getExports_TargetNames(),
		   source,
		   new String[] {
			   "documentation", " Binary names of target modules; empty means exported to everyone."
		   });
		addAnnotation
		  (opensEClass,
		   source,
		   new String[] {
			   "documentation", "opens a.b, differing from exports in permitting deep reflective access rather\nthan compile-time access. The distinction is the whole point of the directive\nand is worth keeping as a separate class rather than a flag."
		   });
		addAnnotation
		  (providesEClass,
		   source,
		   new String[] {
			   "documentation", "provides S with P1, P2. A two-ended relation between a service interface and\nits implementations, and the mechanism behind the readability surprises above."
		   });
		addAnnotation
		  (getProvides_ServiceName(),
		   source,
		   new String[] {
			   "documentation", " Binary name of the service interface."
		   });
		addAnnotation
		  (getProvides_ProviderNames(),
		   source,
		   new String[] {
			   "documentation", " Binary names of the providers, in declaration order."
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nPACKAGES AND TYPES\n==========================================================================="
		   });
		addAnnotation
		  (typeKindEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", " int, boolean, void and the rest; reflection models these as classes too."
		   });
		addAnnotation
		  (accessLevelEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", " Package private, which has no keyword."
		   });
		addAnnotation
		  (typeEClass,
		   source,
		   new String[] {
			   "documentation", "A type: class, interface, enum, record, annotation, primitive or array.\n\nOne class rather than a hierarchy, mirroring reflection, where isPrimitive and\nisArray are queries on Class rather than distinct types. That keeps the identity\nscheme uniform, since `int` and `int[]` have binary names like everything else,\nand it keeps the model small."
		   });
		addAnnotation
		  (getType_BinaryName(),
		   source,
		   new String[] {
			   "documentation", " com.foo.Bar, com.foo.Bar$Inner, [I. The identity-bearing name."
		   });
		addAnnotation
		  (getType_Descriptor(),
		   source,
		   new String[] {
			   "documentation", " Ljava/lang/String;, I, [I."
		   });
		addAnnotation
		  (getType_ClassFileVersion(),
		   source,
		   new String[] {
			   "documentation", "The class file major version, e.g. 61 for Java 17. Two bytes of the header,\nnever aggregated by anything, and the basis of an estate report nobody has.\n-1 when unknown, which includes primitives and arrays."
		   });
		addAnnotation
		  (getType_ComponentType(),
		   source,
		   new String[] {
			   "documentation", " For arrays; null otherwise."
		   });
		addAnnotation
		  (getType_Module(),
		   source,
		   new String[] {
			   "documentation", " Convenience back-reference; the containing package is the container."
		   });
		addAnnotation
		  (memberEClass,
		   source,
		   new String[] {
			   "documentation", " ===========================================================================\nMEMBERS\n==========================================================================="
		   });
		addAnnotation
		  (getMember_Descriptor(),
		   source,
		   new String[] {
			   "documentation", " The JVM descriptor: a field\'s type, or a method\'s parameters and return."
		   });
		addAnnotation
		  (methodEClass,
		   source,
		   new String[] {
			   "documentation", "A method, a constructor, or a static initializer.\n\nConstructors are not a separate class. In the JVM a constructor is a method\nnamed <init> and a static initializer is <clinit>, the descriptor distinguishes\noverloads, and the identity scheme works uniformly across all three. Reflection\nseparates Constructor from Method; bytecode does not, and this model follows\nbytecode because that is where its identity comes from."
		   });
		addAnnotation
		  (getMethod_Default(),
		   source,
		   new String[] {
			   "documentation", " An interface method with a body."
		   });
		addAnnotation
		  (getMethod_ReturnDescriptor(),
		   source,
		   new String[] {
			   "documentation", " Ljava/lang/String;, V, I."
		   });
		addAnnotation
		  (getMethod_ThrownTypeNames(),
		   source,
		   new String[] {
			   "documentation", " Binary names of declared checked exceptions."
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "documentation", "A parameter. `name` is present only when the class was compiled with -parameters\nor the information is otherwise available, so position is the reliable identity\nand the name is a convenience."
		   });
		addAnnotation
		  (getParameter_Mandated(),
		   source,
		   new String[] {
			   "documentation", " A parameter the compiler generated, such as an enum constructor\'s."
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

} //JvmPackageImpl
