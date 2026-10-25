/**
 */
package org.nasdanika.sdk.runtime.models.presentation.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.sdk.runtime.models.diagram.impl.ConnectionImpl;

import org.nasdanika.sdk.runtime.models.presentation.ConnectorShape;
import org.nasdanika.sdk.runtime.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectorShapeImpl extends ConnectionImpl implements ConnectorShape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.CONNECTOR_SHAPE;
	}

} //ConnectorShapeImpl
