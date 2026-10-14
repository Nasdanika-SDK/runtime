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

import org.nasdanika.sdk.runtime.models.html.Caption;
import org.nasdanika.sdk.runtime.models.html.ColumnGroup;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Table;
import org.nasdanika.sdk.runtime.models.html.TableBody;
import org.nasdanika.sdk.runtime.models.html.TableFoot;
import org.nasdanika.sdk.runtime.models.html.TableHead;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl#getColumnGroups <em>Column Groups</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableImpl#getFoot <em>Foot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends ElementImpl implements Table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caption getCaption() {
		return (Caption)eDynamicGet(HtmlPackage.TABLE__CAPTION, HtmlPackage.Literals.TABLE__CAPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(Caption newCaption, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCaption, HtmlPackage.TABLE__CAPTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(Caption newCaption) {
		eDynamicSet(HtmlPackage.TABLE__CAPTION, HtmlPackage.Literals.TABLE__CAPTION, newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ColumnGroup> getColumnGroups() {
		return (EList<ColumnGroup>)eDynamicGet(HtmlPackage.TABLE__COLUMN_GROUPS, HtmlPackage.Literals.TABLE__COLUMN_GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableHead getHead() {
		return (TableHead)eDynamicGet(HtmlPackage.TABLE__HEAD, HtmlPackage.Literals.TABLE__HEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(TableHead newHead, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHead, HtmlPackage.TABLE__HEAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(TableHead newHead) {
		eDynamicSet(HtmlPackage.TABLE__HEAD, HtmlPackage.Literals.TABLE__HEAD, newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TableBody> getBodies() {
		return (EList<TableBody>)eDynamicGet(HtmlPackage.TABLE__BODIES, HtmlPackage.Literals.TABLE__BODIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFoot getFoot() {
		return (TableFoot)eDynamicGet(HtmlPackage.TABLE__FOOT, HtmlPackage.Literals.TABLE__FOOT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoot(TableFoot newFoot, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFoot, HtmlPackage.TABLE__FOOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoot(TableFoot newFoot) {
		eDynamicSet(HtmlPackage.TABLE__FOOT, HtmlPackage.Literals.TABLE__FOOT, newFoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "table";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TABLE__CAPTION:
				return basicSetCaption(null, msgs);
			case HtmlPackage.TABLE__COLUMN_GROUPS:
				return ((InternalEList<?>)getColumnGroups()).basicRemove(otherEnd, msgs);
			case HtmlPackage.TABLE__HEAD:
				return basicSetHead(null, msgs);
			case HtmlPackage.TABLE__BODIES:
				return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
			case HtmlPackage.TABLE__FOOT:
				return basicSetFoot(null, msgs);
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
			case HtmlPackage.TABLE__CAPTION:
				return getCaption();
			case HtmlPackage.TABLE__COLUMN_GROUPS:
				return getColumnGroups();
			case HtmlPackage.TABLE__HEAD:
				return getHead();
			case HtmlPackage.TABLE__BODIES:
				return getBodies();
			case HtmlPackage.TABLE__FOOT:
				return getFoot();
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
			case HtmlPackage.TABLE__CAPTION:
				setCaption((Caption)newValue);
				return;
			case HtmlPackage.TABLE__COLUMN_GROUPS:
				getColumnGroups().clear();
				getColumnGroups().addAll((Collection<? extends ColumnGroup>)newValue);
				return;
			case HtmlPackage.TABLE__HEAD:
				setHead((TableHead)newValue);
				return;
			case HtmlPackage.TABLE__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends TableBody>)newValue);
				return;
			case HtmlPackage.TABLE__FOOT:
				setFoot((TableFoot)newValue);
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
			case HtmlPackage.TABLE__CAPTION:
				setCaption((Caption)null);
				return;
			case HtmlPackage.TABLE__COLUMN_GROUPS:
				getColumnGroups().clear();
				return;
			case HtmlPackage.TABLE__HEAD:
				setHead((TableHead)null);
				return;
			case HtmlPackage.TABLE__BODIES:
				getBodies().clear();
				return;
			case HtmlPackage.TABLE__FOOT:
				setFoot((TableFoot)null);
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
			case HtmlPackage.TABLE__CAPTION:
				return getCaption() != null;
			case HtmlPackage.TABLE__COLUMN_GROUPS:
				return !getColumnGroups().isEmpty();
			case HtmlPackage.TABLE__HEAD:
				return getHead() != null;
			case HtmlPackage.TABLE__BODIES:
				return !getBodies().isEmpty();
			case HtmlPackage.TABLE__FOOT:
				return getFoot() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HtmlPackage.TABLE___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableImpl
