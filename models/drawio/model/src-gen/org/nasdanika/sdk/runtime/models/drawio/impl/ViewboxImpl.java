/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.diagram.Bounds;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Viewbox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ViewboxImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ViewboxImpl#isSmooth <em>Smooth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewboxImpl extends ActionImpl implements Viewbox {
	/**
	 * The default value of the '{@link #isSmooth() <em>Smooth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmooth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMOOTH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewboxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.VIEWBOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds getBounds() {
		return (Bounds)eDynamicGet(DrawioPackage.VIEWBOX__BOUNDS, DrawioPackage.Literals.VIEWBOX__BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(Bounds newBounds, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBounds, DrawioPackage.VIEWBOX__BOUNDS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Bounds newBounds) {
		eDynamicSet(DrawioPackage.VIEWBOX__BOUNDS, DrawioPackage.Literals.VIEWBOX__BOUNDS, newBounds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmooth() {
		return (Boolean)eDynamicGet(DrawioPackage.VIEWBOX__SMOOTH, DrawioPackage.Literals.VIEWBOX__SMOOTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmooth(boolean newSmooth) {
		eDynamicSet(DrawioPackage.VIEWBOX__SMOOTH, DrawioPackage.Literals.VIEWBOX__SMOOTH, newSmooth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawioPackage.VIEWBOX__BOUNDS:
				return basicSetBounds(null, msgs);
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
			case DrawioPackage.VIEWBOX__BOUNDS:
				return getBounds();
			case DrawioPackage.VIEWBOX__SMOOTH:
				return isSmooth();
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
			case DrawioPackage.VIEWBOX__BOUNDS:
				setBounds((Bounds)newValue);
				return;
			case DrawioPackage.VIEWBOX__SMOOTH:
				setSmooth((Boolean)newValue);
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
			case DrawioPackage.VIEWBOX__BOUNDS:
				setBounds((Bounds)null);
				return;
			case DrawioPackage.VIEWBOX__SMOOTH:
				setSmooth(SMOOTH_EDEFAULT);
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
			case DrawioPackage.VIEWBOX__BOUNDS:
				return getBounds() != null;
			case DrawioPackage.VIEWBOX__SMOOTH:
				return isSmooth() != SMOOTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ViewboxImpl
