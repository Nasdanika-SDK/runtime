/**
 */
package org.nasdanika.sdk.runtime.models.react.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.react.flow.EdgeMarker;
import org.nasdanika.sdk.runtime.models.react.flow.FlowPackage;
import org.nasdanika.sdk.runtime.models.react.flow.MarkerKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.react.flow.impl.EdgeMarkerImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeMarkerImpl extends MinimalEObjectImpl.Container implements EdgeMarker {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MarkerKind TYPE_EDEFAULT = MarkerKind.ARROW;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double STROKE_WIDTH_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeMarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.EDGE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkerKind getType() {
		return (MarkerKind)eDynamicGet(FlowPackage.EDGE_MARKER__TYPE, FlowPackage.Literals.EDGE_MARKER__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MarkerKind newType) {
		eDynamicSet(FlowPackage.EDGE_MARKER__TYPE, FlowPackage.Literals.EDGE_MARKER__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		eDynamicUnset(FlowPackage.EDGE_MARKER__TYPE, FlowPackage.Literals.EDGE_MARKER__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return eDynamicIsSet(FlowPackage.EDGE_MARKER__TYPE, FlowPackage.Literals.EDGE_MARKER__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return (String)eDynamicGet(FlowPackage.EDGE_MARKER__COLOR, FlowPackage.Literals.EDGE_MARKER__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		eDynamicSet(FlowPackage.EDGE_MARKER__COLOR, FlowPackage.Literals.EDGE_MARKER__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eDynamicGet(FlowPackage.EDGE_MARKER__WIDTH, FlowPackage.Literals.EDGE_MARKER__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eDynamicSet(FlowPackage.EDGE_MARKER__WIDTH, FlowPackage.Literals.EDGE_MARKER__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		eDynamicUnset(FlowPackage.EDGE_MARKER__WIDTH, FlowPackage.Literals.EDGE_MARKER__WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return eDynamicIsSet(FlowPackage.EDGE_MARKER__WIDTH, FlowPackage.Literals.EDGE_MARKER__WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eDynamicGet(FlowPackage.EDGE_MARKER__HEIGHT, FlowPackage.Literals.EDGE_MARKER__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eDynamicSet(FlowPackage.EDGE_MARKER__HEIGHT, FlowPackage.Literals.EDGE_MARKER__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeight() {
		eDynamicUnset(FlowPackage.EDGE_MARKER__HEIGHT, FlowPackage.Literals.EDGE_MARKER__HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeight() {
		return eDynamicIsSet(FlowPackage.EDGE_MARKER__HEIGHT, FlowPackage.Literals.EDGE_MARKER__HEIGHT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStrokeWidth() {
		return (Double)eDynamicGet(FlowPackage.EDGE_MARKER__STROKE_WIDTH, FlowPackage.Literals.EDGE_MARKER__STROKE_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(double newStrokeWidth) {
		eDynamicSet(FlowPackage.EDGE_MARKER__STROKE_WIDTH, FlowPackage.Literals.EDGE_MARKER__STROKE_WIDTH, newStrokeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrokeWidth() {
		eDynamicUnset(FlowPackage.EDGE_MARKER__STROKE_WIDTH, FlowPackage.Literals.EDGE_MARKER__STROKE_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrokeWidth() {
		return eDynamicIsSet(FlowPackage.EDGE_MARKER__STROKE_WIDTH, FlowPackage.Literals.EDGE_MARKER__STROKE_WIDTH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.EDGE_MARKER__TYPE:
				return getType();
			case FlowPackage.EDGE_MARKER__COLOR:
				return getColor();
			case FlowPackage.EDGE_MARKER__WIDTH:
				return getWidth();
			case FlowPackage.EDGE_MARKER__HEIGHT:
				return getHeight();
			case FlowPackage.EDGE_MARKER__STROKE_WIDTH:
				return getStrokeWidth();
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
			case FlowPackage.EDGE_MARKER__TYPE:
				setType((MarkerKind)newValue);
				return;
			case FlowPackage.EDGE_MARKER__COLOR:
				setColor((String)newValue);
				return;
			case FlowPackage.EDGE_MARKER__WIDTH:
				setWidth((Double)newValue);
				return;
			case FlowPackage.EDGE_MARKER__HEIGHT:
				setHeight((Double)newValue);
				return;
			case FlowPackage.EDGE_MARKER__STROKE_WIDTH:
				setStrokeWidth((Double)newValue);
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
			case FlowPackage.EDGE_MARKER__TYPE:
				unsetType();
				return;
			case FlowPackage.EDGE_MARKER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case FlowPackage.EDGE_MARKER__WIDTH:
				unsetWidth();
				return;
			case FlowPackage.EDGE_MARKER__HEIGHT:
				unsetHeight();
				return;
			case FlowPackage.EDGE_MARKER__STROKE_WIDTH:
				unsetStrokeWidth();
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
			case FlowPackage.EDGE_MARKER__TYPE:
				return isSetType();
			case FlowPackage.EDGE_MARKER__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case FlowPackage.EDGE_MARKER__WIDTH:
				return isSetWidth();
			case FlowPackage.EDGE_MARKER__HEIGHT:
				return isSetHeight();
			case FlowPackage.EDGE_MARKER__STROKE_WIDTH:
				return isSetStrokeWidth();
		}
		return super.eIsSet(featureID);
	}

} //EdgeMarkerImpl
