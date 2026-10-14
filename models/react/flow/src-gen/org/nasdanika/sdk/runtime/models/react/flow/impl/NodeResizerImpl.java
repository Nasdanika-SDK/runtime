/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.NodeResizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Resizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl#isIsVisible <em>Is Visible</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl#isKeepAspectRatio <em>Keep Aspect Ratio</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.NodeResizerImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeResizerImpl extends FlowComponentImpl implements NodeResizer {
	/**
	 * The default value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinHeight() <em>Min Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isIsVisible() <em>Is Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VISIBLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isKeepAspectRatio() <em>Keep Aspect Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeepAspectRatio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEEP_ASPECT_RATIO_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.NODE_RESIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinWidth() {
		return (Double)eDynamicGet(FlowPackage.NODE_RESIZER__MIN_WIDTH, FlowPackage.Literals.NODE_RESIZER__MIN_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinWidth(double newMinWidth) {
		eDynamicSet(FlowPackage.NODE_RESIZER__MIN_WIDTH, FlowPackage.Literals.NODE_RESIZER__MIN_WIDTH, newMinWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinWidth() {
		eDynamicUnset(FlowPackage.NODE_RESIZER__MIN_WIDTH, FlowPackage.Literals.NODE_RESIZER__MIN_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinWidth() {
		return eDynamicIsSet(FlowPackage.NODE_RESIZER__MIN_WIDTH, FlowPackage.Literals.NODE_RESIZER__MIN_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinHeight() {
		return (Double)eDynamicGet(FlowPackage.NODE_RESIZER__MIN_HEIGHT, FlowPackage.Literals.NODE_RESIZER__MIN_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinHeight(double newMinHeight) {
		eDynamicSet(FlowPackage.NODE_RESIZER__MIN_HEIGHT, FlowPackage.Literals.NODE_RESIZER__MIN_HEIGHT, newMinHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinHeight() {
		eDynamicUnset(FlowPackage.NODE_RESIZER__MIN_HEIGHT, FlowPackage.Literals.NODE_RESIZER__MIN_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinHeight() {
		return eDynamicIsSet(FlowPackage.NODE_RESIZER__MIN_HEIGHT, FlowPackage.Literals.NODE_RESIZER__MIN_HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVisible() {
		return (Boolean)eDynamicGet(FlowPackage.NODE_RESIZER__IS_VISIBLE, FlowPackage.Literals.NODE_RESIZER__IS_VISIBLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVisible(boolean newIsVisible) {
		eDynamicSet(FlowPackage.NODE_RESIZER__IS_VISIBLE, FlowPackage.Literals.NODE_RESIZER__IS_VISIBLE, newIsVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsVisible() {
		eDynamicUnset(FlowPackage.NODE_RESIZER__IS_VISIBLE, FlowPackage.Literals.NODE_RESIZER__IS_VISIBLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsVisible() {
		return eDynamicIsSet(FlowPackage.NODE_RESIZER__IS_VISIBLE, FlowPackage.Literals.NODE_RESIZER__IS_VISIBLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeepAspectRatio() {
		return (Boolean)eDynamicGet(FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO, FlowPackage.Literals.NODE_RESIZER__KEEP_ASPECT_RATIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepAspectRatio(boolean newKeepAspectRatio) {
		eDynamicSet(FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO, FlowPackage.Literals.NODE_RESIZER__KEEP_ASPECT_RATIO, newKeepAspectRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeepAspectRatio() {
		eDynamicUnset(FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO, FlowPackage.Literals.NODE_RESIZER__KEEP_ASPECT_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeepAspectRatio() {
		return eDynamicIsSet(FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO, FlowPackage.Literals.NODE_RESIZER__KEEP_ASPECT_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return (String)eDynamicGet(FlowPackage.NODE_RESIZER__COLOR, FlowPackage.Literals.NODE_RESIZER__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		eDynamicSet(FlowPackage.NODE_RESIZER__COLOR, FlowPackage.Literals.NODE_RESIZER__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.NODE_RESIZER__MIN_WIDTH:
				return getMinWidth();
			case FlowPackage.NODE_RESIZER__MIN_HEIGHT:
				return getMinHeight();
			case FlowPackage.NODE_RESIZER__IS_VISIBLE:
				return isIsVisible();
			case FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO:
				return isKeepAspectRatio();
			case FlowPackage.NODE_RESIZER__COLOR:
				return getColor();
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
			case FlowPackage.NODE_RESIZER__MIN_WIDTH:
				setMinWidth((Double)newValue);
				return;
			case FlowPackage.NODE_RESIZER__MIN_HEIGHT:
				setMinHeight((Double)newValue);
				return;
			case FlowPackage.NODE_RESIZER__IS_VISIBLE:
				setIsVisible((Boolean)newValue);
				return;
			case FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO:
				setKeepAspectRatio((Boolean)newValue);
				return;
			case FlowPackage.NODE_RESIZER__COLOR:
				setColor((String)newValue);
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
			case FlowPackage.NODE_RESIZER__MIN_WIDTH:
				unsetMinWidth();
				return;
			case FlowPackage.NODE_RESIZER__MIN_HEIGHT:
				unsetMinHeight();
				return;
			case FlowPackage.NODE_RESIZER__IS_VISIBLE:
				unsetIsVisible();
				return;
			case FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO:
				unsetKeepAspectRatio();
				return;
			case FlowPackage.NODE_RESIZER__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case FlowPackage.NODE_RESIZER__MIN_WIDTH:
				return isSetMinWidth();
			case FlowPackage.NODE_RESIZER__MIN_HEIGHT:
				return isSetMinHeight();
			case FlowPackage.NODE_RESIZER__IS_VISIBLE:
				return isSetIsVisible();
			case FlowPackage.NODE_RESIZER__KEEP_ASPECT_RATIO:
				return isSetKeepAspectRatio();
			case FlowPackage.NODE_RESIZER__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
		}
		return super.eIsSet(featureID);
	}

} //NodeResizerImpl
