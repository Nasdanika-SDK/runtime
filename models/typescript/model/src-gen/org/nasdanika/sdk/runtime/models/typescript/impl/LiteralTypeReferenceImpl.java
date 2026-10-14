/**
 */
package org.nasdanika.sdk.runtime.models.typescript.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.typescript.LiteralKind;
import org.nasdanika.sdk.runtime.models.typescript.LiteralTypeReference;
import org.nasdanika.sdk.runtime.models.typescript.TypescriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.LiteralTypeReferenceImpl#getLiteralKind <em>Literal Kind</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.typescript.impl.LiteralTypeReferenceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralTypeReferenceImpl extends TypeReferenceImpl implements LiteralTypeReference {
	/**
	 * The default value of the '{@link #getLiteralKind() <em>Literal Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralKind()
	 * @generated
	 * @ordered
	 */
	protected static final LiteralKind LITERAL_KIND_EDEFAULT = LiteralKind.STRING;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralTypeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypescriptPackage.Literals.LITERAL_TYPE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralKind getLiteralKind() {
		return (LiteralKind)eDynamicGet(TypescriptPackage.LITERAL_TYPE_REFERENCE__LITERAL_KIND, TypescriptPackage.Literals.LITERAL_TYPE_REFERENCE__LITERAL_KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralKind(LiteralKind newLiteralKind) {
		eDynamicSet(TypescriptPackage.LITERAL_TYPE_REFERENCE__LITERAL_KIND, TypescriptPackage.Literals.LITERAL_TYPE_REFERENCE__LITERAL_KIND, newLiteralKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eDynamicGet(TypescriptPackage.LITERAL_TYPE_REFERENCE__VALUE, TypescriptPackage.Literals.LITERAL_TYPE_REFERENCE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eDynamicSet(TypescriptPackage.LITERAL_TYPE_REFERENCE__VALUE, TypescriptPackage.Literals.LITERAL_TYPE_REFERENCE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__LITERAL_KIND:
				return getLiteralKind();
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__VALUE:
				return getValue();
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
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__LITERAL_KIND:
				setLiteralKind((LiteralKind)newValue);
				return;
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__VALUE:
				setValue((String)newValue);
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
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__LITERAL_KIND:
				setLiteralKind(LITERAL_KIND_EDEFAULT);
				return;
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__LITERAL_KIND:
				return getLiteralKind() != LITERAL_KIND_EDEFAULT;
			case TypescriptPackage.LITERAL_TYPE_REFERENCE__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

} //LiteralTypeReferenceImpl
