/**
 */
package org.nasdanika.sdk.runtime.models.meta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to a Classifier. `target` is set within a model; `namespace` plus
 * `classifierName` name one in a package this model does not contain, which is
 * what lets a package be loaded and projected on its own.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getClassifierName <em>Classifier Name</em>}</li>
 *   <li>{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClassifierReference()
 * @model
 * @generated
 */
public interface ClassifierReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Classifier)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClassifierReference_Target()
	 * @model
	 * @generated
	 */
	Classifier getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Classifier value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClassifierReference_Namespace()
	 * @model unique="false"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Classifier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier Name</em>' attribute.
	 * @see #setClassifierName(String)
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClassifierReference_ClassifierName()
	 * @model unique="false"
	 * @generated
	 */
	String getClassifierName();

	/**
	 * Sets the value of the '{@link org.nasdanika.sdk.runtime.models.meta.ClassifierReference#getClassifierName <em>Classifier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Name</em>' attribute.
	 * @see #getClassifierName()
	 * @generated
	 */
	void setClassifierName(String value);

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.sdk.runtime.models.meta.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see org.nasdanika.sdk.runtime.models.meta.MetaPackage#getClassifierReference_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getTypeArguments();

} // ClassifierReference
