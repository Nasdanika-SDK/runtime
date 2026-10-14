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

import org.nasdanika.sdk.runtime.models.html.Head;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.ImportMap;
import org.nasdanika.sdk.runtime.models.html.Link;
import org.nasdanika.sdk.runtime.models.html.Meta;
import org.nasdanika.sdk.runtime.models.html.Node;
import org.nasdanika.sdk.runtime.models.html.Script;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getMetas <em>Metas</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getStylesheets <em>Stylesheets</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getImportMap <em>Import Map</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.HeadImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadImpl extends ElementImpl implements Head {
	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = "utf-8";

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContents() {
		return (EList<Node>)eDynamicGet(HtmlPackage.HEAD__CONTENTS, HtmlPackage.Literals.CONTAINER__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharset() {
		return (String)eDynamicGet(HtmlPackage.HEAD__CHARSET, HtmlPackage.Literals.HEAD__CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharset(String newCharset) {
		eDynamicSet(HtmlPackage.HEAD__CHARSET, HtmlPackage.Literals.HEAD__CHARSET, newCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(HtmlPackage.HEAD__TITLE, HtmlPackage.Literals.HEAD__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(HtmlPackage.HEAD__TITLE, HtmlPackage.Literals.HEAD__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return (String)eDynamicGet(HtmlPackage.HEAD__BASE, HtmlPackage.Literals.HEAD__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		eDynamicSet(HtmlPackage.HEAD__BASE, HtmlPackage.Literals.HEAD__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Meta> getMetas() {
		return (EList<Meta>)eDynamicGet(HtmlPackage.HEAD__METAS, HtmlPackage.Literals.HEAD__METAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Link> getLinks() {
		return (EList<Link>)eDynamicGet(HtmlPackage.HEAD__LINKS, HtmlPackage.Literals.HEAD__LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Stylesheet> getStylesheets() {
		return (EList<Stylesheet>)eDynamicGet(HtmlPackage.HEAD__STYLESHEETS, HtmlPackage.Literals.HEAD__STYLESHEETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportMap getImportMap() {
		return (ImportMap)eDynamicGet(HtmlPackage.HEAD__IMPORT_MAP, HtmlPackage.Literals.HEAD__IMPORT_MAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportMap(ImportMap newImportMap, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImportMap, HtmlPackage.HEAD__IMPORT_MAP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportMap(ImportMap newImportMap) {
		eDynamicSet(HtmlPackage.HEAD__IMPORT_MAP, HtmlPackage.Literals.HEAD__IMPORT_MAP, newImportMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Script> getScripts() {
		return (EList<Script>)eDynamicGet(HtmlPackage.HEAD__SCRIPTS, HtmlPackage.Literals.HEAD__SCRIPTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "head";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.HEAD__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case HtmlPackage.HEAD__METAS:
				return ((InternalEList<?>)getMetas()).basicRemove(otherEnd, msgs);
			case HtmlPackage.HEAD__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case HtmlPackage.HEAD__STYLESHEETS:
				return ((InternalEList<?>)getStylesheets()).basicRemove(otherEnd, msgs);
			case HtmlPackage.HEAD__IMPORT_MAP:
				return basicSetImportMap(null, msgs);
			case HtmlPackage.HEAD__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.HEAD__CONTENTS:
				return getContents();
			case HtmlPackage.HEAD__CHARSET:
				return getCharset();
			case HtmlPackage.HEAD__TITLE:
				return getTitle();
			case HtmlPackage.HEAD__BASE:
				return getBase();
			case HtmlPackage.HEAD__METAS:
				return getMetas();
			case HtmlPackage.HEAD__LINKS:
				return getLinks();
			case HtmlPackage.HEAD__STYLESHEETS:
				return getStylesheets();
			case HtmlPackage.HEAD__IMPORT_MAP:
				return getImportMap();
			case HtmlPackage.HEAD__SCRIPTS:
				return getScripts();
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
			case HtmlPackage.HEAD__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Node>)newValue);
				return;
			case HtmlPackage.HEAD__CHARSET:
				setCharset((String)newValue);
				return;
			case HtmlPackage.HEAD__TITLE:
				setTitle((String)newValue);
				return;
			case HtmlPackage.HEAD__BASE:
				setBase((String)newValue);
				return;
			case HtmlPackage.HEAD__METAS:
				getMetas().clear();
				getMetas().addAll((Collection<? extends Meta>)newValue);
				return;
			case HtmlPackage.HEAD__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case HtmlPackage.HEAD__STYLESHEETS:
				getStylesheets().clear();
				getStylesheets().addAll((Collection<? extends Stylesheet>)newValue);
				return;
			case HtmlPackage.HEAD__IMPORT_MAP:
				setImportMap((ImportMap)newValue);
				return;
			case HtmlPackage.HEAD__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Script>)newValue);
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
			case HtmlPackage.HEAD__CONTENTS:
				getContents().clear();
				return;
			case HtmlPackage.HEAD__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case HtmlPackage.HEAD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case HtmlPackage.HEAD__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case HtmlPackage.HEAD__METAS:
				getMetas().clear();
				return;
			case HtmlPackage.HEAD__LINKS:
				getLinks().clear();
				return;
			case HtmlPackage.HEAD__STYLESHEETS:
				getStylesheets().clear();
				return;
			case HtmlPackage.HEAD__IMPORT_MAP:
				setImportMap((ImportMap)null);
				return;
			case HtmlPackage.HEAD__SCRIPTS:
				getScripts().clear();
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
			case HtmlPackage.HEAD__CONTENTS:
				return !getContents().isEmpty();
			case HtmlPackage.HEAD__CHARSET:
				return CHARSET_EDEFAULT == null ? getCharset() != null : !CHARSET_EDEFAULT.equals(getCharset());
			case HtmlPackage.HEAD__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case HtmlPackage.HEAD__BASE:
				return BASE_EDEFAULT == null ? getBase() != null : !BASE_EDEFAULT.equals(getBase());
			case HtmlPackage.HEAD__METAS:
				return !getMetas().isEmpty();
			case HtmlPackage.HEAD__LINKS:
				return !getLinks().isEmpty();
			case HtmlPackage.HEAD__STYLESHEETS:
				return !getStylesheets().isEmpty();
			case HtmlPackage.HEAD__IMPORT_MAP:
				return getImportMap() != null;
			case HtmlPackage.HEAD__SCRIPTS:
				return !getScripts().isEmpty();
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
				case HtmlPackage.HEAD__CONTENTS: return HtmlPackage.CONTAINER__CONTENTS;
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
				case HtmlPackage.CONTAINER__CONTENTS: return HtmlPackage.HEAD__CONTENTS;
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
			case HtmlPackage.HEAD___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //HeadImpl
