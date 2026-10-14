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

import org.nasdanika.sdk.runtime.models.html.Anchor;
import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.AnchorImpl#getDownload <em>Download</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnchorImpl extends ElementImpl implements Anchor {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

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
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDownload() <em>Download</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownload()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnchorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.ANCHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getContents() {
		return (EList<Node>)eDynamicGet(HtmlPackage.ANCHOR__CONTENTS, HtmlPackage.Literals.CONTAINER__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(HtmlPackage.ANCHOR__HREF, HtmlPackage.Literals.ANCHOR__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(HtmlPackage.ANCHOR__HREF, HtmlPackage.Literals.ANCHOR__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eDynamicGet(HtmlPackage.ANCHOR__TARGET, HtmlPackage.Literals.ANCHOR__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eDynamicSet(HtmlPackage.ANCHOR__TARGET, HtmlPackage.Literals.ANCHOR__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRel() {
		return (String)eDynamicGet(HtmlPackage.ANCHOR__REL, HtmlPackage.Literals.ANCHOR__REL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(String newRel) {
		eDynamicSet(HtmlPackage.ANCHOR__REL, HtmlPackage.Literals.ANCHOR__REL, newRel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownload() {
		return (String)eDynamicGet(HtmlPackage.ANCHOR__DOWNLOAD, HtmlPackage.Literals.ANCHOR__DOWNLOAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownload(String newDownload) {
		eDynamicSet(HtmlPackage.ANCHOR__DOWNLOAD, HtmlPackage.Literals.ANCHOR__DOWNLOAD, newDownload);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "a";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.ANCHOR__CONTENTS:
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
			case HtmlPackage.ANCHOR__CONTENTS:
				return getContents();
			case HtmlPackage.ANCHOR__HREF:
				return getHref();
			case HtmlPackage.ANCHOR__TARGET:
				return getTarget();
			case HtmlPackage.ANCHOR__REL:
				return getRel();
			case HtmlPackage.ANCHOR__DOWNLOAD:
				return getDownload();
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
			case HtmlPackage.ANCHOR__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Node>)newValue);
				return;
			case HtmlPackage.ANCHOR__HREF:
				setHref((String)newValue);
				return;
			case HtmlPackage.ANCHOR__TARGET:
				setTarget((String)newValue);
				return;
			case HtmlPackage.ANCHOR__REL:
				setRel((String)newValue);
				return;
			case HtmlPackage.ANCHOR__DOWNLOAD:
				setDownload((String)newValue);
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
			case HtmlPackage.ANCHOR__CONTENTS:
				getContents().clear();
				return;
			case HtmlPackage.ANCHOR__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case HtmlPackage.ANCHOR__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case HtmlPackage.ANCHOR__REL:
				setRel(REL_EDEFAULT);
				return;
			case HtmlPackage.ANCHOR__DOWNLOAD:
				setDownload(DOWNLOAD_EDEFAULT);
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
			case HtmlPackage.ANCHOR__CONTENTS:
				return !getContents().isEmpty();
			case HtmlPackage.ANCHOR__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case HtmlPackage.ANCHOR__TARGET:
				return TARGET_EDEFAULT == null ? getTarget() != null : !TARGET_EDEFAULT.equals(getTarget());
			case HtmlPackage.ANCHOR__REL:
				return REL_EDEFAULT == null ? getRel() != null : !REL_EDEFAULT.equals(getRel());
			case HtmlPackage.ANCHOR__DOWNLOAD:
				return DOWNLOAD_EDEFAULT == null ? getDownload() != null : !DOWNLOAD_EDEFAULT.equals(getDownload());
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
				case HtmlPackage.ANCHOR__CONTENTS: return HtmlPackage.CONTAINER__CONTENTS;
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
				case HtmlPackage.CONTAINER__CONTENTS: return HtmlPackage.ANCHOR__CONTENTS;
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
			case HtmlPackage.ANCHOR___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnchorImpl
