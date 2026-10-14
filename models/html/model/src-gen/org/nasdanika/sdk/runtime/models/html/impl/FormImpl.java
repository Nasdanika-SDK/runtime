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

import org.nasdanika.sdk.runtime.models.html.Form;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl#getEnctype <em>Enctype</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.FormImpl#isNovalidate <em>Novalidate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends ElementImpl implements Form {
	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnctype() <em>Enctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnctype()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCTYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isNovalidate() <em>Novalidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNovalidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOVALIDATE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContents() {
		return (EList<Node>)eDynamicGet(HtmlPackage.FORM__CONTENTS, HtmlPackage.Literals.CONTAINER__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return (String)eDynamicGet(HtmlPackage.FORM__ACTION, HtmlPackage.Literals.FORM__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		eDynamicSet(HtmlPackage.FORM__ACTION, HtmlPackage.Literals.FORM__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return (String)eDynamicGet(HtmlPackage.FORM__METHOD, HtmlPackage.Literals.FORM__METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		eDynamicSet(HtmlPackage.FORM__METHOD, HtmlPackage.Literals.FORM__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnctype() {
		return (String)eDynamicGet(HtmlPackage.FORM__ENCTYPE, HtmlPackage.Literals.FORM__ENCTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnctype(String newEnctype) {
		eDynamicSet(HtmlPackage.FORM__ENCTYPE, HtmlPackage.Literals.FORM__ENCTYPE, newEnctype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eDynamicGet(HtmlPackage.FORM__TARGET, HtmlPackage.Literals.FORM__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eDynamicSet(HtmlPackage.FORM__TARGET, HtmlPackage.Literals.FORM__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNovalidate() {
		return (Boolean)eDynamicGet(HtmlPackage.FORM__NOVALIDATE, HtmlPackage.Literals.FORM__NOVALIDATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNovalidate(boolean newNovalidate) {
		eDynamicSet(HtmlPackage.FORM__NOVALIDATE, HtmlPackage.Literals.FORM__NOVALIDATE, newNovalidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "form";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.FORM__CONTENTS:
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
			case HtmlPackage.FORM__CONTENTS:
				return getContents();
			case HtmlPackage.FORM__ACTION:
				return getAction();
			case HtmlPackage.FORM__METHOD:
				return getMethod();
			case HtmlPackage.FORM__ENCTYPE:
				return getEnctype();
			case HtmlPackage.FORM__TARGET:
				return getTarget();
			case HtmlPackage.FORM__NOVALIDATE:
				return isNovalidate();
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
			case HtmlPackage.FORM__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Node>)newValue);
				return;
			case HtmlPackage.FORM__ACTION:
				setAction((String)newValue);
				return;
			case HtmlPackage.FORM__METHOD:
				setMethod((String)newValue);
				return;
			case HtmlPackage.FORM__ENCTYPE:
				setEnctype((String)newValue);
				return;
			case HtmlPackage.FORM__TARGET:
				setTarget((String)newValue);
				return;
			case HtmlPackage.FORM__NOVALIDATE:
				setNovalidate((Boolean)newValue);
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
			case HtmlPackage.FORM__CONTENTS:
				getContents().clear();
				return;
			case HtmlPackage.FORM__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case HtmlPackage.FORM__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case HtmlPackage.FORM__ENCTYPE:
				setEnctype(ENCTYPE_EDEFAULT);
				return;
			case HtmlPackage.FORM__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case HtmlPackage.FORM__NOVALIDATE:
				setNovalidate(NOVALIDATE_EDEFAULT);
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
			case HtmlPackage.FORM__CONTENTS:
				return !getContents().isEmpty();
			case HtmlPackage.FORM__ACTION:
				return ACTION_EDEFAULT == null ? getAction() != null : !ACTION_EDEFAULT.equals(getAction());
			case HtmlPackage.FORM__METHOD:
				return METHOD_EDEFAULT == null ? getMethod() != null : !METHOD_EDEFAULT.equals(getMethod());
			case HtmlPackage.FORM__ENCTYPE:
				return ENCTYPE_EDEFAULT == null ? getEnctype() != null : !ENCTYPE_EDEFAULT.equals(getEnctype());
			case HtmlPackage.FORM__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
			case HtmlPackage.FORM__NOVALIDATE:
				return isNovalidate() != NOVALIDATE_EDEFAULT;
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
				case HtmlPackage.FORM__CONTENTS: return HtmlPackage.CONTAINER__CONTENTS;
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
				case HtmlPackage.CONTAINER__CONTENTS: return HtmlPackage.FORM__CONTENTS;
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
			case HtmlPackage.FORM___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FormImpl
