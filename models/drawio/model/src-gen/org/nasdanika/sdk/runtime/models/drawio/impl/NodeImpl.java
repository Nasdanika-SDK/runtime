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
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Node;
import org.nasdanika.sdk.runtime.models.drawio.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.NodeImpl#isCollapsed <em>Collapsed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends org.nasdanika.sdk.runtime.models.diagram.impl.NodeImpl implements Node {
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
	 * The default value of the '{@link #isCollapsed() <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollapsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLAPSED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLink getLink() {
		return (AbstractLink)eDynamicGet(DrawioPackage.NODE__LINK, DrawioPackage.Literals.MODEL_ELEMENT__LINK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(AbstractLink newLink, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLink, DrawioPackage.NODE__LINK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(AbstractLink newLink) {
		eDynamicSet(DrawioPackage.NODE__LINK, DrawioPackage.Literals.MODEL_ELEMENT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.NODE__TAGS, DrawioPackage.Literals.MODEL_ELEMENT__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return (String)eDynamicGet(DrawioPackage.NODE__STYLE, DrawioPackage.Literals.NODE__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		eDynamicSet(DrawioPackage.NODE__STYLE, DrawioPackage.Literals.NODE__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(DrawioPackage.NODE__LABEL, DrawioPackage.Literals.NODE__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(DrawioPackage.NODE__LABEL, DrawioPackage.Literals.NODE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsed() {
		return (Boolean)eDynamicGet(DrawioPackage.NODE__COLLAPSED, DrawioPackage.Literals.NODE__COLLAPSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsed(boolean newCollapsed) {
		eDynamicSet(DrawioPackage.NODE__COLLAPSED, DrawioPackage.Literals.NODE__COLLAPSED, newCollapsed);
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
			case DrawioPackage.NODE__TAGS:
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
			case DrawioPackage.NODE__LINK:
				return basicSetLink(null, msgs);
			case DrawioPackage.NODE__TAGS:
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
			case DrawioPackage.NODE__LINK:
				return getLink();
			case DrawioPackage.NODE__TAGS:
				return getTags();
			case DrawioPackage.NODE__STYLE:
				return getStyle();
			case DrawioPackage.NODE__LABEL:
				return getLabel();
			case DrawioPackage.NODE__COLLAPSED:
				return isCollapsed();
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
			case DrawioPackage.NODE__LINK:
				setLink((AbstractLink)newValue);
				return;
			case DrawioPackage.NODE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case DrawioPackage.NODE__STYLE:
				setStyle((String)newValue);
				return;
			case DrawioPackage.NODE__LABEL:
				setLabel((String)newValue);
				return;
			case DrawioPackage.NODE__COLLAPSED:
				setCollapsed((Boolean)newValue);
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
			case DrawioPackage.NODE__LINK:
				setLink((AbstractLink)null);
				return;
			case DrawioPackage.NODE__TAGS:
				getTags().clear();
				return;
			case DrawioPackage.NODE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case DrawioPackage.NODE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DrawioPackage.NODE__COLLAPSED:
				setCollapsed(COLLAPSED_EDEFAULT);
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
			case DrawioPackage.NODE__LINK:
				return getLink() != null;
			case DrawioPackage.NODE__TAGS:
				return !getTags().isEmpty();
			case DrawioPackage.NODE__STYLE:
				return STYLE_EDEFAULT == null ? getStyle() != null : !STYLE_EDEFAULT.equals(getStyle());
			case DrawioPackage.NODE__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case DrawioPackage.NODE__COLLAPSED:
				return isCollapsed() != COLLAPSED_EDEFAULT;
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
				case DrawioPackage.NODE__LINK: return DrawioPackage.MODEL_ELEMENT__LINK;
				case DrawioPackage.NODE__TAGS: return DrawioPackage.MODEL_ELEMENT__TAGS;
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
				case DrawioPackage.MODEL_ELEMENT__LINK: return DrawioPackage.NODE__LINK;
				case DrawioPackage.MODEL_ELEMENT__TAGS: return DrawioPackage.NODE__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NodeImpl
