/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.ItemList;
import org.nasdanika.sdk.runtime.models.html.ListItem;
import org.nasdanika.sdk.runtime.models.html.OrderedList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl#isReversed <em>Reversed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.OrderedListImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderedListImpl extends ElementImpl implements OrderedList {
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isReversed() <em>Reversed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReversed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVERSED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.ORDERED_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ListItem> getItems() {
		return (EList<ListItem>)eDynamicGet(HtmlPackage.ORDERED_LIST__ITEMS, HtmlPackage.Literals.ITEM_LIST__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return (Integer)eDynamicGet(HtmlPackage.ORDERED_LIST__START, HtmlPackage.Literals.ORDERED_LIST__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		eDynamicSet(HtmlPackage.ORDERED_LIST__START, HtmlPackage.Literals.ORDERED_LIST__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReversed() {
		return (Boolean)eDynamicGet(HtmlPackage.ORDERED_LIST__REVERSED, HtmlPackage.Literals.ORDERED_LIST__REVERSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReversed(boolean newReversed) {
		eDynamicSet(HtmlPackage.ORDERED_LIST__REVERSED, HtmlPackage.Literals.ORDERED_LIST__REVERSED, newReversed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(HtmlPackage.ORDERED_LIST__TYPE, HtmlPackage.Literals.ORDERED_LIST__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(HtmlPackage.ORDERED_LIST__TYPE, HtmlPackage.Literals.ORDERED_LIST__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "ol";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.ORDERED_LIST__ITEMS:
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
			case HtmlPackage.ORDERED_LIST__ITEMS:
				return getItems();
			case HtmlPackage.ORDERED_LIST__START:
				return getStart();
			case HtmlPackage.ORDERED_LIST__REVERSED:
				return isReversed();
			case HtmlPackage.ORDERED_LIST__TYPE:
				return getType();
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
			case HtmlPackage.ORDERED_LIST__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ListItem>)newValue);
				return;
			case HtmlPackage.ORDERED_LIST__START:
				setStart((Integer)newValue);
				return;
			case HtmlPackage.ORDERED_LIST__REVERSED:
				setReversed((Boolean)newValue);
				return;
			case HtmlPackage.ORDERED_LIST__TYPE:
				setType((String)newValue);
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
			case HtmlPackage.ORDERED_LIST__ITEMS:
				getItems().clear();
				return;
			case HtmlPackage.ORDERED_LIST__START:
				setStart(START_EDEFAULT);
				return;
			case HtmlPackage.ORDERED_LIST__REVERSED:
				setReversed(REVERSED_EDEFAULT);
				return;
			case HtmlPackage.ORDERED_LIST__TYPE:
				setType(TYPE_EDEFAULT);
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
			case HtmlPackage.ORDERED_LIST__ITEMS:
				return !getItems().isEmpty();
			case HtmlPackage.ORDERED_LIST__START:
				return getStart() != START_EDEFAULT;
			case HtmlPackage.ORDERED_LIST__REVERSED:
				return isReversed() != REVERSED_EDEFAULT;
			case HtmlPackage.ORDERED_LIST__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
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
		if (baseClass == ItemList.class) {
			switch (derivedFeatureID) {
				case HtmlPackage.ORDERED_LIST__ITEMS: return HtmlPackage.ITEM_LIST__ITEMS;
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
		if (baseClass == ItemList.class) {
			switch (baseFeatureID) {
				case HtmlPackage.ITEM_LIST__ITEMS: return HtmlPackage.ORDERED_LIST__ITEMS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HtmlPackage.ORDERED_LIST___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrderedListImpl
