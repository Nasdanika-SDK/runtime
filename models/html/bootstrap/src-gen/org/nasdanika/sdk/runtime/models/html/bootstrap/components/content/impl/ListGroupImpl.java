/**
 */
package org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.bootstrap.Breakpoint;

import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ContentPackage;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroup;
import org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.ListGroupItem;

import org.nasdanika.sdk.runtime.models.html.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl#isFlush <em>Flush</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl#isNumbered <em>Numbered</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl#getHorizontalFrom <em>Horizontal From</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.bootstrap.components.content.impl.ListGroupImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListGroupImpl extends BootstrapElementImpl implements ListGroup {
	/**
	 * The default value of the '{@link #isFlush() <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlush()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUSH_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNumbered() <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNumbered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NUMBERED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getHorizontalFrom() <em>Horizontal From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Breakpoint HORIZONTAL_FROM_EDEFAULT = Breakpoint.XS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.LIST_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlush() {
		return (Boolean)eDynamicGet(ContentPackage.LIST_GROUP__FLUSH, ContentPackage.Literals.LIST_GROUP__FLUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlush(boolean newFlush) {
		eDynamicSet(ContentPackage.LIST_GROUP__FLUSH, ContentPackage.Literals.LIST_GROUP__FLUSH, newFlush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNumbered() {
		return (Boolean)eDynamicGet(ContentPackage.LIST_GROUP__NUMBERED, ContentPackage.Literals.LIST_GROUP__NUMBERED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbered(boolean newNumbered) {
		eDynamicSet(ContentPackage.LIST_GROUP__NUMBERED, ContentPackage.Literals.LIST_GROUP__NUMBERED, newNumbered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizontal() {
		return (Boolean)eDynamicGet(ContentPackage.LIST_GROUP__HORIZONTAL, ContentPackage.Literals.LIST_GROUP__HORIZONTAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontal(boolean newHorizontal) {
		eDynamicSet(ContentPackage.LIST_GROUP__HORIZONTAL, ContentPackage.Literals.LIST_GROUP__HORIZONTAL, newHorizontal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoint getHorizontalFrom() {
		return (Breakpoint)eDynamicGet(ContentPackage.LIST_GROUP__HORIZONTAL_FROM, ContentPackage.Literals.LIST_GROUP__HORIZONTAL_FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalFrom(Breakpoint newHorizontalFrom) {
		eDynamicSet(ContentPackage.LIST_GROUP__HORIZONTAL_FROM, ContentPackage.Literals.LIST_GROUP__HORIZONTAL_FROM, newHorizontalFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHorizontalFrom() {
		eDynamicUnset(ContentPackage.LIST_GROUP__HORIZONTAL_FROM, ContentPackage.Literals.LIST_GROUP__HORIZONTAL_FROM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHorizontalFrom() {
		return eDynamicIsSet(ContentPackage.LIST_GROUP__HORIZONTAL_FROM, ContentPackage.Literals.LIST_GROUP__HORIZONTAL_FROM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ListGroupItem> getItems() {
		return (EList<ListGroupItem>)eDynamicGet(ContentPackage.LIST_GROUP__ITEMS, ContentPackage.Literals.LIST_GROUP__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.LIST_GROUP__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ContentPackage.LIST_GROUP__FLUSH:
				return isFlush();
			case ContentPackage.LIST_GROUP__NUMBERED:
				return isNumbered();
			case ContentPackage.LIST_GROUP__HORIZONTAL:
				return isHorizontal();
			case ContentPackage.LIST_GROUP__HORIZONTAL_FROM:
				return getHorizontalFrom();
			case ContentPackage.LIST_GROUP__ITEMS:
				return getItems();
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
			case ContentPackage.LIST_GROUP__FLUSH:
				setFlush((Boolean)newValue);
				return;
			case ContentPackage.LIST_GROUP__NUMBERED:
				setNumbered((Boolean)newValue);
				return;
			case ContentPackage.LIST_GROUP__HORIZONTAL:
				setHorizontal((Boolean)newValue);
				return;
			case ContentPackage.LIST_GROUP__HORIZONTAL_FROM:
				setHorizontalFrom((Breakpoint)newValue);
				return;
			case ContentPackage.LIST_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ListGroupItem>)newValue);
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
			case ContentPackage.LIST_GROUP__FLUSH:
				setFlush(FLUSH_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP__NUMBERED:
				setNumbered(NUMBERED_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP__HORIZONTAL:
				setHorizontal(HORIZONTAL_EDEFAULT);
				return;
			case ContentPackage.LIST_GROUP__HORIZONTAL_FROM:
				unsetHorizontalFrom();
				return;
			case ContentPackage.LIST_GROUP__ITEMS:
				getItems().clear();
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
			case ContentPackage.LIST_GROUP__FLUSH:
				return isFlush() != FLUSH_EDEFAULT;
			case ContentPackage.LIST_GROUP__NUMBERED:
				return isNumbered() != NUMBERED_EDEFAULT;
			case ContentPackage.LIST_GROUP__HORIZONTAL:
				return isHorizontal() != HORIZONTAL_EDEFAULT;
			case ContentPackage.LIST_GROUP__HORIZONTAL_FROM:
				return isSetHorizontalFrom();
			case ContentPackage.LIST_GROUP__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListGroupImpl
