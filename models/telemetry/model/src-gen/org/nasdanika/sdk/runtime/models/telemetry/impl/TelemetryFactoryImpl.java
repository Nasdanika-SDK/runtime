/**
 */
package org.nasdanika.sdk.runtime.models.telemetry.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.sdk.runtime.models.telemetry.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelemetryFactoryImpl extends EFactoryImpl implements TelemetryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TelemetryFactory init() {
		try {
			TelemetryFactory theTelemetryFactory = (TelemetryFactory)EPackage.Registry.INSTANCE.getEFactory(TelemetryPackage.eNS_URI);
			if (theTelemetryFactory != null) {
				return theTelemetryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TelemetryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemetryFactoryImpl() {
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
			case TelemetryPackage.RESOURCE: return createResource();
			case TelemetryPackage.INSTRUMENTATION_SCOPE: return createInstrumentationScope();
			case TelemetryPackage.KEY_VALUE: return createKeyValue();
			case TelemetryPackage.ANY_VALUE: return createAnyValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstrumentationScope createInstrumentationScope() {
		InstrumentationScopeImpl instrumentationScope = new InstrumentationScopeImpl();
		return instrumentationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyValue createAnyValue() {
		AnyValueImpl anyValue = new AnyValueImpl();
		return anyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemetryPackage getTelemetryPackage() {
		return (TelemetryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TelemetryPackage getPackage() {
		return TelemetryPackage.eINSTANCE;
	}

} //TelemetryFactoryImpl
