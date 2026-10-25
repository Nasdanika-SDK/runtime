/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.diagram.impl.NodeImpl;

import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;
import org.nasdanika.sdk.runtime.models.presentation.Shape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl#isFlipHorizontal <em>Flip Horizontal</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.presentation.impl.ShapeImpl#isFlipVertical <em>Flip Vertical</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShapeImpl extends NodeImpl implements Shape {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isFlipHorizontal() <em>Flip Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlipHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLIP_HORIZONTAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFlipVertical() <em>Flip Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlipVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLIP_VERTICAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return (Integer)eDynamicGet(PresentationPackage.SHAPE__ORDER, PresentationPackage.Literals.SHAPE__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		eDynamicSet(PresentationPackage.SHAPE__ORDER, PresentationPackage.Literals.SHAPE__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotation() {
		return (Double)eDynamicGet(PresentationPackage.SHAPE__ROTATION, PresentationPackage.Literals.SHAPE__ROTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(double newRotation) {
		eDynamicSet(PresentationPackage.SHAPE__ROTATION, PresentationPackage.Literals.SHAPE__ROTATION, newRotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlipHorizontal() {
		return (Boolean)eDynamicGet(PresentationPackage.SHAPE__FLIP_HORIZONTAL, PresentationPackage.Literals.SHAPE__FLIP_HORIZONTAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlipHorizontal(boolean newFlipHorizontal) {
		eDynamicSet(PresentationPackage.SHAPE__FLIP_HORIZONTAL, PresentationPackage.Literals.SHAPE__FLIP_HORIZONTAL, newFlipHorizontal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlipVertical() {
		return (Boolean)eDynamicGet(PresentationPackage.SHAPE__FLIP_VERTICAL, PresentationPackage.Literals.SHAPE__FLIP_VERTICAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlipVertical(boolean newFlipVertical) {
		eDynamicSet(PresentationPackage.SHAPE__FLIP_VERTICAL, PresentationPackage.Literals.SHAPE__FLIP_VERTICAL, newFlipVertical);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.SHAPE__ORDER:
				return getOrder();
			case PresentationPackage.SHAPE__ROTATION:
				return getRotation();
			case PresentationPackage.SHAPE__FLIP_HORIZONTAL:
				return isFlipHorizontal();
			case PresentationPackage.SHAPE__FLIP_VERTICAL:
				return isFlipVertical();
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
			case PresentationPackage.SHAPE__ORDER:
				setOrder((Integer)newValue);
				return;
			case PresentationPackage.SHAPE__ROTATION:
				setRotation((Double)newValue);
				return;
			case PresentationPackage.SHAPE__FLIP_HORIZONTAL:
				setFlipHorizontal((Boolean)newValue);
				return;
			case PresentationPackage.SHAPE__FLIP_VERTICAL:
				setFlipVertical((Boolean)newValue);
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
			case PresentationPackage.SHAPE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case PresentationPackage.SHAPE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case PresentationPackage.SHAPE__FLIP_HORIZONTAL:
				setFlipHorizontal(FLIP_HORIZONTAL_EDEFAULT);
				return;
			case PresentationPackage.SHAPE__FLIP_VERTICAL:
				setFlipVertical(FLIP_VERTICAL_EDEFAULT);
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
			case PresentationPackage.SHAPE__ORDER:
				return getOrder() != ORDER_EDEFAULT;
			case PresentationPackage.SHAPE__ROTATION:
				return getRotation() != ROTATION_EDEFAULT;
			case PresentationPackage.SHAPE__FLIP_HORIZONTAL:
				return isFlipHorizontal() != FLIP_HORIZONTAL_EDEFAULT;
			case PresentationPackage.SHAPE__FLIP_VERTICAL:
				return isFlipVertical() != FLIP_VERTICAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ShapeImpl
