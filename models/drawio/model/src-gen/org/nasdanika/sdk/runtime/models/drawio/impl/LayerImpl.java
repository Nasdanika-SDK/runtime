/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.drawio.AbstractLink;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Layer;
import org.nasdanika.sdk.runtime.models.drawio.LinkTarget;
import org.nasdanika.sdk.runtime.models.drawio.ModelElement;
import org.nasdanika.sdk.runtime.models.drawio.Tag;

import org.nasdanika.sdk.runtime.models.drawio.resource.Styles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl#getStyleString <em>Style String</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.LayerImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends org.nasdanika.sdk.runtime.models.diagram.impl.LayerImpl implements Layer {
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
	 * The default value of the '{@link #getStyleString() <em>Style String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleString()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_STRING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eDynamicGet(DrawioPackage.LAYER__LABEL, DrawioPackage.Literals.MODEL_ELEMENT__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eDynamicSet(DrawioPackage.LAYER__LABEL, DrawioPackage.Literals.MODEL_ELEMENT__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getStyle() {
		return (EMap<String, String>)eDynamicGet(DrawioPackage.LAYER__STYLE, DrawioPackage.Literals.MODEL_ELEMENT__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleString() {
		return Styles.format(this.getStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLink getLink() {
		return (AbstractLink)eDynamicGet(DrawioPackage.LAYER__LINK, DrawioPackage.Literals.MODEL_ELEMENT__LINK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(AbstractLink newLink, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLink, DrawioPackage.LAYER__LINK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(AbstractLink newLink) {
		eDynamicSet(DrawioPackage.LAYER__LINK, DrawioPackage.Literals.MODEL_ELEMENT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getTags() {
		return (EList<Tag>)eDynamicGet(DrawioPackage.LAYER__TAGS, DrawioPackage.Literals.MODEL_ELEMENT__TAGS, true, true);
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
			case DrawioPackage.LAYER__TAGS:
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
			case DrawioPackage.LAYER__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case DrawioPackage.LAYER__LINK:
				return basicSetLink(null, msgs);
			case DrawioPackage.LAYER__TAGS:
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
			case DrawioPackage.LAYER__LABEL:
				return getLabel();
			case DrawioPackage.LAYER__STYLE:
				if (coreType) return getStyle();
				else return getStyle().map();
			case DrawioPackage.LAYER__STYLE_STRING:
				return getStyleString();
			case DrawioPackage.LAYER__LINK:
				return getLink();
			case DrawioPackage.LAYER__TAGS:
				return getTags();
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
			case DrawioPackage.LAYER__LABEL:
				setLabel((String)newValue);
				return;
			case DrawioPackage.LAYER__STYLE:
				((EStructuralFeature.Setting)getStyle()).set(newValue);
				return;
			case DrawioPackage.LAYER__LINK:
				setLink((AbstractLink)newValue);
				return;
			case DrawioPackage.LAYER__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case DrawioPackage.LAYER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DrawioPackage.LAYER__STYLE:
				getStyle().clear();
				return;
			case DrawioPackage.LAYER__LINK:
				setLink((AbstractLink)null);
				return;
			case DrawioPackage.LAYER__TAGS:
				getTags().clear();
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
			case DrawioPackage.LAYER__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case DrawioPackage.LAYER__STYLE:
				return !getStyle().isEmpty();
			case DrawioPackage.LAYER__STYLE_STRING:
				return STYLE_STRING_EDEFAULT == null ? getStyleString() != null : !STYLE_STRING_EDEFAULT.equals(getStyleString());
			case DrawioPackage.LAYER__LINK:
				return getLink() != null;
			case DrawioPackage.LAYER__TAGS:
				return !getTags().isEmpty();
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
				case DrawioPackage.LAYER__LABEL: return DrawioPackage.MODEL_ELEMENT__LABEL;
				case DrawioPackage.LAYER__STYLE: return DrawioPackage.MODEL_ELEMENT__STYLE;
				case DrawioPackage.LAYER__STYLE_STRING: return DrawioPackage.MODEL_ELEMENT__STYLE_STRING;
				case DrawioPackage.LAYER__LINK: return DrawioPackage.MODEL_ELEMENT__LINK;
				case DrawioPackage.LAYER__TAGS: return DrawioPackage.MODEL_ELEMENT__TAGS;
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
				case DrawioPackage.MODEL_ELEMENT__LABEL: return DrawioPackage.LAYER__LABEL;
				case DrawioPackage.MODEL_ELEMENT__STYLE: return DrawioPackage.LAYER__STYLE;
				case DrawioPackage.MODEL_ELEMENT__STYLE_STRING: return DrawioPackage.LAYER__STYLE_STRING;
				case DrawioPackage.MODEL_ELEMENT__LINK: return DrawioPackage.LAYER__LINK;
				case DrawioPackage.MODEL_ELEMENT__TAGS: return DrawioPackage.LAYER__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LayerImpl
