/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;
import org.nasdanika.sdk.runtime.models.react.bootstrap.Variant;

import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.Alert;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.AlertHeading;
import org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.ContentPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.AlertImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.AlertImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.AlertImpl#isDismissible <em>Dismissible</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.AlertImpl#isShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.components.content.impl.AlertImpl#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlertImpl extends BootstrapComponentImpl implements Alert {
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
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final Variant VARIANT_EDEFAULT = Variant.PRIMARY;

	/**
	 * The default value of the '{@link #isDismissible() <em>Dismissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDismissible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISMISSIBLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.ALERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(ContentPackage.ALERT__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(ContentPackage.ALERT__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variant getVariant() {
		return (Variant)eDynamicGet(ContentPackage.ALERT__VARIANT, ContentPackage.Literals.ALERT__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(Variant newVariant) {
		eDynamicSet(ContentPackage.ALERT__VARIANT, ContentPackage.Literals.ALERT__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(ContentPackage.ALERT__VARIANT, ContentPackage.Literals.ALERT__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(ContentPackage.ALERT__VARIANT, ContentPackage.Literals.ALERT__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDismissible() {
		return (Boolean)eDynamicGet(ContentPackage.ALERT__DISMISSIBLE, ContentPackage.Literals.ALERT__DISMISSIBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDismissible(boolean newDismissible) {
		eDynamicSet(ContentPackage.ALERT__DISMISSIBLE, ContentPackage.Literals.ALERT__DISMISSIBLE, newDismissible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShow() {
		return (Boolean)eDynamicGet(ContentPackage.ALERT__SHOW, ContentPackage.Literals.ALERT__SHOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(boolean newShow) {
		eDynamicSet(ContentPackage.ALERT__SHOW, ContentPackage.Literals.ALERT__SHOW, newShow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		eDynamicUnset(ContentPackage.ALERT__SHOW, ContentPackage.Literals.ALERT__SHOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return eDynamicIsSet(ContentPackage.ALERT__SHOW, ContentPackage.Literals.ALERT__SHOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertHeading getHeading() {
		return (AlertHeading)eDynamicGet(ContentPackage.ALERT__HEADING, ContentPackage.Literals.ALERT__HEADING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(AlertHeading newHeading, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeading, ContentPackage.ALERT__HEADING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(AlertHeading newHeading) {
		eDynamicSet(ContentPackage.ALERT__HEADING, ContentPackage.Literals.ALERT__HEADING, newHeading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.ALERT__HEADING:
				return basicSetHeading(null, msgs);
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
			case ContentPackage.ALERT__CONTENT:
				return getContent();
			case ContentPackage.ALERT__VARIANT:
				return getVariant();
			case ContentPackage.ALERT__DISMISSIBLE:
				return isDismissible();
			case ContentPackage.ALERT__SHOW:
				return isShow();
			case ContentPackage.ALERT__HEADING:
				return getHeading();
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
			case ContentPackage.ALERT__CONTENT:
				setContent((String)newValue);
				return;
			case ContentPackage.ALERT__VARIANT:
				setVariant((Variant)newValue);
				return;
			case ContentPackage.ALERT__DISMISSIBLE:
				setDismissible((Boolean)newValue);
				return;
			case ContentPackage.ALERT__SHOW:
				setShow((Boolean)newValue);
				return;
			case ContentPackage.ALERT__HEADING:
				setHeading((AlertHeading)newValue);
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
			case ContentPackage.ALERT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ContentPackage.ALERT__VARIANT:
				unsetVariant();
				return;
			case ContentPackage.ALERT__DISMISSIBLE:
				setDismissible(DISMISSIBLE_EDEFAULT);
				return;
			case ContentPackage.ALERT__SHOW:
				unsetShow();
				return;
			case ContentPackage.ALERT__HEADING:
				setHeading((AlertHeading)null);
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
			case ContentPackage.ALERT__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case ContentPackage.ALERT__VARIANT:
				return isSetVariant();
			case ContentPackage.ALERT__DISMISSIBLE:
				return isDismissible() != DISMISSIBLE_EDEFAULT;
			case ContentPackage.ALERT__SHOW:
				return isSetShow();
			case ContentPackage.ALERT__HEADING:
				return getHeading() != null;
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
		if (baseClass == TextContent.class) {
			switch (derivedFeatureID) {
				case ContentPackage.ALERT__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
		if (baseClass == TextContent.class) {
			switch (baseFeatureID) {
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return ContentPackage.ALERT__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AlertImpl
