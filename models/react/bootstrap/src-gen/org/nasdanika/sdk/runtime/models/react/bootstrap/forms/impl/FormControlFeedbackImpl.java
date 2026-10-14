/**
 */
package org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.bootstrap.BootstrapPackage;
import org.nasdanika.sdk.runtime.models.react.bootstrap.TextContent;

import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FeedbackType;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormControlFeedback;
import org.nasdanika.sdk.runtime.models.react.bootstrap.forms.FormsPackage;

import org.nasdanika.sdk.runtime.models.react.bootstrap.impl.BootstrapComponentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Control Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.bootstrap.forms.impl.FormControlFeedbackImpl#isTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormControlFeedbackImpl extends BootstrapComponentImpl implements FormControlFeedback {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FeedbackType TYPE_EDEFAULT = FeedbackType.VALID;

	/**
	 * The default value of the '{@link #isTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOOLTIP_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormControlFeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.FORM_CONTROL_FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return (String)eDynamicGet(FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		eDynamicSet(FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT, BootstrapPackage.Literals.TEXT_CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackType getType() {
		return (FeedbackType)eDynamicGet(FormsPackage.FORM_CONTROL_FEEDBACK__TYPE, FormsPackage.Literals.FORM_CONTROL_FEEDBACK__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FeedbackType newType) {
		eDynamicSet(FormsPackage.FORM_CONTROL_FEEDBACK__TYPE, FormsPackage.Literals.FORM_CONTROL_FEEDBACK__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		eDynamicUnset(FormsPackage.FORM_CONTROL_FEEDBACK__TYPE, FormsPackage.Literals.FORM_CONTROL_FEEDBACK__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return eDynamicIsSet(FormsPackage.FORM_CONTROL_FEEDBACK__TYPE, FormsPackage.Literals.FORM_CONTROL_FEEDBACK__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTooltip() {
		return (Boolean)eDynamicGet(FormsPackage.FORM_CONTROL_FEEDBACK__TOOLTIP, FormsPackage.Literals.FORM_CONTROL_FEEDBACK__TOOLTIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(boolean newTooltip) {
		eDynamicSet(FormsPackage.FORM_CONTROL_FEEDBACK__TOOLTIP, FormsPackage.Literals.FORM_CONTROL_FEEDBACK__TOOLTIP, newTooltip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT:
				return getContent();
			case FormsPackage.FORM_CONTROL_FEEDBACK__TYPE:
				return getType();
			case FormsPackage.FORM_CONTROL_FEEDBACK__TOOLTIP:
				return isTooltip();
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
			case FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT:
				setContent((String)newValue);
				return;
			case FormsPackage.FORM_CONTROL_FEEDBACK__TYPE:
				setType((FeedbackType)newValue);
				return;
			case FormsPackage.FORM_CONTROL_FEEDBACK__TOOLTIP:
				setTooltip((Boolean)newValue);
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
			case FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case FormsPackage.FORM_CONTROL_FEEDBACK__TYPE:
				unsetType();
				return;
			case FormsPackage.FORM_CONTROL_FEEDBACK__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
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
			case FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case FormsPackage.FORM_CONTROL_FEEDBACK__TYPE:
				return isSetType();
			case FormsPackage.FORM_CONTROL_FEEDBACK__TOOLTIP:
				return isTooltip() != TOOLTIP_EDEFAULT;
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
				case FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT: return BootstrapPackage.TEXT_CONTENT__CONTENT;
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
				case BootstrapPackage.TEXT_CONTENT__CONTENT: return FormsPackage.FORM_CONTROL_FEEDBACK__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormControlFeedbackImpl
