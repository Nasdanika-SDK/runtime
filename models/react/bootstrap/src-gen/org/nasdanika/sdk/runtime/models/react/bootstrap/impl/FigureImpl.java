/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Figure;
import org.nasdanika.sdk.runtime.models.react.bootstrap.FigureCaption;
import org.nasdanika.sdk.runtime.models.react.bootstrap.FigureImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.impl.FigureImpl#getCaption <em>Caption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FigureImpl extends BootstrapComponentImpl implements Figure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.FIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureImage getImage() {
		return (FigureImage)eDynamicGet(BootstrapPackage.FIGURE__IMAGE, BootstrapPackage.Literals.FIGURE__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(FigureImage newImage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImage, BootstrapPackage.FIGURE__IMAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(FigureImage newImage) {
		eDynamicSet(BootstrapPackage.FIGURE__IMAGE, BootstrapPackage.Literals.FIGURE__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureCaption getCaption() {
		return (FigureCaption)eDynamicGet(BootstrapPackage.FIGURE__CAPTION, BootstrapPackage.Literals.FIGURE__CAPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(FigureCaption newCaption, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCaption, BootstrapPackage.FIGURE__CAPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(FigureCaption newCaption) {
		eDynamicSet(BootstrapPackage.FIGURE__CAPTION, BootstrapPackage.Literals.FIGURE__CAPTION, newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.FIGURE__IMAGE:
				return basicSetImage(null, msgs);
			case BootstrapPackage.FIGURE__CAPTION:
				return basicSetCaption(null, msgs);
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
			case BootstrapPackage.FIGURE__IMAGE:
				return getImage();
			case BootstrapPackage.FIGURE__CAPTION:
				return getCaption();
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
			case BootstrapPackage.FIGURE__IMAGE:
				setImage((FigureImage)newValue);
				return;
			case BootstrapPackage.FIGURE__CAPTION:
				setCaption((FigureCaption)newValue);
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
			case BootstrapPackage.FIGURE__IMAGE:
				setImage((FigureImage)null);
				return;
			case BootstrapPackage.FIGURE__CAPTION:
				setCaption((FigureCaption)null);
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
			case BootstrapPackage.FIGURE__IMAGE:
				return getImage() != null;
			case BootstrapPackage.FIGURE__CAPTION:
				return getCaption() != null;
		}
		return super.eIsSet(featureID);
	}

} //FigureImpl
