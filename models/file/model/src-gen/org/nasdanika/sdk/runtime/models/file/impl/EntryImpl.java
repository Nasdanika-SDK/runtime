/**
 */
package org.nasdanika.sdk.runtime.models.file.impl;

import java.lang.reflect.InvocationTargetException;

import java.time.Instant;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.sdk.runtime.models.file.Directory;
import org.nasdanika.sdk.runtime.models.file.Entry;
import org.nasdanika.sdk.runtime.models.file.FilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.EntryImpl#isLive <em>Live</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached setting delegate for the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PATH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilePackage.Literals.ENTRY__PATH).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HASH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilePackage.Literals.ENTRY__HASH).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MODIFIED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilePackage.Literals.ENTRY__MODIFIED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isLive() <em>Live</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLive()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate LIVE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilePackage.Literals.ENTRY__LIVE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.ENTRY;
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
	public String getName() {
		return (String)eDynamicGet(FilePackage.ENTRY__NAME, FilePackage.Literals.ENTRY__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(FilePackage.ENTRY__NAME, FilePackage.Literals.ENTRY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return (String)eDynamicGet(FilePackage.ENTRY__PATH, FilePackage.Literals.ENTRY__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHash() {
		return (String)eDynamicGet(FilePackage.ENTRY__HASH, FilePackage.Literals.ENTRY__HASH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getModified() {
		return (Instant)eDynamicGet(FilePackage.ENTRY__MODIFIED, FilePackage.Literals.ENTRY__MODIFIED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLive() {
		return (Boolean)eDynamicGet(FilePackage.ENTRY__LIVE, FilePackage.Literals.ENTRY__LIVE, true, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #snapshot() <em>Snapshot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #snapshot()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SNAPSHOT__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.ENTRY___SNAPSHOT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry snapshot() {
		try {
			return (Entry)SNAPSHOT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #delete()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DELETE__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.ENTRY___DELETE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete() {
		try {
			DELETE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #moveTo(org.nasdanika.sdk.runtime.models.file.Directory, java.lang.String) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #moveTo(org.nasdanika.sdk.runtime.models.file.Directory, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MOVE_TO_DIRECTORY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.ENTRY___MOVE_TO__DIRECTORY_STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void moveTo(Directory target, String newName) {
		try {
			MOVE_TO_DIRECTORY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{target, newName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilePackage.ENTRY__NAME:
				return getName();
			case FilePackage.ENTRY__PATH:
				return getPath();
			case FilePackage.ENTRY__HASH:
				return getHash();
			case FilePackage.ENTRY__MODIFIED:
				return getModified();
			case FilePackage.ENTRY__LIVE:
				return isLive();
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
			case FilePackage.ENTRY__NAME:
				setName((String)newValue);
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
			case FilePackage.ENTRY__NAME:
				setName(NAME_EDEFAULT);
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
			case FilePackage.ENTRY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case FilePackage.ENTRY__PATH:
				return PATH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FilePackage.ENTRY__HASH:
				return HASH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FilePackage.ENTRY__MODIFIED:
				return MODIFIED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FilePackage.ENTRY__LIVE:
				return LIVE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FilePackage.ENTRY___SNAPSHOT:
				return snapshot();
			case FilePackage.ENTRY___DELETE:
				delete();
				return null;
			case FilePackage.ENTRY___MOVE_TO__DIRECTORY_STRING:
				moveTo((Directory)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntryImpl
