/**
 */
package org.nasdanika.sdk.runtime.models.core;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.Marker#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker()
 * @model
 * @generated
 */
public interface Marker extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.Marker#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Position()
	 * @model unique="false"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.Marker#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.Marker#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Date()
	 * @model unique="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.Marker#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Feature name for feature markers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Feature()
	 * @model unique="false"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.Marker#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Optional source hash/digest.
	 * E.g. SHA for a text file or Merkle tree hash for models - may exclude some features and may be also computed on graphs including non-containment references, not only on trees
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Digest</em>' attribute.
	 * @see #setDigest(String)
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Digest()
	 * @model unique="false"
	 * @generated
	 */
	String getDigest();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.core.Marker#getDigest <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest</em>' attribute.
	 * @see #getDigest()
	 * @generated
	 */
	void setDigest(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.core.Marker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Child markers. For example, a feature can be computed from two features with their own markers. In this case those markers may be recorded as
	 * children of a parent marker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.core.CorePackage#getMarker_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Marker> getChildren();

} // Marker
