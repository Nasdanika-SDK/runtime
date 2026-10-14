/**
 */
package org.nasdanika.sdk.runtime.models.react.flow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.sdk.runtime.models.react.flow.FlowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/model/src-gen' featureDelegation='Dynamic' complianceLevel='25' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.sdk.runtime.models.react'"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://runtime.sdk.nasdanika.org/models/react/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.sdk.runtime.models.react.flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.PlaceholderImpl <em>Placeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.PlaceholderImpl
	 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getPlaceholder()
	 * @generated
	 */
	int PLACEHOLDER = 0;

	/**
	 * The number of structural features of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Placeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEHOLDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.sdk.runtime.models.react.flow.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeholder</em>'.
	 * @see org.nasdanika.sdk.runtime.models.react.flow.Placeholder
	 * @generated
	 */
	EClass getPlaceholder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.sdk.runtime.models.react.flow.impl.PlaceholderImpl <em>Placeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.PlaceholderImpl
		 * @see org.nasdanika.sdk.runtime.models.react.flow.impl.FlowPackageImpl#getPlaceholder()
		 * @generated
		 */
		EClass PLACEHOLDER = eINSTANCE.getPlaceholder();

	}

} //FlowPackage
