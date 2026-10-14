/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormText;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormTextImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormTextImpl#isMuted <em>Muted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormTextImpl extends BootstrapComponentImpl implements FormText {
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
	 * The default value of the '{@link #isMuted() <em>Muted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMuted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(FormsPackage.FORM_TEXT__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(FormsPackage.FORM_TEXT__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMuted() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_TEXT__MUTED, FormsPackage.Literals.FORM_TEXT__MUTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuted(boolean newMuted) {
		eDynamicSet(FormsPackage.FORM_TEXT__MUTED, FormsPackage.Literals.FORM_TEXT__MUTED, newMuted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.FORM_TEXT__CONTENT:
				return getContent();
			case FormsPackage.FORM_TEXT__MUTED:
				return isMuted();
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
			case FormsPackage.FORM_TEXT__CONTENT:
				setContent((String)newValue);
				return;
			case FormsPackage.FORM_TEXT__MUTED:
				setMuted((Boolean)newValue);
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
			case FormsPackage.FORM_TEXT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case FormsPackage.FORM_TEXT__MUTED:
				setMuted(MUTED_EDEFAULT);
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
			case FormsPackage.FORM_TEXT__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case FormsPackage.FORM_TEXT__MUTED:
				return isMuted() != MUTED_EDEFAULT;
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
				case FormsPackage.FORM_TEXT__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return FormsPackage.FORM_TEXT__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormTextImpl
