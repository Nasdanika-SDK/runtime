/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.presentation.Paragraph;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.TextShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.TextShapeImpl#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextShapeImpl extends ShapeImpl implements TextShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.TEXT_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Paragraph> getParagraphs() {
		return (EList<Paragraph>)eDynamicGet(PresentationPackage.TEXT_SHAPE__PARAGRAPHS, PresentationPackage.Literals.TEXT_SHAPE__PARAGRAPHS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.TEXT_SHAPE__PARAGRAPHS:
				return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.TEXT_SHAPE__PARAGRAPHS:
				return getParagraphs();
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
			case PresentationPackage.TEXT_SHAPE__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
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
			case PresentationPackage.TEXT_SHAPE__PARAGRAPHS:
				getParagraphs().clear();
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
			case PresentationPackage.TEXT_SHAPE__PARAGRAPHS:
				return !getParagraphs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextShapeImpl
