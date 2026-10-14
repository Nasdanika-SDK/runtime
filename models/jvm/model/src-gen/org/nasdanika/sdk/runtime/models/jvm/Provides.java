/**
 */
package org.nasdanika.sdk.runtime.models.jvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * provides S with P1, P2. A two-ended relation between a service interface and
 * its implementations, and the mechanism behind the readability surprises above.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getProviderNames <em>Provider Names</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getService <em>Service</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getProvides()
 * @model
 * @generated
 */
public interface Provides extends JvmElement {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Binary name of the service interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getProvides_ServiceName()
	 * @model unique="false"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Provider Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Binary names of the providers, in declaration order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Names</em>' attribute list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getProvides_ProviderNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getProviderNames();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Type)
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getProvides_Service()
	 * @model
	 * @generated
	 */
	Type getService();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.jvm.Provides#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Type value);

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.jvm.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.jvm.JvmPackage#getProvides_Providers()
	 * @model
	 * @generated
	 */
	EList<Type> getProviders();

} // Provides
