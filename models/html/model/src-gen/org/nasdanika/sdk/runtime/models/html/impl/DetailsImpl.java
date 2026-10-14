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

import org.nasdanika.sdk.runtime.models.html.Details;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.Summary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DetailsImpl#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetailsImpl extends ElementImpl implements Details {
	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContents() {
		return (EList<Node>)eDynamicGet(HtmlPackage.DETAILS__CONTENTS, HtmlPackage.Literals.CONTAINER__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpen() {
		return (Boolean)eDynamicGet(HtmlPackage.DETAILS__OPEN, HtmlPackage.Literals.DETAILS__OPEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(boolean newOpen) {
		eDynamicSet(HtmlPackage.DETAILS__OPEN, HtmlPackage.Literals.DETAILS__OPEN, newOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Summary getSummary() {
		return (Summary)eDynamicGet(HtmlPackage.DETAILS__SUMMARY, HtmlPackage.Literals.DETAILS__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSummary(Summary newSummary, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSummary, HtmlPackage.DETAILS__SUMMARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(Summary newSummary) {
		eDynamicSet(HtmlPackage.DETAILS__SUMMARY, HtmlPackage.Literals.DETAILS__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "details";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.DETAILS__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case HtmlPackage.DETAILS__SUMMARY:
				return basicSetSummary(null, msgs);
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
			case HtmlPackage.DETAILS__CONTENTS:
				return getContents();
			case HtmlPackage.DETAILS__OPEN:
				return isOpen();
			case HtmlPackage.DETAILS__SUMMARY:
				return getSummary();
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
			case HtmlPackage.DETAILS__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Node>)newValue);
				return;
			case HtmlPackage.DETAILS__OPEN:
				setOpen((Boolean)newValue);
				return;
			case HtmlPackage.DETAILS__SUMMARY:
				setSummary((Summary)newValue);
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
			case HtmlPackage.DETAILS__CONTENTS:
				getContents().clear();
				return;
			case HtmlPackage.DETAILS__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case HtmlPackage.DETAILS__SUMMARY:
				setSummary((Summary)null);
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
			case HtmlPackage.DETAILS__CONTENTS:
				return !getContents().isEmpty();
			case HtmlPackage.DETAILS__OPEN:
				return isOpen() != OPEN_EDEFAULT;
			case HtmlPackage.DETAILS__SUMMARY:
				return getSummary() != null;
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
				case HtmlPackage.DETAILS__CONTENTS: return HtmlPackage.CONTAINER__CONTENTS;
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
				case HtmlPackage.CONTAINER__CONTENTS: return HtmlPackage.DETAILS__CONTENTS;
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
			case HtmlPackage.DETAILS___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DetailsImpl
