/**
 */
package org.nasdanika.sdk.runtime.models.jvm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.jvm.JvmPackage;
import org.nasdanika.sdk.runtime.models.jvm.Provides;
import org.nasdanika.sdk.runtime.models.jvm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl#getProviderNames <em>Provider Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.impl.ProvidesImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidesImpl extends JvmElementImpl implements Provides {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JvmPackage.Literals.PROVIDES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return (String)eDynamicGet(JvmPackage.PROVIDES__SERVICE_NAME, JvmPackage.Literals.PROVIDES__SERVICE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		eDynamicSet(JvmPackage.PROVIDES__SERVICE_NAME, JvmPackage.Literals.PROVIDES__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getProviderNames() {
		return (EList<String>)eDynamicGet(JvmPackage.PROVIDES__PROVIDER_NAMES, JvmPackage.Literals.PROVIDES__PROVIDER_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getService() {
		return (Type)eDynamicGet(JvmPackage.PROVIDES__SERVICE, JvmPackage.Literals.PROVIDES__SERVICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetService() {
		return (Type)eDynamicGet(JvmPackage.PROVIDES__SERVICE, JvmPackage.Literals.PROVIDES__SERVICE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Type newService) {
		eDynamicSet(JvmPackage.PROVIDES__SERVICE, JvmPackage.Literals.PROVIDES__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getProviders() {
		return (EList<Type>)eDynamicGet(JvmPackage.PROVIDES__PROVIDERS, JvmPackage.Literals.PROVIDES__PROVIDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JvmPackage.PROVIDES__SERVICE_NAME:
				return getServiceName();
			case JvmPackage.PROVIDES__PROVIDER_NAMES:
				return getProviderNames();
			case JvmPackage.PROVIDES__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case JvmPackage.PROVIDES__PROVIDERS:
				return getProviders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JvmPackage.PROVIDES__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case JvmPackage.PROVIDES__PROVIDER_NAMES:
				getProviderNames().clear();
				getProviderNames().addAll((Collection<? extends String>)newValue);
				return;
			case JvmPackage.PROVIDES__SERVICE:
				setService((Type)newValue);
				return;
			case JvmPackage.PROVIDES__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Type>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JvmPackage.PROVIDES__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case JvmPackage.PROVIDES__PROVIDER_NAMES:
				getProviderNames().clear();
				return;
			case JvmPackage.PROVIDES__SERVICE:
				setService((Type)null);
				return;
			case JvmPackage.PROVIDES__PROVIDERS:
				getProviders().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JvmPackage.PROVIDES__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? getServiceName() != null : !SERVICE_NAME_EDEFAULT.equals(getServiceName());
			case JvmPackage.PROVIDES__PROVIDER_NAMES:
				return !getProviderNames().isEmpty();
			case JvmPackage.PROVIDES__SERVICE:
				return basicGetService() != null;
			case JvmPackage.PROVIDES__PROVIDERS:
				return !getProviders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidesImpl
