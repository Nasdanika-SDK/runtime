/**
 */
package org.nasdanika.sdk.runtime.models.file.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.sdk.runtime.models.file.Directory;
import org.nasdanika.sdk.runtime.models.file.Entry;
import org.nasdanika.sdk.runtime.models.file.File;
import org.nasdanika.sdk.runtime.models.file.FilePackage;
import org.nasdanika.sdk.runtime.models.file.Match;

import org.nasdanika.sdk.runtime.volume.Content;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.DirectoryImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectoryImpl extends EntryImpl implements Directory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entry> getChildren() {
		return (EList<Entry>)eDynamicGet(FilePackage.DIRECTORY__CHILDREN, FilePackage.Literals.DIRECTORY__CHILDREN, true, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #list(java.lang.String, int, int) <em>List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #list(java.lang.String, int, int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LIST_STRING_INT_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.DIRECTORY___LIST__STRING_INT_INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entry> list(String glob, int offset, int limit) {
		try {
			return (EList<Entry>)LIST_STRING_INT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{glob, offset, limit}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #find(java.lang.String) <em>Find</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #find(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate FIND_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.DIRECTORY___FIND__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry find(String path) {
		try {
			return (Entry)FIND_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{path}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #glob(java.lang.String) <em>Glob</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #glob(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GLOB_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.DIRECTORY___GLOB__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entry> glob(String pattern) {
		try {
			return (EList<Entry>)GLOB_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{pattern}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #grep(java.lang.String, java.lang.String) <em>Grep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #grep(java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GREP_STRING_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.DIRECTORY___GREP__STRING_STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Match> grep(String regex, String glob) {
		try {
			return (EList<Match>)GREP_STRING_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{regex, glob}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #createFile(java.lang.String, org.nasdanika.sdk.runtime.volume.Content) <em>Create File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #createFile(java.lang.String, org.nasdanika.sdk.runtime.volume.Content)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CREATE_FILE_STRING_CONTENT__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.DIRECTORY___CREATE_FILE__STRING_CONTENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile(String name, Content content) {
		try {
			return (File)CREATE_FILE_STRING_CONTENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{name, content}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #createDirectory(java.lang.String) <em>Create Directory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #createDirectory(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CREATE_DIRECTORY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.DIRECTORY___CREATE_DIRECTORY__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory createDirectory(String name) {
		try {
			return (Directory)CREATE_DIRECTORY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{name}));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilePackage.DIRECTORY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case FilePackage.DIRECTORY__CHILDREN:
				return getChildren();
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
			case FilePackage.DIRECTORY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Entry>)newValue);
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
			case FilePackage.DIRECTORY__CHILDREN:
				getChildren().clear();
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
			case FilePackage.DIRECTORY__CHILDREN:
				return !getChildren().isEmpty();
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
			case FilePackage.DIRECTORY___LIST__STRING_INT_INT:
				return list((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case FilePackage.DIRECTORY___FIND__STRING:
				return find((String)arguments.get(0));
			case FilePackage.DIRECTORY___GLOB__STRING:
				return glob((String)arguments.get(0));
			case FilePackage.DIRECTORY___GREP__STRING_STRING:
				return grep((String)arguments.get(0), (String)arguments.get(1));
			case FilePackage.DIRECTORY___CREATE_FILE__STRING_CONTENT:
				return createFile((String)arguments.get(0), (Content)arguments.get(1));
			case FilePackage.DIRECTORY___CREATE_DIRECTORY__STRING:
				return createDirectory((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DirectoryImpl
