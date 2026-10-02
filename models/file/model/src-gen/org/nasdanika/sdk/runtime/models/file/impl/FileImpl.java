/**
 */
package org.nasdanika.sdk.runtime.models.file.impl;

import java.io.InputStream;
import java.io.OutputStream;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.nasdanika.sdk.runtime.models.file.File;
import org.nasdanika.sdk.runtime.models.file.FilePackage;

import org.nasdanika.sdk.runtime.volume.Content;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.FileImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.FileImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.FileImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends EntryImpl implements File {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final Content CONTENT_EDEFAULT = null;

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
	 * The cached setting delegate for the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SIZE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilePackage.Literals.FILE__SIZE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content getContent() {
		return (Content)eDynamicGet(FilePackage.FILE__CONTENT, FilePackage.Literals.FILE__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(Content newContent) {
		eDynamicSet(FilePackage.FILE__CONTENT, FilePackage.Literals.FILE__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return (String)eDynamicGet(FilePackage.FILE__CONTENT_TYPE, FilePackage.Literals.FILE__CONTENT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		eDynamicSet(FilePackage.FILE__CONTENT_TYPE, FilePackage.Literals.FILE__CONTENT_TYPE, newContentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return (Long)eDynamicGet(FilePackage.FILE__SIZE, FilePackage.Literals.FILE__SIZE, true, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #openStream() <em>Open Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #openStream()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OPEN_STREAM__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.FILE___OPEN_STREAM).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream openStream() {
		try {
			return (InputStream)OPEN_STREAM__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #writeTo(java.io.OutputStream) <em>Write To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #writeTo(java.io.OutputStream)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate WRITE_TO_OUTPUT_STREAM__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.FILE___WRITE_TO__OUTPUTSTREAM).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeTo(OutputStream out) {
		try {
			WRITE_TO_OUTPUT_STREAM__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{out}));
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
			case FilePackage.FILE__CONTENT:
				return getContent();
			case FilePackage.FILE__CONTENT_TYPE:
				return getContentType();
			case FilePackage.FILE__SIZE:
				return getSize();
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
			case FilePackage.FILE__CONTENT:
				setContent((Content)newValue);
				return;
			case FilePackage.FILE__CONTENT_TYPE:
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
			case FilePackage.FILE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case FilePackage.FILE__CONTENT_TYPE:
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
			case FilePackage.FILE__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case FilePackage.FILE__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? getContentType() != null : !CONTENT_TYPE_EDEFAULT.equals(getContentType());
			case FilePackage.FILE__SIZE:
				return SIZE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case FilePackage.FILE___OPEN_STREAM:
				return openStream();
			case FilePackage.FILE___WRITE_TO__OUTPUTSTREAM:
				writeTo((OutputStream)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FileImpl
