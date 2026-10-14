/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ProgressBar;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#getNow <em>Now</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#isVisuallyHidden <em>Visually Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#isAnimated <em>Animated</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ProgressBarImpl#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressBarImpl extends BootstrapElementImpl implements ProgressBar {
	/**
	 * The default value of the '{@link #getNow() <em>Now</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNow()
	 * @generated
	 * @ordered
	 */
	protected static final int NOW_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isVisuallyHidden() <em>Visually Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisuallyHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISUALLY_HIDDEN_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final Variant VARIANT_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #isStriped() <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStriped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIPED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAnimated() <em>Animated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnimated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANIMATED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.PROGRESS_BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNow() {
		return (Integer)eDynamicGet(ContentPackage.PROGRESS_BAR__NOW, ContentPackage.Literals.PROGRESS_BAR__NOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNow(int newNow) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__NOW, ContentPackage.Literals.PROGRESS_BAR__NOW, newNow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNow() {
		eDynamicUnset(ContentPackage.PROGRESS_BAR__NOW, ContentPackage.Literals.PROGRESS_BAR__NOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNow() {
		return eDynamicIsSet(ContentPackage.PROGRESS_BAR__NOW, ContentPackage.Literals.PROGRESS_BAR__NOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin() {
		return (Integer)eDynamicGet(ContentPackage.PROGRESS_BAR__MIN, ContentPackage.Literals.PROGRESS_BAR__MIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(int newMin) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__MIN, ContentPackage.Literals.PROGRESS_BAR__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin() {
		eDynamicUnset(ContentPackage.PROGRESS_BAR__MIN, ContentPackage.Literals.PROGRESS_BAR__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin() {
		return eDynamicIsSet(ContentPackage.PROGRESS_BAR__MIN, ContentPackage.Literals.PROGRESS_BAR__MIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax() {
		return (Integer)eDynamicGet(ContentPackage.PROGRESS_BAR__MAX, ContentPackage.Literals.PROGRESS_BAR__MAX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(int newMax) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__MAX, ContentPackage.Literals.PROGRESS_BAR__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax() {
		eDynamicUnset(ContentPackage.PROGRESS_BAR__MAX, ContentPackage.Literals.PROGRESS_BAR__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax() {
		return eDynamicIsSet(ContentPackage.PROGRESS_BAR__MAX, ContentPackage.Literals.PROGRESS_BAR__MAX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(ContentPackage.PROGRESS_BAR__LABEL, ContentPackage.Literals.PROGRESS_BAR__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__LABEL, ContentPackage.Literals.PROGRESS_BAR__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisuallyHidden() {
		return (Boolean)eDynamicGet(ContentPackage.PROGRESS_BAR__VISUALLY_HIDDEN, ContentPackage.Literals.PROGRESS_BAR__VISUALLY_HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisuallyHidden(boolean newVisuallyHidden) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__VISUALLY_HIDDEN, ContentPackage.Literals.PROGRESS_BAR__VISUALLY_HIDDEN, newVisuallyHidden);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getVariant() {
		return (Variant)eDynamicGet(ContentPackage.PROGRESS_BAR__VARIANT, ContentPackage.Literals.PROGRESS_BAR__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Variant newVariant) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__VARIANT, ContentPackage.Literals.PROGRESS_BAR__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.PROGRESS_BAR__VARIANT, ContentPackage.Literals.PROGRESS_BAR__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.PROGRESS_BAR__VARIANT, ContentPackage.Literals.PROGRESS_BAR__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStriped() {
		return (Boolean)eDynamicGet(ContentPackage.PROGRESS_BAR__STRIPED, ContentPackage.Literals.PROGRESS_BAR__STRIPED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStriped(boolean newStriped) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__STRIPED, ContentPackage.Literals.PROGRESS_BAR__STRIPED, newStriped);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnimated() {
		return (Boolean)eDynamicGet(ContentPackage.PROGRESS_BAR__ANIMATED, ContentPackage.Literals.PROGRESS_BAR__ANIMATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimated(boolean newAnimated) {
		eDynamicSet(ContentPackage.PROGRESS_BAR__ANIMATED, ContentPackage.Literals.PROGRESS_BAR__ANIMATED, newAnimated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProgressBar> getBars() {
		return (EList<ProgressBar>)eDynamicGet(ContentPackage.PROGRESS_BAR__BARS, ContentPackage.Literals.PROGRESS_BAR__BARS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.PROGRESS_BAR__BARS:
				return ((InternalEList<?>)getBars()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.PROGRESS_BAR__NOW:
				return getNow();
			case ContentPackage.PROGRESS_BAR__MIN:
				return getMin();
			case ContentPackage.PROGRESS_BAR__MAX:
				return getMax();
			case ContentPackage.PROGRESS_BAR__LABEL:
				return getLabel();
			case ContentPackage.PROGRESS_BAR__VISUALLY_HIDDEN:
				return isVisuallyHidden();
			case ContentPackage.PROGRESS_BAR__VARIANT:
				return getVariant();
			case ContentPackage.PROGRESS_BAR__STRIPED:
				return isStriped();
			case ContentPackage.PROGRESS_BAR__ANIMATED:
				return isAnimated();
			case ContentPackage.PROGRESS_BAR__BARS:
				return getBars();
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
			case ContentPackage.PROGRESS_BAR__NOW:
				setNow((Integer)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__MIN:
				setMin((Integer)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__MAX:
				setMax((Integer)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__LABEL:
				setLabel((String)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__VISUALLY_HIDDEN:
				setVisuallyHidden((Boolean)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__VARIANT:
				setVariant((Variant)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__STRIPED:
				setStriped((Boolean)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__ANIMATED:
				setAnimated((Boolean)newValue);
				return;
			case ContentPackage.PROGRESS_BAR__BARS:
				getBars().clear();
				getBars().addAll((Collection<? extends ProgressBar>)newValue);
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
			case ContentPackage.PROGRESS_BAR__NOW:
				unsetNow();
				return;
			case ContentPackage.PROGRESS_BAR__MIN:
				unsetMin();
				return;
			case ContentPackage.PROGRESS_BAR__MAX:
				unsetMax();
				return;
			case ContentPackage.PROGRESS_BAR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ContentPackage.PROGRESS_BAR__VISUALLY_HIDDEN:
				setVisuallyHidden(VISUALLY_HIDDEN_EDEFAULT);
				return;
			case ContentPackage.PROGRESS_BAR__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.PROGRESS_BAR__STRIPED:
				setStriped(STRIPED_EDEFAULT);
				return;
			case ContentPackage.PROGRESS_BAR__ANIMATED:
				setAnimated(ANIMATED_EDEFAULT);
				return;
			case ContentPackage.PROGRESS_BAR__BARS:
				getBars().clear();
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
			case ContentPackage.PROGRESS_BAR__NOW:
				return isSetNow();
			case ContentPackage.PROGRESS_BAR__MIN:
				return isSetMin();
			case ContentPackage.PROGRESS_BAR__MAX:
				return isSetMax();
			case ContentPackage.PROGRESS_BAR__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case ContentPackage.PROGRESS_BAR__VISUALLY_HIDDEN:
				return isVisuallyHidden() != VISUALLY_HIDDEN_EDEFAULT;
			case ContentPackage.PROGRESS_BAR__VARIANT:
				return isSetVariant();
			case ContentPackage.PROGRESS_BAR__STRIPED:
				return isStriped() != STRIPED_EDEFAULT;
			case ContentPackage.PROGRESS_BAR__ANIMATED:
				return isAnimated() != ANIMATED_EDEFAULT;
			case ContentPackage.PROGRESS_BAR__BARS:
				return !getBars().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgressBarImpl
