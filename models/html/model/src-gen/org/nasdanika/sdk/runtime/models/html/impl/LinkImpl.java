/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getSizes <em>Sizes</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getCrossorigin <em>Crossorigin</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.LinkImpl#getIntegrity <em>Integrity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends VoidElementImpl implements Link {
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
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

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
	 * The default value of the '{@link #getMedia() <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSizes() <em>Sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizes()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZES_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRel() {
		return (String)eDynamicGet(HtmlPackage.LINK__REL, HtmlPackage.Literals.LINK__REL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(String newRel) {
		eDynamicSet(HtmlPackage.LINK__REL, HtmlPackage.Literals.LINK__REL, newRel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return (String)eDynamicGet(HtmlPackage.LINK__HREF, HtmlPackage.Literals.LINK__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		eDynamicSet(HtmlPackage.LINK__HREF, HtmlPackage.Literals.LINK__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(HtmlPackage.LINK__TYPE, HtmlPackage.Literals.LINK__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(HtmlPackage.LINK__TYPE, HtmlPackage.Literals.LINK__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedia() {
		return (String)eDynamicGet(HtmlPackage.LINK__MEDIA, HtmlPackage.Literals.LINK__MEDIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(String newMedia) {
		eDynamicSet(HtmlPackage.LINK__MEDIA, HtmlPackage.Literals.LINK__MEDIA, newMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSizes() {
		return (String)eDynamicGet(HtmlPackage.LINK__SIZES, HtmlPackage.Literals.LINK__SIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizes(String newSizes) {
		eDynamicSet(HtmlPackage.LINK__SIZES, HtmlPackage.Literals.LINK__SIZES, newSizes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrossorigin() {
		return (String)eDynamicGet(HtmlPackage.LINK__CROSSORIGIN, HtmlPackage.Literals.LINK__CROSSORIGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossorigin(String newCrossorigin) {
		eDynamicSet(HtmlPackage.LINK__CROSSORIGIN, HtmlPackage.Literals.LINK__CROSSORIGIN, newCrossorigin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegrity() {
		return (String)eDynamicGet(HtmlPackage.LINK__INTEGRITY, HtmlPackage.Literals.LINK__INTEGRITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrity(String newIntegrity) {
		eDynamicSet(HtmlPackage.LINK__INTEGRITY, HtmlPackage.Literals.LINK__INTEGRITY, newIntegrity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "link";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.LINK__REL:
				return getRel();
			case HtmlPackage.LINK__HREF:
				return getHref();
			case HtmlPackage.LINK__TYPE:
				return getType();
			case HtmlPackage.LINK__MEDIA:
				return getMedia();
			case HtmlPackage.LINK__SIZES:
				return getSizes();
			case HtmlPackage.LINK__CROSSORIGIN:
				return getCrossorigin();
			case HtmlPackage.LINK__INTEGRITY:
				return getIntegrity();
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
			case HtmlPackage.LINK__REL:
				setRel((String)newValue);
				return;
			case HtmlPackage.LINK__HREF:
				setHref((String)newValue);
				return;
			case HtmlPackage.LINK__TYPE:
				setType((String)newValue);
				return;
			case HtmlPackage.LINK__MEDIA:
				setMedia((String)newValue);
				return;
			case HtmlPackage.LINK__SIZES:
				setSizes((String)newValue);
				return;
			case HtmlPackage.LINK__CROSSORIGIN:
				setCrossorigin((String)newValue);
				return;
			case HtmlPackage.LINK__INTEGRITY:
				setIntegrity((String)newValue);
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
			case HtmlPackage.LINK__REL:
				setRel(REL_EDEFAULT);
				return;
			case HtmlPackage.LINK__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case HtmlPackage.LINK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HtmlPackage.LINK__MEDIA:
				setMedia(MEDIA_EDEFAULT);
				return;
			case HtmlPackage.LINK__SIZES:
				setSizes(SIZES_EDEFAULT);
				return;
			case HtmlPackage.LINK__CROSSORIGIN:
				setCrossorigin(CROSSORIGIN_EDEFAULT);
				return;
			case HtmlPackage.LINK__INTEGRITY:
				setIntegrity(INTEGRITY_EDEFAULT);
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
			case HtmlPackage.LINK__REL:
				return REL_EDEFAULT == null ? getRel() != null : !REL_EDEFAULT.equals(getRel());
			case HtmlPackage.LINK__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
			case HtmlPackage.LINK__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case HtmlPackage.LINK__MEDIA:
				return MEDIA_EDEFAULT == null ? getMedia() != null : !MEDIA_EDEFAULT.equals(getMedia());
			case HtmlPackage.LINK__SIZES:
				return SIZES_EDEFAULT == null ? getSizes() != null : !SIZES_EDEFAULT.equals(getSizes());
			case HtmlPackage.LINK__CROSSORIGIN:
				return CROSSORIGIN_EDEFAULT == null ? getCrossorigin() != null : !CROSSORIGIN_EDEFAULT.equals(getCrossorigin());
			case HtmlPackage.LINK__INTEGRITY:
				return INTEGRITY_EDEFAULT == null ? getIntegrity() != null : !INTEGRITY_EDEFAULT.equals(getIntegrity());
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
			case HtmlPackage.LINK___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkImpl
