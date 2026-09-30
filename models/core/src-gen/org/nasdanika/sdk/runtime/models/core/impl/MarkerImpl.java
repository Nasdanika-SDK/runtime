/**
 */
package org.nasdanika.sdk.runtime.models.core.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.core.CorePackage;
import org.nasdanika.sdk.runtime.models.core.Marker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.MarkerImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkerImpl extends MinimalEObjectImpl.Container implements Marker {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDigest() <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigest()
	 * @generated
	 * @ordered
	 */
	protected static final String DIGEST_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(CorePackage.MARKER__LOCATION, CorePackage.Literals.MARKER__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(CorePackage.MARKER__LOCATION, CorePackage.Literals.MARKER__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosition() {
		return (String)eDynamicGet(CorePackage.MARKER__POSITION, CorePackage.Literals.MARKER__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(String newPosition) {
		eDynamicSet(CorePackage.MARKER__POSITION, CorePackage.Literals.MARKER__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(CorePackage.MARKER__COMMENT, CorePackage.Literals.MARKER__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(CorePackage.MARKER__COMMENT, CorePackage.Literals.MARKER__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(CorePackage.MARKER__DATE, CorePackage.Literals.MARKER__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(CorePackage.MARKER__DATE, CorePackage.Literals.MARKER__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeature() {
		return (String)eDynamicGet(CorePackage.MARKER__FEATURE, CorePackage.Literals.MARKER__FEATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(String newFeature) {
		eDynamicSet(CorePackage.MARKER__FEATURE, CorePackage.Literals.MARKER__FEATURE, newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDigest() {
		return (String)eDynamicGet(CorePackage.MARKER__DIGEST, CorePackage.Literals.MARKER__DIGEST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigest(String newDigest) {
		eDynamicSet(CorePackage.MARKER__DIGEST, CorePackage.Literals.MARKER__DIGEST, newDigest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getChildren() {
		return (EList<Marker>)eDynamicGet(CorePackage.MARKER__CHILDREN, CorePackage.Literals.MARKER__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MARKER__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MARKER__LOCATION:
				return getLocation();
			case CorePackage.MARKER__POSITION:
				return getPosition();
			case CorePackage.MARKER__COMMENT:
				return getComment();
			case CorePackage.MARKER__DATE:
				return getDate();
			case CorePackage.MARKER__FEATURE:
				return getFeature();
			case CorePackage.MARKER__DIGEST:
				return getDigest();
			case CorePackage.MARKER__CHILDREN:
				return getChildren();
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
			case CorePackage.MARKER__LOCATION:
				setLocation((String)newValue);
				return;
			case CorePackage.MARKER__POSITION:
				setPosition((String)newValue);
				return;
			case CorePackage.MARKER__COMMENT:
				setComment((String)newValue);
				return;
			case CorePackage.MARKER__DATE:
				setDate((Date)newValue);
				return;
			case CorePackage.MARKER__FEATURE:
				setFeature((String)newValue);
				return;
			case CorePackage.MARKER__DIGEST:
				setDigest((String)newValue);
				return;
			case CorePackage.MARKER__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Marker>)newValue);
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
			case CorePackage.MARKER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case CorePackage.MARKER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case CorePackage.MARKER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case CorePackage.MARKER__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CorePackage.MARKER__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case CorePackage.MARKER__DIGEST:
				setDigest(DIGEST_EDEFAULT);
				return;
			case CorePackage.MARKER__CHILDREN:
				getChildren().clear();
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
			case CorePackage.MARKER__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case CorePackage.MARKER__POSITION:
				return POSITION_EDEFAULT == null ? getPosition() != null : !POSITION_EDEFAULT.equals(getPosition());
			case CorePackage.MARKER__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case CorePackage.MARKER__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case CorePackage.MARKER__FEATURE:
				return FEATURE_EDEFAULT == null ? getFeature() != null : !FEATURE_EDEFAULT.equals(getFeature());
			case CorePackage.MARKER__DIGEST:
				return DIGEST_EDEFAULT == null ? getDigest() != null : !DIGEST_EDEFAULT.equals(getDigest());
			case CorePackage.MARKER__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MarkerImpl
