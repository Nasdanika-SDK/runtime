/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.Meta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl#getHttpEquiv <em>Http Equiv</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.html.impl.MetaImpl#getCharset <em>Charset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaImpl extends VoidElementImpl implements Meta {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHttpEquiv() <em>Http Equiv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpEquiv()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_EQUIV_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

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
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(HtmlPackage.META__NAME, HtmlPackage.Literals.META__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(HtmlPackage.META__NAME, HtmlPackage.Literals.META__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpEquiv() {
		return (String)eDynamicGet(HtmlPackage.META__HTTP_EQUIV, HtmlPackage.Literals.META__HTTP_EQUIV, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpEquiv(String newHttpEquiv) {
		eDynamicSet(HtmlPackage.META__HTTP_EQUIV, HtmlPackage.Literals.META__HTTP_EQUIV, newHttpEquiv);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		return (String)eDynamicGet(HtmlPackage.META__PROPERTY, HtmlPackage.Literals.META__PROPERTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		eDynamicSet(HtmlPackage.META__PROPERTY, HtmlPackage.Literals.META__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(HtmlPackage.META__CONTENT, HtmlPackage.Literals.META__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(HtmlPackage.META__CONTENT, HtmlPackage.Literals.META__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharset() {
		return (String)eDynamicGet(HtmlPackage.META__CHARSET, HtmlPackage.Literals.META__CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharset(String newCharset) {
		eDynamicSet(HtmlPackage.META__CHARSET, HtmlPackage.Literals.META__CHARSET, newCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "meta";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.META__NAME:
				return getName();
			case HtmlPackage.META__HTTP_EQUIV:
				return getHttpEquiv();
			case HtmlPackage.META__PROPERTY:
				return getProperty();
			case HtmlPackage.META__CONTENT:
				return getContent();
			case HtmlPackage.META__CHARSET:
				return getCharset();
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
			case HtmlPackage.META__NAME:
				setName((String)newValue);
				return;
			case HtmlPackage.META__HTTP_EQUIV:
				setHttpEquiv((String)newValue);
				return;
			case HtmlPackage.META__PROPERTY:
				setProperty((String)newValue);
				return;
			case HtmlPackage.META__CONTENT:
				setContent((String)newValue);
				return;
			case HtmlPackage.META__CHARSET:
				setCharset((String)newValue);
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
			case HtmlPackage.META__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HtmlPackage.META__HTTP_EQUIV:
				setHttpEquiv(HTTP_EQUIV_EDEFAULT);
				return;
			case HtmlPackage.META__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case HtmlPackage.META__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case HtmlPackage.META__CHARSET:
				setCharset(CHARSET_EDEFAULT);
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
			case HtmlPackage.META__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case HtmlPackage.META__HTTP_EQUIV:
				return HTTP_EQUIV_EDEFAULT == null ? getHttpEquiv() != null : !HTTP_EQUIV_EDEFAULT.equals(getHttpEquiv());
			case HtmlPackage.META__PROPERTY:
				return PROPERTY_EDEFAULT == null ? getProperty() != null : !PROPERTY_EDEFAULT.equals(getProperty());
			case HtmlPackage.META__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case HtmlPackage.META__CHARSET:
				return CHARSET_EDEFAULT == null ? getCharset() != null : !CHARSET_EDEFAULT.equals(getCharset());
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
			case HtmlPackage.META___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetaImpl
