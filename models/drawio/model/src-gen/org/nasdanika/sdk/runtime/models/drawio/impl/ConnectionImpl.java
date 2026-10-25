/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.drawio.AbstractLink;
import org.nasdanika.sdk.runtime.models.drawio.Connection;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.ConnectionImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends org.nasdanika.sdk.runtime.models.diagram.impl.ConnectionImpl implements Connection {
	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLink getLink() {
		return (AbstractLink)eDynamicGet(DrawioPackage.CONNECTION__LINK, DrawioPackage.Literals.MODEL_ELEMENT__LINK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(AbstractLink newLink, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLink, DrawioPackage.CONNECTION__LINK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(AbstractLink newLink) {
		eDynamicSet(DrawioPackage.CONNECTION__LINK, DrawioPackage.Literals.MODEL_ELEMENT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.CONNECTION__TAGS, DrawioPackage.Literals.MODEL_ELEMENT__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eDynamicGet(DrawioPackage.CONNECTION__STYLE, DrawioPackage.Literals.CONNECTION__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eDynamicSet(DrawioPackage.CONNECTION__STYLE, DrawioPackage.Literals.CONNECTION__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(DrawioPackage.CONNECTION__LABEL, DrawioPackage.Literals.CONNECTION__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(DrawioPackage.CONNECTION__LABEL, DrawioPackage.Literals.CONNECTION__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawioPackage.CONNECTION__TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTags()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawioPackage.CONNECTION__LINK:
				return basicSetLink(null, msgs);
			case DrawioPackage.CONNECTION__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case DrawioPackage.CONNECTION__LINK:
				return getLink();
			case DrawioPackage.CONNECTION__TAGS:
				return getTags();
			case DrawioPackage.CONNECTION__STYLE:
				return getStyle();
			case DrawioPackage.CONNECTION__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DrawioPackage.CONNECTION__LINK:
				setLink((AbstractLink)newValue);
				return;
			case DrawioPackage.CONNECTION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case DrawioPackage.CONNECTION__STYLE:
				setStyle((String)newValue);
				return;
			case DrawioPackage.CONNECTION__LABEL:
				setLabel((String)newValue);
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
			case DrawioPackage.CONNECTION__LINK:
				setLink((AbstractLink)null);
				return;
			case DrawioPackage.CONNECTION__TAGS:
				getTags().clear();
				return;
			case DrawioPackage.CONNECTION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case DrawioPackage.CONNECTION__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case DrawioPackage.CONNECTION__LINK:
				return getLink() != null;
			case DrawioPackage.CONNECTION__TAGS:
				return !getTags().isEmpty();
			case DrawioPackage.CONNECTION__STYLE:
				return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
			case DrawioPackage.CONNECTION__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
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
		if (baseClass == LinkTarget.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case DrawioPackage.CONNECTION__LINK: return DrawioPackage.MODEL_ELEMENT__LINK;
				case DrawioPackage.CONNECTION__TAGS: return DrawioPackage.MODEL_ELEMENT__TAGS;
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
		if (baseClass == LinkTarget.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case DrawioPackage.MODEL_ELEMENT__LINK: return DrawioPackage.CONNECTION__LINK;
				case DrawioPackage.MODEL_ELEMENT__TAGS: return DrawioPackage.CONNECTION__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionImpl
