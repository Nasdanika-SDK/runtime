/**
 */
package org.nasdanika.sdk.runtime.models.file.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.nasdanika.sdk.runtime.models.file.FilePackage;
import org.nasdanika.sdk.runtime.models.file.LineSeparator;
import org.nasdanika.sdk.runtime.models.file.Match;
import org.nasdanika.sdk.runtime.models.file.TextFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.file.impl.TextFileImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFileImpl extends FileImpl implements TextFile {
	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = "UTF-8";

	/**
	 * The default value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final LineSeparator LINE_SEPARATOR_EDEFAULT = LineSeparator.LF;

	/**
	 * The cached setting delegate for the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TEXT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilePackage.Literals.TEXT_FILE__TEXT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilePackage.Literals.TEXT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharset() {
		return (String)eDynamicGet(FilePackage.TEXT_FILE__CHARSET, FilePackage.Literals.TEXT_FILE__CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharset(String newCharset) {
		eDynamicSet(FilePackage.TEXT_FILE__CHARSET, FilePackage.Literals.TEXT_FILE__CHARSET, newCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineSeparator getLineSeparator() {
		return (LineSeparator)eDynamicGet(FilePackage.TEXT_FILE__LINE_SEPARATOR, FilePackage.Literals.TEXT_FILE__LINE_SEPARATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineSeparator(LineSeparator newLineSeparator) {
		eDynamicSet(FilePackage.TEXT_FILE__LINE_SEPARATOR, FilePackage.Literals.TEXT_FILE__LINE_SEPARATOR, newLineSeparator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eDynamicGet(FilePackage.TEXT_FILE__TEXT, FilePackage.Literals.TEXT_FILE__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eDynamicSet(FilePackage.TEXT_FILE__TEXT, FilePackage.Literals.TEXT_FILE__TEXT, newText);
	}

	/**
	 * The cached invocation delegate for the '{@link #lineCount() <em>Line Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lineCount()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LINE_COUNT__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.TEXT_FILE___LINE_COUNT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lineCount() {
		try {
			return (Integer)LINE_COUNT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #view(int, int) <em>View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #view(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VIEW_INT_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.TEXT_FILE___VIEW__INT_INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String view(int startLine, int endLine) {
		try {
			return (String)VIEW_INT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{startLine, endLine}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #replace(java.lang.String, java.lang.String) <em>Replace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #replace(java.lang.String, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REPLACE_STRING_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.TEXT_FILE___REPLACE__STRING_STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void replace(String oldText, String newText) {
		try {
			REPLACE_STRING_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{oldText, newText}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #insert(int, java.lang.CharSequence) <em>Insert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #insert(int, java.lang.CharSequence)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INSERT_INT_CHAR_SEQUENCE__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.TEXT_FILE___INSERT__INT_CHARSEQUENCE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void insert(int afterLine, CharSequence text) {
		try {
			INSERT_INT_CHAR_SEQUENCE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{afterLine, text}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #grep(java.lang.String) <em>Grep</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #grep(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GREP_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)FilePackage.Literals.TEXT_FILE___GREP__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Match> grep(String regex) {
		try {
			return (EList<Match>)GREP_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{regex}));
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
			case FilePackage.TEXT_FILE__CHARSET:
				return getCharset();
			case FilePackage.TEXT_FILE__LINE_SEPARATOR:
				return getLineSeparator();
			case FilePackage.TEXT_FILE__TEXT:
				return getText();
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
			case FilePackage.TEXT_FILE__CHARSET:
				setCharset((String)newValue);
				return;
			case FilePackage.TEXT_FILE__LINE_SEPARATOR:
				setLineSeparator((LineSeparator)newValue);
				return;
			case FilePackage.TEXT_FILE__TEXT:
				setText((String)newValue);
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
			case FilePackage.TEXT_FILE__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case FilePackage.TEXT_FILE__LINE_SEPARATOR:
				setLineSeparator(LINE_SEPARATOR_EDEFAULT);
				return;
			case FilePackage.TEXT_FILE__TEXT:
				TEXT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case FilePackage.TEXT_FILE__CHARSET:
				return CHARSET_EDEFAULT == null ? getCharset() != null : !CHARSET_EDEFAULT.equals(getCharset());
			case FilePackage.TEXT_FILE__LINE_SEPARATOR:
				return getLineSeparator() != LINE_SEPARATOR_EDEFAULT;
			case FilePackage.TEXT_FILE__TEXT:
				return TEXT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case FilePackage.TEXT_FILE___LINE_COUNT:
				return lineCount();
			case FilePackage.TEXT_FILE___VIEW__INT_INT:
				return view((Integer)arguments.get(0), (Integer)arguments.get(1));
			case FilePackage.TEXT_FILE___REPLACE__STRING_STRING:
				replace((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case FilePackage.TEXT_FILE___INSERT__INT_CHARSEQUENCE:
				insert((Integer)arguments.get(0), (CharSequence)arguments.get(1));
				return null;
			case FilePackage.TEXT_FILE___GREP__STRING:
				return grep((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TextFileImpl
