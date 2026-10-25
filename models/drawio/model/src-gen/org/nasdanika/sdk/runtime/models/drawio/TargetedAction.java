/**
 */
package org.nasdanika.sdk.runtime.models.drawio;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Targeted Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base for every action that selects the cells it applies to.
 *  * The selector is the reason this is worth modelling rather than storing as a
 * string: 'cells', 'layers', and 'tags' are identifiers in the JSON, and as
 * references they survive a rename, break a build when the target is deleted, and
 * let a generator say "animate the elements depicting this service" instead of
 * hand-assembling a list of ids.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getCells <em>Cells</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#isAllCells <em>All Cells</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTagsMatch <em>Tags Match</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getExcludeCells <em>Exclude Cells</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction()
 * @model abstract="true"
 * @generated
 */
public interface TargetedAction extends Action {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Cells the action applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cells</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction_Cells()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getCells();

	/**
	 * Returns the value of the '<em><b>All Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Select every cell - the JSON "cells": ["*"].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Cells</em>' attribute.
	 * @see #setAllCells(boolean)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction_AllCells()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllCells();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#isAllCells <em>All Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Cells</em>' attribute.
	 * @see #isAllCells()
	 * @generated
	 */
	void setAllCells(boolean value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Layers the action applies to; descendants are included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layers</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction_Layers()
	 * @model
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Tags the action applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Tags Match</b></em>' attribute.
	 * The default value is <code>"OR"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.sdk.runtime.models.drawio.TagsMatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags Match</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsMatch
	 * @see #setTagsMatch(TagsMatch)
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction_TagsMatch()
	 * @model default="OR" unique="false"
	 * @generated
	 */
	TagsMatch getTagsMatch();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.drawio.TargetedAction#getTagsMatch <em>Tags Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags Match</em>' attribute.
	 * @see org.nasdanika.sdk.runtime.models.drawio.TagsMatch
	 * @see #getTagsMatch()
	 * @generated
	 */
	void setTagsMatch(TagsMatch value);

	/**
	 * Returns the value of the '<em><b>Exclude Cells</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.drawio.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Removed from the result of the above.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Cells</em>' reference list.
	 * @see org.nasdanika.sdk.runtime.models.drawio.DrawioPackage#getTargetedAction_ExcludeCells()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getExcludeCells();

} // TargetedAction
