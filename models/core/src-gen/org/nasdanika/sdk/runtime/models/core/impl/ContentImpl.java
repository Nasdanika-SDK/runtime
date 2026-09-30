/**
 */
package org.nasdanika.sdk.runtime.models.core.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.core.Content;
import org.nasdanika.sdk.runtime.models.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ContentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ContentImpl#getContentRef <em>Content Ref</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.core.impl.ContentImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content {
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
	 * The default value of the '{@link #getContentRef() <em>Content Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONTENT;
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
	@Override
	public String getContent() {
		return (String)eDynamicGet(CorePackage.CONTENT__CONTENT, CorePackage.Literals.CONTENT__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		eDynamicSet(CorePackage.CONTENT__CONTENT, CorePackage.Literals.CONTENT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentRef() {
		return (String)eDynamicGet(CorePackage.CONTENT__CONTENT_REF, CorePackage.Literals.CONTENT__CONTENT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentRef(String newContentRef) {
		eDynamicSet(CorePackage.CONTENT__CONTENT_REF, CorePackage.Literals.CONTENT__CONTENT_REF, newContentRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return (String)eDynamicGet(CorePackage.CONTENT__CONTENT_TYPE, CorePackage.Literals.CONTENT__CONTENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		eDynamicSet(CorePackage.CONTENT__CONTENT_TYPE, CorePackage.Literals.CONTENT__CONTENT_TYPE, newContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CONTENT__CONTENT:
				return getContent();
			case CorePackage.CONTENT__CONTENT_REF:
				return getContentRef();
			case CorePackage.CONTENT__CONTENT_TYPE:
				return getContentType();
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
			case CorePackage.CONTENT__CONTENT:
				setContent((String)newValue);
				return;
			case CorePackage.CONTENT__CONTENT_REF:
				setContentRef((String)newValue);
				return;
			case CorePackage.CONTENT__CONTENT_TYPE:
				setContentType((String)newValue);
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
			case CorePackage.CONTENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CorePackage.CONTENT__CONTENT_REF:
				setContentRef(CONTENT_REF_EDEFAULT);
				return;
			case CorePackage.CONTENT__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
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
			case CorePackage.CONTENT__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case CorePackage.CONTENT__CONTENT_REF:
				return CONTENT_REF_EDEFAULT == null ? getContentRef() != null : !CONTENT_REF_EDEFAULT.equals(getContentRef());
			case CorePackage.CONTENT__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? getContentType() != null : !CONTENT_TYPE_EDEFAULT.equals(getContentType());
		}
		return super.eIsSet(featureID);
	}

} //ContentImpl
