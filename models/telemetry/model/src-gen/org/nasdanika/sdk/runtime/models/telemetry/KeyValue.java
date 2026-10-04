/**
 */
package org.nasdanika.sdk.runtime.models.telemetry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * KeyValue is a key-value pair that is used to store Span attributes, Link attributes, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getKeyValue()
 * @model
 * @generated
 */
public interface KeyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getKeyValue_Key()
	 * @model unique="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The value associated with the key.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AnyValue)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getKeyValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	AnyValue getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AnyValue value);

} // KeyValue
