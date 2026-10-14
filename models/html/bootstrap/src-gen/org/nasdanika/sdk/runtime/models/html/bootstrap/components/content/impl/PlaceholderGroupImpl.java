/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.Placeholder;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderAnimation;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.PlaceholderGroup;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placeholder Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderGroupImpl#getAnimation <em>Animation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.PlaceholderGroupImpl#getPlaceholders <em>Placeholders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceholderGroupImpl extends BootstrapElementImpl implements PlaceholderGroup {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceholderGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.PLACEHOLDER_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderAnimation getAnimation() {
		return (PlaceholderAnimation)eDynamicGet(ContentPackage.PLACEHOLDER_GROUP__ANIMATION, ContentPackage.Literals.PLACEHOLDER_GROUP__ANIMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimation(PlaceholderAnimation newAnimation) {
		eDynamicSet(ContentPackage.PLACEHOLDER_GROUP__ANIMATION, ContentPackage.Literals.PLACEHOLDER_GROUP__ANIMATION, newAnimation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnimation() {
		eDynamicUnset(ContentPackage.PLACEHOLDER_GROUP__ANIMATION, ContentPackage.Literals.PLACEHOLDER_GROUP__ANIMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnimation() {
		return eDynamicIsSet(ContentPackage.PLACEHOLDER_GROUP__ANIMATION, ContentPackage.Literals.PLACEHOLDER_GROUP__ANIMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Placeholder> getPlaceholders() {
		return (EList<Placeholder>)eDynamicGet(ContentPackage.PLACEHOLDER_GROUP__PLACEHOLDERS, ContentPackage.Literals.PLACEHOLDER_GROUP__PLACEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.PLACEHOLDER_GROUP__PLACEHOLDERS:
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
			case ContentPackage.PLACEHOLDER_GROUP__ANIMATION:
				return getAnimation();
			case ContentPackage.PLACEHOLDER_GROUP__PLACEHOLDERS:
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
			case ContentPackage.PLACEHOLDER_GROUP__ANIMATION:
				setAnimation((PlaceholderAnimation)newValue);
				return;
			case ContentPackage.PLACEHOLDER_GROUP__PLACEHOLDERS:
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
			case ContentPackage.PLACEHOLDER_GROUP__ANIMATION:
				unsetAnimation();
				return;
			case ContentPackage.PLACEHOLDER_GROUP__PLACEHOLDERS:
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
			case ContentPackage.PLACEHOLDER_GROUP__ANIMATION:
				return isSetAnimation();
			case ContentPackage.PLACEHOLDER_GROUP__PLACEHOLDERS:
				return !getPlaceholders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlaceholderGroupImpl
