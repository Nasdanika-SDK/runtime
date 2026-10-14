/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderSize;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderImpl#getSizes <em>Sizes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceholderImpl extends BootstrapElementImpl implements Placeholder {
	/**
	 * The default value of the '{@link #getBg() <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBg()
	 * @generated
	 * @ordered
	 */
	protected static final Variant BG_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final PlaceholderSize SIZE_EDEFAULT = PlaceholderSize.XS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.PLACEHOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getBg() {
		return (Variant)eDynamicGet(ContentPackage.PLACEHOLDER__BG, ContentPackage.Literals.PLACEHOLDER__BG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBg(Variant newBg) {
		eDynamicSet(ContentPackage.PLACEHOLDER__BG, ContentPackage.Literals.PLACEHOLDER__BG, newBg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBg() {
		eDynamicUnset(ContentPackage.PLACEHOLDER__BG, ContentPackage.Literals.PLACEHOLDER__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBg() {
		return eDynamicIsSet(ContentPackage.PLACEHOLDER__BG, ContentPackage.Literals.PLACEHOLDER__BG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderSize getSize() {
		return (PlaceholderSize)eDynamicGet(ContentPackage.PLACEHOLDER__SIZE, ContentPackage.Literals.PLACEHOLDER__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(PlaceholderSize newSize) {
		eDynamicSet(ContentPackage.PLACEHOLDER__SIZE, ContentPackage.Literals.PLACEHOLDER__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(ContentPackage.PLACEHOLDER__SIZE, ContentPackage.Literals.PLACEHOLDER__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(ContentPackage.PLACEHOLDER__SIZE, ContentPackage.Literals.PLACEHOLDER__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ColumnSize> getSizes() {
		return (EList<ColumnSize>)eDynamicGet(ContentPackage.PLACEHOLDER__SIZES, ContentPackage.Literals.PLACEHOLDER__SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.PLACEHOLDER__SIZES:
				return ((InternalEList<?>)getSizes()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.PLACEHOLDER__BG:
				return getBg();
			case ContentPackage.PLACEHOLDER__SIZE:
				return getSize();
			case ContentPackage.PLACEHOLDER__SIZES:
				return getSizes();
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
			case ContentPackage.PLACEHOLDER__BG:
				setBg((Variant)newValue);
				return;
			case ContentPackage.PLACEHOLDER__SIZE:
				setSize((PlaceholderSize)newValue);
				return;
			case ContentPackage.PLACEHOLDER__SIZES:
				getSizes().clear();
				getSizes().addAll((Collection<? extends ColumnSize>)newValue);
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
			case ContentPackage.PLACEHOLDER__BG:
				unsetBg();
				return;
			case ContentPackage.PLACEHOLDER__SIZE:
				unsetSize();
				return;
			case ContentPackage.PLACEHOLDER__SIZES:
				getSizes().clear();
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
			case ContentPackage.PLACEHOLDER__BG:
				return isSetBg();
			case ContentPackage.PLACEHOLDER__SIZE:
				return isSetSize();
			case ContentPackage.PLACEHOLDER__SIZES:
				return !getSizes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlaceholderImpl
