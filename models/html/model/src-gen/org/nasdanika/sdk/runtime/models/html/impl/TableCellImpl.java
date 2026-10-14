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
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.TableCell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl#isHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.TableCellImpl#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends ElementImpl implements TableCell {
	/**
	 * The default value of the '{@link #isHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final int COLSPAN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWSPAN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADERS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContents() {
		return (EList<Node>)eDynamicGet(HtmlPackage.TABLE_CELL__CONTENTS, HtmlPackage.Literals.CONTAINER__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeader() {
		return (Boolean)eDynamicGet(HtmlPackage.TABLE_CELL__HEADER, HtmlPackage.Literals.TABLE_CELL__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(boolean newHeader) {
		eDynamicSet(HtmlPackage.TABLE_CELL__HEADER, HtmlPackage.Literals.TABLE_CELL__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColspan() {
		return (Integer)eDynamicGet(HtmlPackage.TABLE_CELL__COLSPAN, HtmlPackage.Literals.TABLE_CELL__COLSPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(int newColspan) {
		eDynamicSet(HtmlPackage.TABLE_CELL__COLSPAN, HtmlPackage.Literals.TABLE_CELL__COLSPAN, newColspan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowspan() {
		return (Integer)eDynamicGet(HtmlPackage.TABLE_CELL__ROWSPAN, HtmlPackage.Literals.TABLE_CELL__ROWSPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(int newRowspan) {
		eDynamicSet(HtmlPackage.TABLE_CELL__ROWSPAN, HtmlPackage.Literals.TABLE_CELL__ROWSPAN, newRowspan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return (String)eDynamicGet(HtmlPackage.TABLE_CELL__SCOPE, HtmlPackage.Literals.TABLE_CELL__SCOPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		eDynamicSet(HtmlPackage.TABLE_CELL__SCOPE, HtmlPackage.Literals.TABLE_CELL__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaders() {
		return (String)eDynamicGet(HtmlPackage.TABLE_CELL__HEADERS, HtmlPackage.Literals.TABLE_CELL__HEADERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaders(String newHeaders) {
		eDynamicSet(HtmlPackage.TABLE_CELL__HEADERS, HtmlPackage.Literals.TABLE_CELL__HEADERS, newHeaders);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		String _xifexpression = null;
		boolean _isHeader = this.isHeader();
		if (_isHeader) {
			_xifexpression = "th";
		}
		else {
			_xifexpression = "td";
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.TABLE_CELL__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.TABLE_CELL__CONTENTS:
				return getContents();
			case HtmlPackage.TABLE_CELL__HEADER:
				return isHeader();
			case HtmlPackage.TABLE_CELL__COLSPAN:
				return getColspan();
			case HtmlPackage.TABLE_CELL__ROWSPAN:
				return getRowspan();
			case HtmlPackage.TABLE_CELL__SCOPE:
				return getScope();
			case HtmlPackage.TABLE_CELL__HEADERS:
				return getHeaders();
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
			case HtmlPackage.TABLE_CELL__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Node>)newValue);
				return;
			case HtmlPackage.TABLE_CELL__HEADER:
				setHeader((Boolean)newValue);
				return;
			case HtmlPackage.TABLE_CELL__COLSPAN:
				setColspan((Integer)newValue);
				return;
			case HtmlPackage.TABLE_CELL__ROWSPAN:
				setRowspan((Integer)newValue);
				return;
			case HtmlPackage.TABLE_CELL__SCOPE:
				setScope((String)newValue);
				return;
			case HtmlPackage.TABLE_CELL__HEADERS:
				setHeaders((String)newValue);
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
			case HtmlPackage.TABLE_CELL__CONTENTS:
				getContents().clear();
				return;
			case HtmlPackage.TABLE_CELL__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case HtmlPackage.TABLE_CELL__COLSPAN:
				setColspan(COLSPAN_EDEFAULT);
				return;
			case HtmlPackage.TABLE_CELL__ROWSPAN:
				setRowspan(ROWSPAN_EDEFAULT);
				return;
			case HtmlPackage.TABLE_CELL__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case HtmlPackage.TABLE_CELL__HEADERS:
				setHeaders(HEADERS_EDEFAULT);
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
			case HtmlPackage.TABLE_CELL__CONTENTS:
				return !getContents().isEmpty();
			case HtmlPackage.TABLE_CELL__HEADER:
				return isHeader() != HEADER_EDEFAULT;
			case HtmlPackage.TABLE_CELL__COLSPAN:
				return getColspan() != COLSPAN_EDEFAULT;
			case HtmlPackage.TABLE_CELL__ROWSPAN:
				return getRowspan() != ROWSPAN_EDEFAULT;
			case HtmlPackage.TABLE_CELL__SCOPE:
				return SCOPE_EDEFAULT == null ? getScope() != null : !SCOPE_EDEFAULT.equals(getScope());
			case HtmlPackage.TABLE_CELL__HEADERS:
				return HEADERS_EDEFAULT == null ? getHeaders() != null : !HEADERS_EDEFAULT.equals(getHeaders());
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
		if (baseClass == org.nasdanika.sdk.runtime.models.html.Container.class) {
			switch (derivedFeatureID) {
				case HtmlPackage.TABLE_CELL__CONTENTS: return HtmlPackage.CONTAINER__CONTENTS;
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
		if (baseClass == org.nasdanika.sdk.runtime.models.html.Container.class) {
			switch (baseFeatureID) {
				case HtmlPackage.CONTAINER__CONTENTS: return HtmlPackage.TABLE_CELL__CONTENTS;
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
			case HtmlPackage.TABLE_CELL___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableCellImpl
