/**
 */
package org.nasdanika.sdk.runtime.models.html.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.html.HtmlPackage;
import org.nasdanika.sdk.runtime.models.html.LineBreak;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LineBreakImpl extends VoidElementImpl implements LineBreak {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineBreakImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.LINE_BREAK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String tagName() {
		return "br";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HtmlPackage.LINE_BREAK___TAG_NAME:
				return tagName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LineBreakImpl
