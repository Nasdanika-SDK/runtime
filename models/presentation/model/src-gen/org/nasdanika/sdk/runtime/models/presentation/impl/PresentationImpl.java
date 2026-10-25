/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.common.DerivedSubsetEList;

import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

import org.nasdanika.sdk.runtime.models.diagram.impl.DiagramImpl;

import org.nasdanika.sdk.runtime.models.presentation.MasterSlide;
import org.nasdanika.sdk.runtime.models.presentation.Presentation;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.Slide;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl#getSlides <em>Slides</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl#getMasterSlides <em>Master Slides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationImpl extends DiagramImpl implements Presentation {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eDynamicGet(PresentationPackage.PRESENTATION__WIDTH, PresentationPackage.Literals.PRESENTATION__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eDynamicSet(PresentationPackage.PRESENTATION__WIDTH, PresentationPackage.Literals.PRESENTATION__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eDynamicGet(PresentationPackage.PRESENTATION__HEIGHT, PresentationPackage.Literals.PRESENTATION__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eDynamicSet(PresentationPackage.PRESENTATION__HEIGHT, PresentationPackage.Literals.PRESENTATION__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slide> getSlides() {
		return new DerivedSubsetEList<Slide>(
			Slide.class, 
			((InternalEObject) this), 
			PresentationPackage.PRESENTATION__SLIDES, 
			DiagramPackage.DIAGRAM_ELEMENT__CHILDREN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterSlide> getMasterSlides() {
		return new DerivedSubsetEList<MasterSlide>(
			MasterSlide.class, 
			((InternalEObject) this), 
			PresentationPackage.PRESENTATION__MASTER_SLIDES, 
			DiagramPackage.DIAGRAM_ELEMENT__CHILDREN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.PRESENTATION__WIDTH:
				return getWidth();
			case PresentationPackage.PRESENTATION__HEIGHT:
				return getHeight();
			case PresentationPackage.PRESENTATION__SLIDES:
				return getSlides();
			case PresentationPackage.PRESENTATION__MASTER_SLIDES:
				return getMasterSlides();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PresentationPackage.PRESENTATION__WIDTH:
				setWidth((Double)newValue);
				return;
			case PresentationPackage.PRESENTATION__HEIGHT:
				setHeight((Double)newValue);
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
			case PresentationPackage.PRESENTATION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PresentationPackage.PRESENTATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case PresentationPackage.PRESENTATION__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case PresentationPackage.PRESENTATION__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case PresentationPackage.PRESENTATION__SLIDES:
				return !getSlides().isEmpty();
			case PresentationPackage.PRESENTATION__MASTER_SLIDES:
				return !getMasterSlides().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresentationImpl
