/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Tag;
import org.nasdanika.sdk.runtime.models.drawio.TagsAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tags Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl#getToggle <em>Toggle</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl#getHidden <em>Hidden</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TagsActionImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagsActionImpl extends ActionImpl implements TagsAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagsActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.TAGS_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getToggle() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.TAGS_ACTION__TOGGLE, DrawioPackage.Literals.TAGS_ACTION__TOGGLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getHidden() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.TAGS_ACTION__HIDDEN, DrawioPackage.Literals.TAGS_ACTION__HIDDEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getVisible() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.TAGS_ACTION__VISIBLE, DrawioPackage.Literals.TAGS_ACTION__VISIBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.TAGS_ACTION__TOGGLE:
				return getToggle();
			case DrawioPackage.TAGS_ACTION__HIDDEN:
				return getHidden();
			case DrawioPackage.TAGS_ACTION__VISIBLE:
				return getVisible();
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
			case DrawioPackage.TAGS_ACTION__TOGGLE:
				getToggle().clear();
				getToggle().addAll((Collection<? extends Tag>)newValue);
				return;
			case DrawioPackage.TAGS_ACTION__HIDDEN:
				getHidden().clear();
				getHidden().addAll((Collection<? extends Tag>)newValue);
				return;
			case DrawioPackage.TAGS_ACTION__VISIBLE:
				getVisible().clear();
				getVisible().addAll((Collection<? extends Tag>)newValue);
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
			case DrawioPackage.TAGS_ACTION__TOGGLE:
				getToggle().clear();
				return;
			case DrawioPackage.TAGS_ACTION__HIDDEN:
				getHidden().clear();
				return;
			case DrawioPackage.TAGS_ACTION__VISIBLE:
				getVisible().clear();
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
			case DrawioPackage.TAGS_ACTION__TOGGLE:
				return !getToggle().isEmpty();
			case DrawioPackage.TAGS_ACTION__HIDDEN:
				return !getHidden().isEmpty();
			case DrawioPackage.TAGS_ACTION__VISIBLE:
				return !getVisible().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TagsActionImpl
