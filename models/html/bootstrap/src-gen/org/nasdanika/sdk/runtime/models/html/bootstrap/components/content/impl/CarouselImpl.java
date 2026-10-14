/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Carousel;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselItem;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.CarouselVariant;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carousel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl#isControls <em>Controls</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl#isIndicators <em>Indicators</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl#isFade <em>Fade</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.CarouselImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarouselImpl extends BootstrapElementImpl implements Carousel {
	/**
	 * The default value of the '{@link #isControls() <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControls()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIndicators() <em>Indicators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicators()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDICATORS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFade() <em>Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFade()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FADE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final CarouselVariant VARIANT_EDEFAULT = CarouselVariant.DARK;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarouselImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CAROUSEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControls() {
		return (Boolean)eDynamicGet(ContentPackage.CAROUSEL__CONTROLS, ContentPackage.Literals.CAROUSEL__CONTROLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControls(boolean newControls) {
		eDynamicSet(ContentPackage.CAROUSEL__CONTROLS, ContentPackage.Literals.CAROUSEL__CONTROLS, newControls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetControls() {
		eDynamicUnset(ContentPackage.CAROUSEL__CONTROLS, ContentPackage.Literals.CAROUSEL__CONTROLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetControls() {
		return eDynamicIsSet(ContentPackage.CAROUSEL__CONTROLS, ContentPackage.Literals.CAROUSEL__CONTROLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndicators() {
		return (Boolean)eDynamicGet(ContentPackage.CAROUSEL__INDICATORS, ContentPackage.Literals.CAROUSEL__INDICATORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicators(boolean newIndicators) {
		eDynamicSet(ContentPackage.CAROUSEL__INDICATORS, ContentPackage.Literals.CAROUSEL__INDICATORS, newIndicators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndicators() {
		eDynamicUnset(ContentPackage.CAROUSEL__INDICATORS, ContentPackage.Literals.CAROUSEL__INDICATORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndicators() {
		return eDynamicIsSet(ContentPackage.CAROUSEL__INDICATORS, ContentPackage.Literals.CAROUSEL__INDICATORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFade() {
		return (Boolean)eDynamicGet(ContentPackage.CAROUSEL__FADE, ContentPackage.Literals.CAROUSEL__FADE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFade(boolean newFade) {
		eDynamicSet(ContentPackage.CAROUSEL__FADE, ContentPackage.Literals.CAROUSEL__FADE, newFade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterval() {
		return (Integer)eDynamicGet(ContentPackage.CAROUSEL__INTERVAL, ContentPackage.Literals.CAROUSEL__INTERVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(int newInterval) {
		eDynamicSet(ContentPackage.CAROUSEL__INTERVAL, ContentPackage.Literals.CAROUSEL__INTERVAL, newInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterval() {
		eDynamicUnset(ContentPackage.CAROUSEL__INTERVAL, ContentPackage.Literals.CAROUSEL__INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterval() {
		return eDynamicIsSet(ContentPackage.CAROUSEL__INTERVAL, ContentPackage.Literals.CAROUSEL__INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarouselVariant getVariant() {
		return (CarouselVariant)eDynamicGet(ContentPackage.CAROUSEL__VARIANT, ContentPackage.Literals.CAROUSEL__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(CarouselVariant newVariant) {
		eDynamicSet(ContentPackage.CAROUSEL__VARIANT, ContentPackage.Literals.CAROUSEL__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.CAROUSEL__VARIANT, ContentPackage.Literals.CAROUSEL__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.CAROUSEL__VARIANT, ContentPackage.Literals.CAROUSEL__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CarouselItem> getItems() {
		return (EList<CarouselItem>)eDynamicGet(ContentPackage.CAROUSEL__ITEMS, ContentPackage.Literals.CAROUSEL__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.CAROUSEL__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.CAROUSEL__CONTROLS:
				return isControls();
			case ContentPackage.CAROUSEL__INDICATORS:
				return isIndicators();
			case ContentPackage.CAROUSEL__FADE:
				return isFade();
			case ContentPackage.CAROUSEL__INTERVAL:
				return getInterval();
			case ContentPackage.CAROUSEL__VARIANT:
				return getVariant();
			case ContentPackage.CAROUSEL__ITEMS:
				return getItems();
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
			case ContentPackage.CAROUSEL__CONTROLS:
				setControls((Boolean)newValue);
				return;
			case ContentPackage.CAROUSEL__INDICATORS:
				setIndicators((Boolean)newValue);
				return;
			case ContentPackage.CAROUSEL__FADE:
				setFade((Boolean)newValue);
				return;
			case ContentPackage.CAROUSEL__INTERVAL:
				setInterval((Integer)newValue);
				return;
			case ContentPackage.CAROUSEL__VARIANT:
				setVariant((CarouselVariant)newValue);
				return;
			case ContentPackage.CAROUSEL__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends CarouselItem>)newValue);
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
			case ContentPackage.CAROUSEL__CONTROLS:
				unsetControls();
				return;
			case ContentPackage.CAROUSEL__INDICATORS:
				unsetIndicators();
				return;
			case ContentPackage.CAROUSEL__FADE:
				setFade(FADE_EDEFAULT);
				return;
			case ContentPackage.CAROUSEL__INTERVAL:
				unsetInterval();
				return;
			case ContentPackage.CAROUSEL__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.CAROUSEL__ITEMS:
				getItems().clear();
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
			case ContentPackage.CAROUSEL__CONTROLS:
				return isSetControls();
			case ContentPackage.CAROUSEL__INDICATORS:
				return isSetIndicators();
			case ContentPackage.CAROUSEL__FADE:
				return isFade() != FADE_EDEFAULT;
			case ContentPackage.CAROUSEL__INTERVAL:
				return isSetInterval();
			case ContentPackage.CAROUSEL__VARIANT:
				return isSetVariant();
			case ContentPackage.CAROUSEL__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarouselImpl
