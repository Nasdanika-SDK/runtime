/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Col;
import org.nasdanika.sdk.runtime.models.html.bootstrap.Row;
import org.nasdanika.sdk.runtime.models.html.bootstrap.RowColumns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.RowImpl#getColumnsPerRow <em>Columns Per Row</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.RowImpl#getGutter <em>Gutter</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.impl.RowImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends BootstrapElementImpl implements Row {
	/**
	 * The default value of the '{@link #getGutter() <em>Gutter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGutter()
	 * @generated
	 * @ordered
	 */
	protected static final int GUTTER_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RowColumns> getColumnsPerRow() {
		return (EList<RowColumns>)eDynamicGet(BootstrapPackage.ROW__COLUMNS_PER_ROW, BootstrapPackage.Literals.ROW__COLUMNS_PER_ROW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGutter() {
		return (Integer)eDynamicGet(BootstrapPackage.ROW__GUTTER, BootstrapPackage.Literals.ROW__GUTTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGutter(int newGutter) {
		eDynamicSet(BootstrapPackage.ROW__GUTTER, BootstrapPackage.Literals.ROW__GUTTER, newGutter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGutter() {
		eDynamicUnset(BootstrapPackage.ROW__GUTTER, BootstrapPackage.Literals.ROW__GUTTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGutter() {
		return eDynamicIsSet(BootstrapPackage.ROW__GUTTER, BootstrapPackage.Literals.ROW__GUTTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Col> getColumns() {
		return (EList<Col>)eDynamicGet(BootstrapPackage.ROW__COLUMNS, BootstrapPackage.Literals.ROW__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.ROW__COLUMNS_PER_ROW:
				return ((InternalEList<?>)getColumnsPerRow()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.ROW__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.ROW__COLUMNS_PER_ROW:
				return getColumnsPerRow();
			case BootstrapPackage.ROW__GUTTER:
				return getGutter();
			case BootstrapPackage.ROW__COLUMNS:
				return getColumns();
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
			case BootstrapPackage.ROW__COLUMNS_PER_ROW:
				getColumnsPerRow().clear();
				getColumnsPerRow().addAll((Collection<? extends RowColumns>)newValue);
				return;
			case BootstrapPackage.ROW__GUTTER:
				setGutter((Integer)newValue);
				return;
			case BootstrapPackage.ROW__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Col>)newValue);
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
			case BootstrapPackage.ROW__COLUMNS_PER_ROW:
				getColumnsPerRow().clear();
				return;
			case BootstrapPackage.ROW__GUTTER:
				unsetGutter();
				return;
			case BootstrapPackage.ROW__COLUMNS:
				getColumns().clear();
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
			case BootstrapPackage.ROW__COLUMNS_PER_ROW:
				return !getColumnsPerRow().isEmpty();
			case BootstrapPackage.ROW__GUTTER:
				return isSetGutter();
			case BootstrapPackage.ROW__COLUMNS:
				return !getColumns().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RowImpl
