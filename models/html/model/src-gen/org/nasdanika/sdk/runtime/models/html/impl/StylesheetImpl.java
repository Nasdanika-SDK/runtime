/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Stylesheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stylesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl#getCrossorigin <em>Crossorigin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.StylesheetImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StylesheetImpl extends ElementImpl implements Stylesheet {
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
	 * The default value of the '{@link #getMedia() <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCrossorigin() <em>Crossorigin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossorigin()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSSORIGIN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StylesheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.STYLESHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(HtmlPackage.STYLESHEET__HREF, HtmlPackage.Literals.STYLESHEET__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(HtmlPackage.STYLESHEET__HREF, HtmlPackage.Literals.STYLESHEET__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedia() {
		return (String)eDynamicGet(HtmlPackage.STYLESHEET__MEDIA, HtmlPackage.Literals.STYLESHEET__MEDIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(String newMedia) {
		eDynamicSet(HtmlPackage.STYLESHEET__MEDIA, HtmlPackage.Literals.STYLESHEET__MEDIA, newMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrossorigin() {
		return (String)eDynamicGet(HtmlPackage.STYLESHEET__CROSSORIGIN, HtmlPackage.Literals.STYLESHEET__CROSSORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossorigin(String newCrossorigin) {
		eDynamicSet(HtmlPackage.STYLESHEET__CROSSORIGIN, HtmlPackage.Literals.STYLESHEET__CROSSORIGIN, newCrossorigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrity() {
		return (String)eDynamicGet(HtmlPackage.STYLESHEET__INTEGRITY, HtmlPackage.Literals.STYLESHEET__INTEGRITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrity(String newIntegrity) {
		eDynamicSet(HtmlPackage.STYLESHEET__INTEGRITY, HtmlPackage.Literals.STYLESHEET__INTEGRITY, newIntegrity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(HtmlPackage.STYLESHEET__CONTENT, HtmlPackage.Literals.STYLESHEET__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(HtmlPackage.STYLESHEET__CONTENT, HtmlPackage.Literals.STYLESHEET__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		String _xifexpression = null;
		String _href = this.getHref();
		boolean _tripleEquals = (_href == null);
		if (_tripleEquals) {
			_xifexpression = "style";
		}
		else {
			_xifexpression = "link";
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.STYLESHEET__HREF:
				return getHref();
			case HtmlPackage.STYLESHEET__MEDIA:
				return getMedia();
			case HtmlPackage.STYLESHEET__CROSSORIGIN:
				return getCrossorigin();
			case HtmlPackage.STYLESHEET__INTEGRITY:
				return getIntegrity();
			case HtmlPackage.STYLESHEET__CONTENT:
				return getContent();
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
			case HtmlPackage.STYLESHEET__HREF:
				setHref((String)newValue);
				return;
			case HtmlPackage.STYLESHEET__MEDIA:
				setMedia((String)newValue);
				return;
			case HtmlPackage.STYLESHEET__CROSSORIGIN:
				setCrossorigin((String)newValue);
				return;
			case HtmlPackage.STYLESHEET__INTEGRITY:
				setIntegrity((String)newValue);
				return;
			case HtmlPackage.STYLESHEET__CONTENT:
				setContent((String)newValue);
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
			case HtmlPackage.STYLESHEET__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case HtmlPackage.STYLESHEET__MEDIA:
				setMedia(MEDIA_EDEFAULT);
				return;
			case HtmlPackage.STYLESHEET__CROSSORIGIN:
				setCrossorigin(CROSSORIGIN_EDEFAULT);
				return;
			case HtmlPackage.STYLESHEET__INTEGRITY:
				setIntegrity(INTEGRITY_EDEFAULT);
				return;
			case HtmlPackage.STYLESHEET__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case HtmlPackage.STYLESHEET__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case HtmlPackage.STYLESHEET__MEDIA:
				return MEDIA_EDEFAULT == null ? getMedia() != null : !MEDIA_EDEFAULT.equals(getMedia());
			case HtmlPackage.STYLESHEET__CROSSORIGIN:
				return CROSSORIGIN_EDEFAULT == null ? getCrossorigin() != null : !CROSSORIGIN_EDEFAULT.equals(getCrossorigin());
			case HtmlPackage.STYLESHEET__INTEGRITY:
				return INTEGRITY_EDEFAULT == null ? getIntegrity() != null : !INTEGRITY_EDEFAULT.equals(getIntegrity());
			case HtmlPackage.STYLESHEET__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
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
			case HtmlPackage.STYLESHEET___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StylesheetImpl
