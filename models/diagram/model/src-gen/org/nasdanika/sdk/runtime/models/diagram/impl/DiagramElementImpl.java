/**
 */
package org.nasdanika.sdk.runtime.models.diagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.core.Attributed;
import org.nasdanika.sdk.runtime.models.core.CorePackage;

import org.nasdanika.sdk.runtime.models.core.impl.NamedElementImpl;

import org.nasdanika.sdk.runtime.models.diagram.DiagramElement;
import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.diagram.impl.DiagramElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.diagram.impl.DiagramElementImpl#getSemanticElements <em>Semantic Elements</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.diagram.impl.DiagramElementImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends NamedElementImpl implements DiagramElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getAttributes() {
		return (EMap<String, String>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES, CorePackage.Literals.ATTRIBUTED__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EObject> getSemanticElements() {
		return (EList<EObject>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS, DiagramPackage.Literals.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DiagramElement> getChildren() {
		return (EList<DiagramElement>)eDynamicGet(DiagramPackage.DIAGRAM_ELEMENT__CHILDREN, DiagramPackage.Literals.DIAGRAM_ELEMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES:
				if (coreType) return getAttributes();
				else return getAttributes().map();
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				return getSemanticElements();
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				return getChildren();
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
			case DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES:
				((EStructuralFeature.Setting)getAttributes()).set(newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				getSemanticElements().clear();
				getSemanticElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends DiagramElement>)newValue);
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
			case DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				getSemanticElements().clear();
				return;
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				getChildren().clear();
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
			case DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__SEMANTIC_ELEMENTS:
				return !getSemanticElements().isEmpty();
			case DiagramPackage.DIAGRAM_ELEMENT__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Attributed.class) {
			switch (derivedFeatureID) {
				case DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES: return CorePackage.ATTRIBUTED__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Attributed.class) {
			switch (baseFeatureID) {
				case CorePackage.ATTRIBUTED__ATTRIBUTES: return DiagramPackage.DIAGRAM_ELEMENT__ATTRIBUTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiagramElementImpl
