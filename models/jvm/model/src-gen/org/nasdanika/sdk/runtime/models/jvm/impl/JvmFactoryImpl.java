/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.jvm.AccessLevel;
import org.nasdanika.sdk.runtime.models.jvm.DirectiveModifier;
import org.nasdanika.sdk.runtime.models.jvm.Exports;
import org.nasdanika.sdk.runtime.models.jvm.Field;
import org.nasdanika.sdk.runtime.models.jvm.JavaVirtualMachine;
import org.nasdanika.sdk.runtime.models.jvm.JvmFactory;
import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Layer;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JvmFactoryImpl extends EFactoryImpl implements JvmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JvmFactory init() {
		try {
			JvmFactory theJvmFactory = (JvmFactory)EPackage.Registry.INSTANCE.getEFactory(JvmPackage.eNS_URI);
			if (theJvmFactory != null) {
				return theJvmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JvmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmFactoryImpl() {
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
			case JvmPackage.JAVA_VIRTUAL_MACHINE: return createJavaVirtualMachine();
			case JvmPackage.LAYER: return createLayer();
			case JvmPackage.CLASS_LOADER: return createClassLoader();
			case JvmPackage.MODULE: return createModule();
			case JvmPackage.REQUIRES: return createRequires();
			case JvmPackage.EXPORTS: return createExports();
			case JvmPackage.OPENS: return createOpens();
			case JvmPackage.PROVIDES: return createProvides();
			case JvmPackage.PACKAGE: return createPackage();
			case JvmPackage.TYPE: return createType();
			case JvmPackage.METHOD: return createMethod();
			case JvmPackage.FIELD: return createField();
			case JvmPackage.PARAMETER: return createParameter();
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
			case JvmPackage.MODULE_MODIFIER:
				return createModuleModifierFromString(eDataType, initialValue);
			case JvmPackage.REQUIRES_MODIFIER:
				return createRequiresModifierFromString(eDataType, initialValue);
			case JvmPackage.DIRECTIVE_MODIFIER:
				return createDirectiveModifierFromString(eDataType, initialValue);
			case JvmPackage.TYPE_KIND:
				return createTypeKindFromString(eDataType, initialValue);
			case JvmPackage.ACCESS_LEVEL:
				return createAccessLevelFromString(eDataType, initialValue);
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
			case JvmPackage.MODULE_MODIFIER:
				return convertModuleModifierToString(eDataType, instanceValue);
			case JvmPackage.REQUIRES_MODIFIER:
				return convertRequiresModifierToString(eDataType, instanceValue);
			case JvmPackage.DIRECTIVE_MODIFIER:
				return convertDirectiveModifierToString(eDataType, instanceValue);
			case JvmPackage.TYPE_KIND:
				return convertTypeKindToString(eDataType, instanceValue);
			case JvmPackage.ACCESS_LEVEL:
				return convertAccessLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaVirtualMachine createJavaVirtualMachine() {
		JavaVirtualMachineImpl javaVirtualMachine = new JavaVirtualMachineImpl();
		return javaVirtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.ClassLoader createClassLoader() {
		ClassLoaderImpl classLoader = new ClassLoaderImpl();
		return classLoader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requires createRequires() {
		RequiresImpl requires = new RequiresImpl();
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exports createExports() {
		ExportsImpl exports = new ExportsImpl();
		return exports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opens createOpens() {
		OpensImpl opens = new OpensImpl();
		return opens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provides createProvides() {
		ProvidesImpl provides = new ProvidesImpl();
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.sdk.runtime.models.jvm.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleModifier createModuleModifierFromString(EDataType eDataType, String initialValue) {
		ModuleModifier result = ModuleModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresModifier createRequiresModifierFromString(EDataType eDataType, String initialValue) {
		RequiresModifier result = RequiresModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequiresModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectiveModifier createDirectiveModifierFromString(EDataType eDataType, String initialValue) {
		DirectiveModifier result = DirectiveModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectiveModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeKind createTypeKindFromString(EDataType eDataType, String initialValue) {
		TypeKind result = TypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue) {
		AccessLevel result = AccessLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmPackage getJvmPackage() {
		return (JvmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JvmPackage getPackage() {
		return JvmPackage.eINSTANCE;
	}

} //JvmFactoryImpl
