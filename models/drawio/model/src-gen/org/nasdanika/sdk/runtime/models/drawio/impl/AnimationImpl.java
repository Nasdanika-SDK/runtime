/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.drawio.Action;
import org.nasdanika.sdk.runtime.models.drawio.Animation;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl#isLoop <em>Loop</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.AnimationImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimationImpl extends MinimalEObjectImpl.Container implements Animation {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.ANIMATION;
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
	public boolean isEnabled() {
		return (Boolean)eDynamicGet(DrawioPackage.ANIMATION__ENABLED, DrawioPackage.Literals.ANIMATION__ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		eDynamicSet(DrawioPackage.ANIMATION__ENABLED, DrawioPackage.Literals.ANIMATION__ENABLED, newEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoop() {
		return (Boolean)eDynamicGet(DrawioPackage.ANIMATION__LOOP, DrawioPackage.Literals.ANIMATION__LOOP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(boolean newLoop) {
		eDynamicSet(DrawioPackage.ANIMATION__LOOP, DrawioPackage.Literals.ANIMATION__LOOP, newLoop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Action> getSteps() {
		return (EList<Action>)eDynamicGet(DrawioPackage.ANIMATION__STEPS, DrawioPackage.Literals.ANIMATION__STEPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawioPackage.ANIMATION__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case DrawioPackage.ANIMATION__ENABLED:
				return isEnabled();
			case DrawioPackage.ANIMATION__LOOP:
				return isLoop();
			case DrawioPackage.ANIMATION__STEPS:
				return getSteps();
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
			case DrawioPackage.ANIMATION__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case DrawioPackage.ANIMATION__LOOP:
				setLoop((Boolean)newValue);
				return;
			case DrawioPackage.ANIMATION__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Action>)newValue);
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
			case DrawioPackage.ANIMATION__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case DrawioPackage.ANIMATION__LOOP:
				setLoop(LOOP_EDEFAULT);
				return;
			case DrawioPackage.ANIMATION__STEPS:
				getSteps().clear();
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
			case DrawioPackage.ANIMATION__ENABLED:
				return isEnabled() != ENABLED_EDEFAULT;
			case DrawioPackage.ANIMATION__LOOP:
				return isLoop() != LOOP_EDEFAULT;
			case DrawioPackage.ANIMATION__STEPS:
				return !getSteps().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnimationImpl
