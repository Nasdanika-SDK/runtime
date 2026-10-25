/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.PersistableAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistable Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.PersistableActionImpl#isPersistChanges <em>Persist Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersistableActionImpl extends TargetedActionImpl implements PersistableAction {
	/**
	 * The default value of the '{@link #isPersistChanges() <em>Persist Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersistChanges()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSIST_CHANGES_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistableActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.PERSISTABLE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersistChanges() {
		return (Boolean)eDynamicGet(DrawioPackage.PERSISTABLE_ACTION__PERSIST_CHANGES, DrawioPackage.Literals.PERSISTABLE_ACTION__PERSIST_CHANGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistChanges(boolean newPersistChanges) {
		eDynamicSet(DrawioPackage.PERSISTABLE_ACTION__PERSIST_CHANGES, DrawioPackage.Literals.PERSISTABLE_ACTION__PERSIST_CHANGES, newPersistChanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.PERSISTABLE_ACTION__PERSIST_CHANGES:
				return isPersistChanges();
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
			case DrawioPackage.PERSISTABLE_ACTION__PERSIST_CHANGES:
				setPersistChanges((Boolean)newValue);
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
			case DrawioPackage.PERSISTABLE_ACTION__PERSIST_CHANGES:
				setPersistChanges(PERSIST_CHANGES_EDEFAULT);
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
			case DrawioPackage.PERSISTABLE_ACTION__PERSIST_CHANGES:
				return isPersistChanges() != PERSIST_CHANGES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PersistableActionImpl
