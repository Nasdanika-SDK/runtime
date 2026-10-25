/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Tag;
import org.nasdanika.sdk.runtime.models.drawio.TagsMatch;
import org.nasdanika.sdk.runtime.models.drawio.TargetedAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Targeted Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl#isAllCells <em>All Cells</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl#getTagsMatch <em>Tags Match</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.TargetedActionImpl#getExcludeCells <em>Exclude Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TargetedActionImpl extends ActionImpl implements TargetedAction {
	/**
	 * The default value of the '{@link #isAllCells() <em>All Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllCells()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_CELLS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTagsMatch() <em>Tags Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagsMatch()
	 * @generated
	 * @ordered
	 */
	protected static final TagsMatch TAGS_MATCH_EDEFAULT = TagsMatch.OR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.TARGETED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ModelElement> getCells() {
		return (EList<ModelElement>)eDynamicGet(DrawioPackage.TARGETED_ACTION__CELLS, DrawioPackage.Literals.TARGETED_ACTION__CELLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllCells() {
		return (Boolean)eDynamicGet(DrawioPackage.TARGETED_ACTION__ALL_CELLS, DrawioPackage.Literals.TARGETED_ACTION__ALL_CELLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllCells(boolean newAllCells) {
		eDynamicSet(DrawioPackage.TARGETED_ACTION__ALL_CELLS, DrawioPackage.Literals.TARGETED_ACTION__ALL_CELLS, newAllCells);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Layer> getLayers() {
		return (EList<Layer>)eDynamicGet(DrawioPackage.TARGETED_ACTION__LAYERS, DrawioPackage.Literals.TARGETED_ACTION__LAYERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.TARGETED_ACTION__TAGS, DrawioPackage.Literals.TARGETED_ACTION__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsMatch getTagsMatch() {
		return (TagsMatch)eDynamicGet(DrawioPackage.TARGETED_ACTION__TAGS_MATCH, DrawioPackage.Literals.TARGETED_ACTION__TAGS_MATCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagsMatch(TagsMatch newTagsMatch) {
		eDynamicSet(DrawioPackage.TARGETED_ACTION__TAGS_MATCH, DrawioPackage.Literals.TARGETED_ACTION__TAGS_MATCH, newTagsMatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ModelElement> getExcludeCells() {
		return (EList<ModelElement>)eDynamicGet(DrawioPackage.TARGETED_ACTION__EXCLUDE_CELLS, DrawioPackage.Literals.TARGETED_ACTION__EXCLUDE_CELLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.TARGETED_ACTION__CELLS:
				return getCells();
			case DrawioPackage.TARGETED_ACTION__ALL_CELLS:
				return isAllCells();
			case DrawioPackage.TARGETED_ACTION__LAYERS:
				return getLayers();
			case DrawioPackage.TARGETED_ACTION__TAGS:
				return getTags();
			case DrawioPackage.TARGETED_ACTION__TAGS_MATCH:
				return getTagsMatch();
			case DrawioPackage.TARGETED_ACTION__EXCLUDE_CELLS:
				return getExcludeCells();
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
			case DrawioPackage.TARGETED_ACTION__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case DrawioPackage.TARGETED_ACTION__ALL_CELLS:
				setAllCells((Boolean)newValue);
				return;
			case DrawioPackage.TARGETED_ACTION__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
				return;
			case DrawioPackage.TARGETED_ACTION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case DrawioPackage.TARGETED_ACTION__TAGS_MATCH:
				setTagsMatch((TagsMatch)newValue);
				return;
			case DrawioPackage.TARGETED_ACTION__EXCLUDE_CELLS:
				getExcludeCells().clear();
				getExcludeCells().addAll((Collection<? extends ModelElement>)newValue);
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
			case DrawioPackage.TARGETED_ACTION__CELLS:
				getCells().clear();
				return;
			case DrawioPackage.TARGETED_ACTION__ALL_CELLS:
				setAllCells(ALL_CELLS_EDEFAULT);
				return;
			case DrawioPackage.TARGETED_ACTION__LAYERS:
				getLayers().clear();
				return;
			case DrawioPackage.TARGETED_ACTION__TAGS:
				getTags().clear();
				return;
			case DrawioPackage.TARGETED_ACTION__TAGS_MATCH:
				setTagsMatch(TAGS_MATCH_EDEFAULT);
				return;
			case DrawioPackage.TARGETED_ACTION__EXCLUDE_CELLS:
				getExcludeCells().clear();
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
			case DrawioPackage.TARGETED_ACTION__CELLS:
				return !getCells().isEmpty();
			case DrawioPackage.TARGETED_ACTION__ALL_CELLS:
				return isAllCells() != ALL_CELLS_EDEFAULT;
			case DrawioPackage.TARGETED_ACTION__LAYERS:
				return !getLayers().isEmpty();
			case DrawioPackage.TARGETED_ACTION__TAGS:
				return !getTags().isEmpty();
			case DrawioPackage.TARGETED_ACTION__TAGS_MATCH:
				return getTagsMatch() != TAGS_MATCH_EDEFAULT;
			case DrawioPackage.TARGETED_ACTION__EXCLUDE_CELLS:
				return !getExcludeCells().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetedActionImpl
