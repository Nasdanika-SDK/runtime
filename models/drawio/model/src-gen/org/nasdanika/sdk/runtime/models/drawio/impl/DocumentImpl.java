/**
 */
package org.nasdanika.sdk.runtime.models.drawio.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.sdk.runtime.common.DerivedSubsetEList;

import org.nasdanika.sdk.runtime.models.diagram.DiagramPackage;

import org.nasdanika.sdk.runtime.models.drawio.Document;
import org.nasdanika.sdk.runtime.models.drawio.DrawioPackage;
import org.nasdanika.sdk.runtime.models.drawio.Page;

import org.nasdanika.sdk.runtime.models.presentation.impl.PresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl#isCompressed <em>Compressed</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.drawio.impl.DocumentImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends PresentationImpl implements Document {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isCompressed() <em>Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompressed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPRESSED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawioPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return (String)eDynamicGet(DrawioPackage.DOCUMENT__HOST, DrawioPackage.Literals.DOCUMENT__HOST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		eDynamicSet(DrawioPackage.DOCUMENT__HOST, DrawioPackage.Literals.DOCUMENT__HOST, newHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgent() {
		return (String)eDynamicGet(DrawioPackage.DOCUMENT__AGENT, DrawioPackage.Literals.DOCUMENT__AGENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(String newAgent) {
		eDynamicSet(DrawioPackage.DOCUMENT__AGENT, DrawioPackage.Literals.DOCUMENT__AGENT, newAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eDynamicGet(DrawioPackage.DOCUMENT__VERSION, DrawioPackage.Literals.DOCUMENT__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eDynamicSet(DrawioPackage.DOCUMENT__VERSION, DrawioPackage.Literals.DOCUMENT__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompressed() {
		return (Boolean)eDynamicGet(DrawioPackage.DOCUMENT__COMPRESSED, DrawioPackage.Literals.DOCUMENT__COMPRESSED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressed(boolean newCompressed) {
		eDynamicSet(DrawioPackage.DOCUMENT__COMPRESSED, DrawioPackage.Literals.DOCUMENT__COMPRESSED, newCompressed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		return new DerivedSubsetEList<Page>(
			Page.class, 
			((InternalEObject) this), 
			DrawioPackage.DOCUMENT__PAGES, 
			DiagramPackage.DIAGRAM_ELEMENT__CHILDREN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawioPackage.DOCUMENT__HOST:
				return getHost();
			case DrawioPackage.DOCUMENT__AGENT:
				return getAgent();
			case DrawioPackage.DOCUMENT__VERSION:
				return getVersion();
			case DrawioPackage.DOCUMENT__COMPRESSED:
				return isCompressed();
			case DrawioPackage.DOCUMENT__PAGES:
				return getPages();
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
			case DrawioPackage.DOCUMENT__HOST:
				setHost((String)newValue);
				return;
			case DrawioPackage.DOCUMENT__AGENT:
				setAgent((String)newValue);
				return;
			case DrawioPackage.DOCUMENT__VERSION:
				setVersion((String)newValue);
				return;
			case DrawioPackage.DOCUMENT__COMPRESSED:
				setCompressed((Boolean)newValue);
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
			case DrawioPackage.DOCUMENT__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case DrawioPackage.DOCUMENT__AGENT:
				setAgent(AGENT_EDEFAULT);
				return;
			case DrawioPackage.DOCUMENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DrawioPackage.DOCUMENT__COMPRESSED:
				setCompressed(COMPRESSED_EDEFAULT);
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
			case DrawioPackage.DOCUMENT__HOST:
				return HOST_EDEFAULT == null ? getHost() != null : !HOST_EDEFAULT.equals(getHost());
			case DrawioPackage.DOCUMENT__AGENT:
				return AGENT_EDEFAULT == null ? getAgent() != null : !AGENT_EDEFAULT.equals(getAgent());
			case DrawioPackage.DOCUMENT__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case DrawioPackage.DOCUMENT__COMPRESSED:
				return isCompressed() != COMPRESSED_EDEFAULT;
			case DrawioPackage.DOCUMENT__PAGES:
				return !getPages().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentImpl
