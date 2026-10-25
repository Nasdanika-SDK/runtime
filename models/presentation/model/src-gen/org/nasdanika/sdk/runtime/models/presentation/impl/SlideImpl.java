/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.diagram.impl.DiagramImpl;

import org.nasdanika.sdk.runtime.models.presentation.MasterSlide;
import org.nasdanika.sdk.runtime.models.presentation.Notes;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.SlideImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlideImpl extends DiagramImpl implements Slide {
	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.SLIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlide getMaster() {
		return (MasterSlide)eDynamicGet(PresentationPackage.SLIDE__MASTER, PresentationPackage.Literals.SLIDE__MASTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlide basicGetMaster() {
		return (MasterSlide)eDynamicGet(PresentationPackage.SLIDE__MASTER, PresentationPackage.Literals.SLIDE__MASTER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaster(MasterSlide newMaster) {
		eDynamicSet(PresentationPackage.SLIDE__MASTER, PresentationPackage.Literals.SLIDE__MASTER, newMaster);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return (Boolean)eDynamicGet(PresentationPackage.SLIDE__HIDDEN, PresentationPackage.Literals.SLIDE__HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		eDynamicSet(PresentationPackage.SLIDE__HIDDEN, PresentationPackage.Literals.SLIDE__HIDDEN, newHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notes getNotes() {
		return (Notes)eDynamicGet(PresentationPackage.SLIDE__NOTES, PresentationPackage.Literals.SLIDE__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(Notes newNotes, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNotes, PresentationPackage.SLIDE__NOTES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(Notes newNotes) {
		eDynamicSet(PresentationPackage.SLIDE__NOTES, PresentationPackage.Literals.SLIDE__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.SLIDE__NOTES:
				return basicSetNotes(null, msgs);
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
			case PresentationPackage.SLIDE__MASTER:
				if (resolve) return getMaster();
				return basicGetMaster();
			case PresentationPackage.SLIDE__HIDDEN:
				return isHidden();
			case PresentationPackage.SLIDE__NOTES:
				return getNotes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.SLIDE__MASTER:
				setMaster((MasterSlide)newValue);
				return;
			case PresentationPackage.SLIDE__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case PresentationPackage.SLIDE__NOTES:
				setNotes((Notes)newValue);
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
			case PresentationPackage.SLIDE__MASTER:
				setMaster((MasterSlide)null);
				return;
			case PresentationPackage.SLIDE__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case PresentationPackage.SLIDE__NOTES:
				setNotes((Notes)null);
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
			case PresentationPackage.SLIDE__MASTER:
				return basicGetMaster() != null;
			case PresentationPackage.SLIDE__HIDDEN:
				return isHidden() != HIDDEN_EDEFAULT;
			case PresentationPackage.SLIDE__NOTES:
				return getNotes() != null;
		}
		return super.eIsSet(featureID);
	}

} //SlideImpl
