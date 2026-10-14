/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Options of new edges, e.g. connected by the user.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getEdgeType <em>Edge Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getCustomType <em>Custom Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#isAnimated <em>Animated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getMarkerEnd <em>Marker End</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgeOptions()
 * @model
 * @generated
 */
public interface EdgeOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Edge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.react.flow.EdgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
	 * @see #isSetEdgeType()
	 * @see #unsetEdgeType()
	 * @see #setEdgeType(EdgeType)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgeOptions_EdgeType()
	 * @model unique="false" unsettable="true"
	 *        annotation="urn:org.nasdanika:react prop='type'"
	 * @generated
	 */
	EdgeType getEdgeType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Type</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.EdgeType
	 * @see #isSetEdgeType()
	 * @see #unsetEdgeType()
	 * @see #getEdgeType()
	 * @generated
	 */
	void setEdgeType(EdgeType value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeType()
	 * @see #getEdgeType()
	 * @see #setEdgeType(EdgeType)
	 * @generated
	 */
	void unsetEdgeType();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getEdgeType <em>Edge Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Type</em>' attribute is set.
	 * @see #unsetEdgeType()
	 * @see #getEdgeType()
	 * @see #setEdgeType(EdgeType)
	 * @generated
	 */
	boolean isSetEdgeType();

	/**
	 * Returns the value of the '<em><b>Custom Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Type</em>' attribute.
	 * @see #setCustomType(String)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgeOptions_CustomType()
	 * @model unique="false"
	 *        annotation="urn:org.nasdanika:react prop='type'"
	 * @generated
	 */
	String getCustomType();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getCustomType <em>Custom Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Type</em>' attribute.
	 * @see #getCustomType()
	 * @generated
	 */
	void setCustomType(String value);

	/**
	 * Returns the value of the '<em><b>Animated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animated</em>' attribute.
	 * @see #isSetAnimated()
	 * @see #unsetAnimated()
	 * @see #setAnimated(boolean)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgeOptions_Animated()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	boolean isAnimated();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animated</em>' attribute.
	 * @see #isSetAnimated()
	 * @see #unsetAnimated()
	 * @see #isAnimated()
	 * @generated
	 */
	void setAnimated(boolean value);

	/**
	 * Unsets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#isAnimated <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnimated()
	 * @see #isAnimated()
	 * @see #setAnimated(boolean)
	 * @generated
	 */
	void unsetAnimated();

	/**
	 * Returns whether the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#isAnimated <em>Animated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Animated</em>' attribute is set.
	 * @see #unsetAnimated()
	 * @see #isAnimated()
	 * @see #setAnimated(boolean)
	 * @generated
	 */
	boolean isSetAnimated();

	/**
	 * Returns the value of the '<em><b>Marker End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker End</em>' containment reference.
	 * @see #setMarkerEnd(EdgeMarker)
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgeOptions_MarkerEnd()
	 * @model containment="true"
	 * @generated
	 */
	EdgeMarker getMarkerEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.react.flow.EdgeOptions#getMarkerEnd <em>Marker End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker End</em>' containment reference.
	 * @see #getMarkerEnd()
	 * @generated
	 */
	void setMarkerEnd(EdgeMarker value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' map.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowPackage#getEdgeOptions_Style()
	 * @model mapType="org.nasdanika.sdk.runtime.models.core.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 *        annotation="urn:org.nasdanika:react style='true'"
	 * @generated
	 */
	EMap<String, String> getStyle();

} // EdgeOptions
