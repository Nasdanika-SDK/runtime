/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.presentation.Cell;
import org.nasdanika.sdk.runtime.models.presentation.Paragraph;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl#getColumnSpan <em>Column Span</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.CellImpl#getRowSpan <em>Row Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * The default value of the '{@link #getColumnSpan() <em>Column Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_SPAN_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_SPAN_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Paragraph> getParagraphs() {
		return (EList<Paragraph>)eDynamicGet(PresentationPackage.CELL__PARAGRAPHS, PresentationPackage.Literals.CELL__PARAGRAPHS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnSpan() {
		return (Integer)eDynamicGet(PresentationPackage.CELL__COLUMN_SPAN, PresentationPackage.Literals.CELL__COLUMN_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSpan(int newColumnSpan) {
		eDynamicSet(PresentationPackage.CELL__COLUMN_SPAN, PresentationPackage.Literals.CELL__COLUMN_SPAN, newColumnSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowSpan() {
		return (Integer)eDynamicGet(PresentationPackage.CELL__ROW_SPAN, PresentationPackage.Literals.CELL__ROW_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowSpan(int newRowSpan) {
		eDynamicSet(PresentationPackage.CELL__ROW_SPAN, PresentationPackage.Literals.CELL__ROW_SPAN, newRowSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.CELL__PARAGRAPHS:
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
			case PresentationPackage.CELL__PARAGRAPHS:
				return getParagraphs();
			case PresentationPackage.CELL__COLUMN_SPAN:
				return getColumnSpan();
			case PresentationPackage.CELL__ROW_SPAN:
				return getRowSpan();
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
			case PresentationPackage.CELL__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case PresentationPackage.CELL__COLUMN_SPAN:
				setColumnSpan((Integer)newValue);
				return;
			case PresentationPackage.CELL__ROW_SPAN:
				setRowSpan((Integer)newValue);
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
			case PresentationPackage.CELL__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case PresentationPackage.CELL__COLUMN_SPAN:
				setColumnSpan(COLUMN_SPAN_EDEFAULT);
				return;
			case PresentationPackage.CELL__ROW_SPAN:
				setRowSpan(ROW_SPAN_EDEFAULT);
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
			case PresentationPackage.CELL__PARAGRAPHS:
				return !getParagraphs().isEmpty();
			case PresentationPackage.CELL__COLUMN_SPAN:
				return getColumnSpan() != COLUMN_SPAN_EDEFAULT;
			case PresentationPackage.CELL__ROW_SPAN:
				return getRowSpan() != ROW_SPAN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CellImpl
