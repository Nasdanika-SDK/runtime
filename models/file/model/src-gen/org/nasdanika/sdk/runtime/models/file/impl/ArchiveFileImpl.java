/**
 */
package org.nasdanika.sdk.runtime.models.file.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.nasdanika.sdk.runtime.models.file.ArchiveFile;
import org.nasdanika.sdk.runtime.models.file.Directory;
import org.nasdanika.sdk.runtime.models.file.FilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive File</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ArchiveFileImpl extends FileImpl implements ArchiveFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.ARCHIVE_FILE;
	}

	/**
	 * The cached invocation delegate for the '{@link #open() <em>Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #open()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OPEN__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.ARCHIVE_FILE___OPEN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory open() {
		try {
			return (Directory)OPEN__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FilePackage.ARCHIVE_FILE___OPEN:
				return open();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArchiveFileImpl
