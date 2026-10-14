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

import org.nasdanika.sdk.runtime.models.html.Fieldset;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Legend;
import org.nasdanika.sdk.runtime.models.html.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fieldset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FieldsetImpl#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldsetImpl extends ElementImpl implements Fieldset {
	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.FIELDSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContents() {
		return (EList<Node>)eDynamicGet(HtmlPackage.FIELDSET__CONTENTS, HtmlPackage.Literals.CONTAINER__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(HtmlPackage.FIELDSET__DISABLED, HtmlPackage.Literals.FIELDSET__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(HtmlPackage.FIELDSET__DISABLED, HtmlPackage.Literals.FIELDSET__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legend getLegend() {
		return (Legend)eDynamicGet(HtmlPackage.FIELDSET__LEGEND, HtmlPackage.Literals.FIELDSET__LEGEND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegend(Legend newLegend, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLegend, HtmlPackage.FIELDSET__LEGEND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(Legend newLegend) {
		eDynamicSet(HtmlPackage.FIELDSET__LEGEND, HtmlPackage.Literals.FIELDSET__LEGEND, newLegend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "fieldset";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.FIELDSET__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case HtmlPackage.FIELDSET__LEGEND:
				return basicSetLegend(null, msgs);
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
			case HtmlPackage.FIELDSET__CONTENTS:
				return getContents();
			case HtmlPackage.FIELDSET__DISABLED:
				return isDisabled();
			case HtmlPackage.FIELDSET__LEGEND:
				return getLegend();
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
			case HtmlPackage.FIELDSET__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Node>)newValue);
				return;
			case HtmlPackage.FIELDSET__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case HtmlPackage.FIELDSET__LEGEND:
				setLegend((Legend)newValue);
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
			case HtmlPackage.FIELDSET__CONTENTS:
				getContents().clear();
				return;
			case HtmlPackage.FIELDSET__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case HtmlPackage.FIELDSET__LEGEND:
				setLegend((Legend)null);
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
			case HtmlPackage.FIELDSET__CONTENTS:
				return !getContents().isEmpty();
			case HtmlPackage.FIELDSET__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case HtmlPackage.FIELDSET__LEGEND:
				return getLegend() != null;
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
				case HtmlPackage.FIELDSET__CONTENTS: return HtmlPackage.CONTAINER__CONTENTS;
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
				case HtmlPackage.CONTAINER__CONTENTS: return HtmlPackage.FIELDSET__CONTENTS;
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
			case HtmlPackage.FIELDSET___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FieldsetImpl
