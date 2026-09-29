/**
 */
package org.nasdanika.sdk.runtime.models.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.StringIdentity#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getStringIdentity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StringIdentity extends Referrable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getStringIdentity_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.StringIdentity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // StringIdentity
