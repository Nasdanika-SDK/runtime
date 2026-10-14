/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.react.bootstrap.ColumnSize;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Placeholder;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.PlaceholderAnimation;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.PlaceholderSize;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.PlaceholderImpl#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.PlaceholderImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.PlaceholderImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.PlaceholderImpl#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.PlaceholderImpl#getPlaceholders <em>Placeholders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceholderImpl extends BootstrapComponentImpl implements Placeholder {
	/**
	 * The default value of the '{@link #getAnimation() <em>Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimation()
	 * @generated
	 * @ordered
	 */
	protected static final PlaceholderAnimation ANIMATION_EDEFAULT = PlaceholderAnimation.GLOW;

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
	public PlaceholderAnimation getAnimation() {
		return (PlaceholderAnimation)eDynamicGet(ContentPackage.PLACEHOLDER__ANIMATION, ContentPackage.Literals.PLACEHOLDER__ANIMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimation(PlaceholderAnimation newAnimation) {
		eDynamicSet(ContentPackage.PLACEHOLDER__ANIMATION, ContentPackage.Literals.PLACEHOLDER__ANIMATION, newAnimation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimation() {
		eDynamicUnset(ContentPackage.PLACEHOLDER__ANIMATION, ContentPackage.Literals.PLACEHOLDER__ANIMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimation() {
		return eDynamicIsSet(ContentPackage.PLACEHOLDER__ANIMATION, ContentPackage.Literals.PLACEHOLDER__ANIMATION);
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
	@SuppressWarnings("unchecked")
	public EList<Placeholder> getPlaceholders() {
		return (EList<Placeholder>)eDynamicGet(ContentPackage.PLACEHOLDER__PLACEHOLDERS, ContentPackage.Literals.PLACEHOLDER__PLACEHOLDERS, true, true);
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
			case ContentPackage.PLACEHOLDER__PLACEHOLDERS:
				return ((InternalEList<?>)getPlaceholders()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.PLACEHOLDER__ANIMATION:
				return getAnimation();
			case ContentPackage.PLACEHOLDER__BG:
				return getBg();
			case ContentPackage.PLACEHOLDER__SIZE:
				return getSize();
			case ContentPackage.PLACEHOLDER__SIZES:
				return getSizes();
			case ContentPackage.PLACEHOLDER__PLACEHOLDERS:
				return getPlaceholders();
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
			case ContentPackage.PLACEHOLDER__ANIMATION:
				setAnimation((PlaceholderAnimation)newValue);
				return;
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
			case ContentPackage.PLACEHOLDER__PLACEHOLDERS:
				getPlaceholders().clear();
				getPlaceholders().addAll((Collection<? extends Placeholder>)newValue);
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
			case ContentPackage.PLACEHOLDER__ANIMATION:
				unsetAnimation();
				return;
			case ContentPackage.PLACEHOLDER__BG:
				unsetBg();
				return;
			case ContentPackage.PLACEHOLDER__SIZE:
				unsetSize();
				return;
			case ContentPackage.PLACEHOLDER__SIZES:
				getSizes().clear();
				return;
			case ContentPackage.PLACEHOLDER__PLACEHOLDERS:
				getPlaceholders().clear();
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
			case ContentPackage.PLACEHOLDER__ANIMATION:
				return isSetAnimation();
			case ContentPackage.PLACEHOLDER__BG:
				return isSetBg();
			case ContentPackage.PLACEHOLDER__SIZE:
				return isSetSize();
			case ContentPackage.PLACEHOLDER__SIZES:
				return !getSizes().isEmpty();
			case ContentPackage.PLACEHOLDER__PLACEHOLDERS:
				return !getPlaceholders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlaceholderImpl
