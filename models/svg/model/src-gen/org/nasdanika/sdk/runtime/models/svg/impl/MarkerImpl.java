/**
 */
package org.nasdanika.sdk.runtime.models.svg.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.svg.Marker;
import org.nasdanika.sdk.runtime.models.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getViewBox <em>View Box</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getRefX <em>Ref X</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getRefY <em>Ref Y</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getMarkerWidth <em>Marker Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getMarkerHeight <em>Marker Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getOrient <em>Orient</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.svg.impl.MarkerImpl#getMarkerUnits <em>Marker Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkerImpl extends ContainerImpl implements Marker {
	/**
	 * The default value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_BOX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRefX() <em>Ref X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefX()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_X_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRefY() <em>Ref Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefY()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_Y_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkerWidth() <em>Marker Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkerHeight() <em>Marker Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_HEIGHT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrient() <em>Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrient()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMarkerUnits() <em>Marker Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkerUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKER_UNITS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewBox() {
		return (String)eDynamicGet(SvgPackage.MARKER__VIEW_BOX, SvgPackage.Literals.MARKER__VIEW_BOX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewBox(String newViewBox) {
		eDynamicSet(SvgPackage.MARKER__VIEW_BOX, SvgPackage.Literals.MARKER__VIEW_BOX, newViewBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefX() {
		return (String)eDynamicGet(SvgPackage.MARKER__REF_X, SvgPackage.Literals.MARKER__REF_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefX(String newRefX) {
		eDynamicSet(SvgPackage.MARKER__REF_X, SvgPackage.Literals.MARKER__REF_X, newRefX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefY() {
		return (String)eDynamicGet(SvgPackage.MARKER__REF_Y, SvgPackage.Literals.MARKER__REF_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefY(String newRefY) {
		eDynamicSet(SvgPackage.MARKER__REF_Y, SvgPackage.Literals.MARKER__REF_Y, newRefY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerWidth() {
		return (String)eDynamicGet(SvgPackage.MARKER__MARKER_WIDTH, SvgPackage.Literals.MARKER__MARKER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerWidth(String newMarkerWidth) {
		eDynamicSet(SvgPackage.MARKER__MARKER_WIDTH, SvgPackage.Literals.MARKER__MARKER_WIDTH, newMarkerWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerHeight() {
		return (String)eDynamicGet(SvgPackage.MARKER__MARKER_HEIGHT, SvgPackage.Literals.MARKER__MARKER_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerHeight(String newMarkerHeight) {
		eDynamicSet(SvgPackage.MARKER__MARKER_HEIGHT, SvgPackage.Literals.MARKER__MARKER_HEIGHT, newMarkerHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrient() {
		return (String)eDynamicGet(SvgPackage.MARKER__ORIENT, SvgPackage.Literals.MARKER__ORIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrient(String newOrient) {
		eDynamicSet(SvgPackage.MARKER__ORIENT, SvgPackage.Literals.MARKER__ORIENT, newOrient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkerUnits() {
		return (String)eDynamicGet(SvgPackage.MARKER__MARKER_UNITS, SvgPackage.Literals.MARKER__MARKER_UNITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkerUnits(String newMarkerUnits) {
		eDynamicSet(SvgPackage.MARKER__MARKER_UNITS, SvgPackage.Literals.MARKER__MARKER_UNITS, newMarkerUnits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.MARKER__VIEW_BOX:
				return getViewBox();
			case SvgPackage.MARKER__REF_X:
				return getRefX();
			case SvgPackage.MARKER__REF_Y:
				return getRefY();
			case SvgPackage.MARKER__MARKER_WIDTH:
				return getMarkerWidth();
			case SvgPackage.MARKER__MARKER_HEIGHT:
				return getMarkerHeight();
			case SvgPackage.MARKER__ORIENT:
				return getOrient();
			case SvgPackage.MARKER__MARKER_UNITS:
				return getMarkerUnits();
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
			case SvgPackage.MARKER__VIEW_BOX:
				setViewBox((String)newValue);
				return;
			case SvgPackage.MARKER__REF_X:
				setRefX((String)newValue);
				return;
			case SvgPackage.MARKER__REF_Y:
				setRefY((String)newValue);
				return;
			case SvgPackage.MARKER__MARKER_WIDTH:
				setMarkerWidth((String)newValue);
				return;
			case SvgPackage.MARKER__MARKER_HEIGHT:
				setMarkerHeight((String)newValue);
				return;
			case SvgPackage.MARKER__ORIENT:
				setOrient((String)newValue);
				return;
			case SvgPackage.MARKER__MARKER_UNITS:
				setMarkerUnits((String)newValue);
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
			case SvgPackage.MARKER__VIEW_BOX:
				setViewBox(VIEW_BOX_EDEFAULT);
				return;
			case SvgPackage.MARKER__REF_X:
				setRefX(REF_X_EDEFAULT);
				return;
			case SvgPackage.MARKER__REF_Y:
				setRefY(REF_Y_EDEFAULT);
				return;
			case SvgPackage.MARKER__MARKER_WIDTH:
				setMarkerWidth(MARKER_WIDTH_EDEFAULT);
				return;
			case SvgPackage.MARKER__MARKER_HEIGHT:
				setMarkerHeight(MARKER_HEIGHT_EDEFAULT);
				return;
			case SvgPackage.MARKER__ORIENT:
				setOrient(ORIENT_EDEFAULT);
				return;
			case SvgPackage.MARKER__MARKER_UNITS:
				setMarkerUnits(MARKER_UNITS_EDEFAULT);
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
			case SvgPackage.MARKER__VIEW_BOX:
				return VIEW_BOX_EDEFAULT == null ? getViewBox() != null : !VIEW_BOX_EDEFAULT.equals(getViewBox());
			case SvgPackage.MARKER__REF_X:
				return REF_X_EDEFAULT == null ? getRefX() != null : !REF_X_EDEFAULT.equals(getRefX());
			case SvgPackage.MARKER__REF_Y:
				return REF_Y_EDEFAULT == null ? getRefY() != null : !REF_Y_EDEFAULT.equals(getRefY());
			case SvgPackage.MARKER__MARKER_WIDTH:
				return MARKER_WIDTH_EDEFAULT == null ? getMarkerWidth() != null : !MARKER_WIDTH_EDEFAULT.equals(getMarkerWidth());
			case SvgPackage.MARKER__MARKER_HEIGHT:
				return MARKER_HEIGHT_EDEFAULT == null ? getMarkerHeight() != null : !MARKER_HEIGHT_EDEFAULT.equals(getMarkerHeight());
			case SvgPackage.MARKER__ORIENT:
				return ORIENT_EDEFAULT == null ? getOrient() != null : !ORIENT_EDEFAULT.equals(getOrient());
			case SvgPackage.MARKER__MARKER_UNITS:
				return MARKER_UNITS_EDEFAULT == null ? getMarkerUnits() != null : !MARKER_UNITS_EDEFAULT.equals(getMarkerUnits());
		}
		return super.eIsSet(featureID);
	}

} //MarkerImpl
