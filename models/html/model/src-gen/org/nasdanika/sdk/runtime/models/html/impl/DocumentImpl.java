/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.html.Body;
import org.nasdanika.sdk.runtime.models.html.Document;
import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl#getDoctype <em>Doctype</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.DocumentImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends ElementImpl implements Document {
	/**
	 * The default value of the '{@link #getDoctype() <em>Doctype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctype()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCTYPE_EDEFAULT = "html";

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoctype() {
		return (String)eDynamicGet(HtmlPackage.DOCUMENT__DOCTYPE, HtmlPackage.Literals.DOCUMENT__DOCTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoctype(String newDoctype) {
		eDynamicSet(HtmlPackage.DOCUMENT__DOCTYPE, HtmlPackage.Literals.DOCUMENT__DOCTYPE, newDoctype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return (String)eDynamicGet(HtmlPackage.DOCUMENT__LANG, HtmlPackage.Literals.DOCUMENT__LANG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		eDynamicSet(HtmlPackage.DOCUMENT__LANG, HtmlPackage.Literals.DOCUMENT__LANG, newLang);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head getHead() {
		return (Head)eDynamicGet(HtmlPackage.DOCUMENT__HEAD, HtmlPackage.Literals.DOCUMENT__HEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Head newHead, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHead, HtmlPackage.DOCUMENT__HEAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Head newHead) {
		eDynamicSet(HtmlPackage.DOCUMENT__HEAD, HtmlPackage.Literals.DOCUMENT__HEAD, newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body getBody() {
		return (Body)eDynamicGet(HtmlPackage.DOCUMENT__BODY, HtmlPackage.Literals.DOCUMENT__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Body newBody, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBody, HtmlPackage.DOCUMENT__BODY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Body newBody) {
		eDynamicSet(HtmlPackage.DOCUMENT__BODY, HtmlPackage.Literals.DOCUMENT__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "html";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.DOCUMENT__HEAD:
				return basicSetHead(null, msgs);
			case HtmlPackage.DOCUMENT__BODY:
				return basicSetBody(null, msgs);
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
			case HtmlPackage.DOCUMENT__DOCTYPE:
				return getDoctype();
			case HtmlPackage.DOCUMENT__LANG:
				return getLang();
			case HtmlPackage.DOCUMENT__HEAD:
				return getHead();
			case HtmlPackage.DOCUMENT__BODY:
				return getBody();
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
			case HtmlPackage.DOCUMENT__DOCTYPE:
				setDoctype((String)newValue);
				return;
			case HtmlPackage.DOCUMENT__LANG:
				setLang((String)newValue);
				return;
			case HtmlPackage.DOCUMENT__HEAD:
				setHead((Head)newValue);
				return;
			case HtmlPackage.DOCUMENT__BODY:
				setBody((Body)newValue);
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
			case HtmlPackage.DOCUMENT__DOCTYPE:
				setDoctype(DOCTYPE_EDEFAULT);
				return;
			case HtmlPackage.DOCUMENT__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case HtmlPackage.DOCUMENT__HEAD:
				setHead((Head)null);
				return;
			case HtmlPackage.DOCUMENT__BODY:
				setBody((Body)null);
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
			case HtmlPackage.DOCUMENT__DOCTYPE:
				return DOCTYPE_EDEFAULT == null ? getDoctype() != null : !DOCTYPE_EDEFAULT.equals(getDoctype());
			case HtmlPackage.DOCUMENT__LANG:
				return LANG_EDEFAULT == null ? getLang() != null : !LANG_EDEFAULT.equals(getLang());
			case HtmlPackage.DOCUMENT__HEAD:
				return getHead() != null;
			case HtmlPackage.DOCUMENT__BODY:
				return getBody() != null;
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
			case HtmlPackage.DOCUMENT___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DocumentImpl
