/**
 */
package org.nasdanika.sdk.runtime.models.telemetry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Resource represents the entity producing telemetry as Attributes.
 * For example, a process producing telemetry that is running in a container on Kubernetes has a Pod name, it is in a namespace and possibly is part of a Deployment which also has a name.
 * All three of these attributes can be included in the Resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getDroppedAttributesCount <em>Dropped Attributes Count</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.telemetry.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Set of attributes that describe the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getResource_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValue> getAttributes();

	/**
	 * Returns the value of the '<em><b>Dropped Attributes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * droppedAttributesCount is the number of dropped attributes. If the value is 0, then no attributes were dropped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #setDroppedAttributesCount(int)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getResource_DroppedAttributesCount()
	 * @model unique="false"
	 * @generated
	 */
	int getDroppedAttributesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getDroppedAttributesCount <em>Dropped Attributes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropped Attributes Count</em>' attribute.
	 * @see #getDroppedAttributesCount()
	 * @generated
	 */
	void setDroppedAttributesCount(int value);

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * schema_url contains the URL that describes the semantics of the attributes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Url</em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see org.nasdanika.sdk.runtime.models.telemetry.TelemetryPackage#getResource_SchemaUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.telemetry.Resource#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // Resource
