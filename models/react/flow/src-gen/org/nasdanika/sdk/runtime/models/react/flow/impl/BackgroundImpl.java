/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.react.flow.Background;
import org.nasdanika.sdk.runtime.models.react.flow.BackgroundVariant;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getGap <em>Gap</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.BackgroundImpl#getBackgroundId <em>Background Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundImpl extends FlowComponentImpl implements Background {
	/**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected static final BackgroundVariant VARIANT_EDEFAULT = BackgroundVariant.LINES;

	/**
	 * The default value of the '{@link #getGap() <em>Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGap()
	 * @generated
	 * @ordered
	 */
	protected static final double GAP_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double LINE_WIDTH_EDEFAULT = 0.0;

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
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BG_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBackgroundId() <em>Background Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundId()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.BACKGROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundVariant getVariant() {
		return (BackgroundVariant)eDynamicGet(FlowPackage.BACKGROUND__VARIANT, FlowPackage.Literals.BACKGROUND__VARIANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariant(BackgroundVariant newVariant) {
		eDynamicSet(FlowPackage.BACKGROUND__VARIANT, FlowPackage.Literals.BACKGROUND__VARIANT, newVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVariant() {
		eDynamicUnset(FlowPackage.BACKGROUND__VARIANT, FlowPackage.Literals.BACKGROUND__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVariant() {
		return eDynamicIsSet(FlowPackage.BACKGROUND__VARIANT, FlowPackage.Literals.BACKGROUND__VARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGap() {
		return (Double)eDynamicGet(FlowPackage.BACKGROUND__GAP, FlowPackage.Literals.BACKGROUND__GAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGap(double newGap) {
		eDynamicSet(FlowPackage.BACKGROUND__GAP, FlowPackage.Literals.BACKGROUND__GAP, newGap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGap() {
		eDynamicUnset(FlowPackage.BACKGROUND__GAP, FlowPackage.Literals.BACKGROUND__GAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGap() {
		return eDynamicIsSet(FlowPackage.BACKGROUND__GAP, FlowPackage.Literals.BACKGROUND__GAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return (Double)eDynamicGet(FlowPackage.BACKGROUND__SIZE, FlowPackage.Literals.BACKGROUND__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		eDynamicSet(FlowPackage.BACKGROUND__SIZE, FlowPackage.Literals.BACKGROUND__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		eDynamicUnset(FlowPackage.BACKGROUND__SIZE, FlowPackage.Literals.BACKGROUND__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return eDynamicIsSet(FlowPackage.BACKGROUND__SIZE, FlowPackage.Literals.BACKGROUND__SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLineWidth() {
		return (Double)eDynamicGet(FlowPackage.BACKGROUND__LINE_WIDTH, FlowPackage.Literals.BACKGROUND__LINE_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(double newLineWidth) {
		eDynamicSet(FlowPackage.BACKGROUND__LINE_WIDTH, FlowPackage.Literals.BACKGROUND__LINE_WIDTH, newLineWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineWidth() {
		eDynamicUnset(FlowPackage.BACKGROUND__LINE_WIDTH, FlowPackage.Literals.BACKGROUND__LINE_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineWidth() {
		return eDynamicIsSet(FlowPackage.BACKGROUND__LINE_WIDTH, FlowPackage.Literals.BACKGROUND__LINE_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return (String)eDynamicGet(FlowPackage.BACKGROUND__COLOR, FlowPackage.Literals.BACKGROUND__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		eDynamicSet(FlowPackage.BACKGROUND__COLOR, FlowPackage.Literals.BACKGROUND__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBgColor() {
		return (String)eDynamicGet(FlowPackage.BACKGROUND__BG_COLOR, FlowPackage.Literals.BACKGROUND__BG_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(String newBgColor) {
		eDynamicSet(FlowPackage.BACKGROUND__BG_COLOR, FlowPackage.Literals.BACKGROUND__BG_COLOR, newBgColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundId() {
		return (String)eDynamicGet(FlowPackage.BACKGROUND__BACKGROUND_ID, FlowPackage.Literals.BACKGROUND__BACKGROUND_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundId(String newBackgroundId) {
		eDynamicSet(FlowPackage.BACKGROUND__BACKGROUND_ID, FlowPackage.Literals.BACKGROUND__BACKGROUND_ID, newBackgroundId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.BACKGROUND__VARIANT:
				return getVariant();
			case FlowPackage.BACKGROUND__GAP:
				return getGap();
			case FlowPackage.BACKGROUND__SIZE:
				return getSize();
			case FlowPackage.BACKGROUND__LINE_WIDTH:
				return getLineWidth();
			case FlowPackage.BACKGROUND__COLOR:
				return getColor();
			case FlowPackage.BACKGROUND__BG_COLOR:
				return getBgColor();
			case FlowPackage.BACKGROUND__BACKGROUND_ID:
				return getBackgroundId();
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
			case FlowPackage.BACKGROUND__VARIANT:
				setVariant((BackgroundVariant)newValue);
				return;
			case FlowPackage.BACKGROUND__GAP:
				setGap((Double)newValue);
				return;
			case FlowPackage.BACKGROUND__SIZE:
				setSize((Double)newValue);
				return;
			case FlowPackage.BACKGROUND__LINE_WIDTH:
				setLineWidth((Double)newValue);
				return;
			case FlowPackage.BACKGROUND__COLOR:
				setColor((String)newValue);
				return;
			case FlowPackage.BACKGROUND__BG_COLOR:
				setBgColor((String)newValue);
				return;
			case FlowPackage.BACKGROUND__BACKGROUND_ID:
				setBackgroundId((String)newValue);
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
			case FlowPackage.BACKGROUND__VARIANT:
				unsetVariant();
				return;
			case FlowPackage.BACKGROUND__GAP:
				unsetGap();
				return;
			case FlowPackage.BACKGROUND__SIZE:
				unsetSize();
				return;
			case FlowPackage.BACKGROUND__LINE_WIDTH:
				unsetLineWidth();
				return;
			case FlowPackage.BACKGROUND__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case FlowPackage.BACKGROUND__BG_COLOR:
				setBgColor(BG_COLOR_EDEFAULT);
				return;
			case FlowPackage.BACKGROUND__BACKGROUND_ID:
				setBackgroundId(BACKGROUND_ID_EDEFAULT);
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
			case FlowPackage.BACKGROUND__VARIANT:
				return isSetVariant();
			case FlowPackage.BACKGROUND__GAP:
				return isSetGap();
			case FlowPackage.BACKGROUND__SIZE:
				return isSetSize();
			case FlowPackage.BACKGROUND__LINE_WIDTH:
				return isSetLineWidth();
			case FlowPackage.BACKGROUND__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case FlowPackage.BACKGROUND__BG_COLOR:
				return BG_COLOR_EDEFAULT == null ? getBgColor() != null : !BG_COLOR_EDEFAULT.equals(getBgColor());
			case FlowPackage.BACKGROUND__BACKGROUND_ID:
				return BACKGROUND_ID_EDEFAULT == null ? getBackgroundId() != null : !BACKGROUND_ID_EDEFAULT.equals(getBackgroundId());
		}
		return super.eIsSet(featureID);
	}

} //BackgroundImpl
